package com.efounder.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleConnection {
        private Connection con ;
        private String user = "scott" ;
        private String password = "tiger" ;
        private String className = "oracle.jdbc.driver.OracleDriver" ;
        private String url = "jdbc:oracle:thin:@localhost:1521:orcl" ;// hr-PC和1521很关键,也就是侦听串里有没有这个

        public static void main(String[] args) throws SQLException {
               // TODO Auto-generated method stub
        	OracleConnection c = new OracleConnection();
            c.ConnectOracle();
            String sql = "select t.empno,t.ename,t.job,t.mgr,t.hiredate,t.sal,t.comm,t.deptno from scott.emp t";
            Connection con = null;
            PreparedStatement pre = null;
            ResultSet result = null;
            con=c.getCon();
            pre = con.prepareStatement(sql);
            result = pre.executeQuery();
            while(result.next())
            {
            	String empno = result.getString(1);
            	System.out.print(empno+"  ");
            }
            c.closed();
       }

        public void ConnectOracle() {
               try {
                     Class.forName(className);
                     System.out.println("加载数据库驱动成功！" );
              } catch (ClassNotFoundException e ) {
                     System.out.println("加载数据库驱动失败！" );
                      e.printStackTrace();
              }
       }
        /** 创建数据库连接 */
        public Connection getCon() {
               try {
                     con = DriverManager.getConnection(url, user, password);
                     System.out.println("创建数据库连接成功！" );
              } catch (SQLException e ) {
                     System.out.print(con );
                     System.out.println("创建数据库连接失败！" );
                     con = null;
                     e.printStackTrace();
              }
               return con ;
       }

        public void closed() {
               try {
                      if (con != null) {
                            con.close();
                     }
              } catch (SQLException e ) {
                     System.out.println("关闭con对象失败！" );
                     e.printStackTrace();
              }
       }

}