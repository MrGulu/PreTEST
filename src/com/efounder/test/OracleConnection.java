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
        private String url = "jdbc:oracle:thin:@localhost:1521:orcl" ;// hr-PC��1521�ܹؼ�,Ҳ��������������û�����

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
                     System.out.println("�������ݿ������ɹ���" );
              } catch (ClassNotFoundException e ) {
                     System.out.println("�������ݿ�����ʧ�ܣ�" );
                      e.printStackTrace();
              }
       }
        /** �������ݿ����� */
        public Connection getCon() {
               try {
                     con = DriverManager.getConnection(url, user, password);
                     System.out.println("�������ݿ����ӳɹ���" );
              } catch (SQLException e ) {
                     System.out.print(con );
                     System.out.println("�������ݿ�����ʧ�ܣ�" );
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
                     System.out.println("�ر�con����ʧ�ܣ�" );
                     e.printStackTrace();
              }
       }

}