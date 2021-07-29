// SE L'UTENTE È REGISTRATO PUÒ ACCEDERE, ALTRIMENTI SI DEVE REGISTRARE
// https://www.tutorialspoint.com/jdbc/jdbc-insert-records.htm
// https://stackoverflow.com/questions/21556594/convert-a-statement-into-a-prepared-statement-java

import java.sql.*;
import java.util.Scanner;


public class SignInOut {
//STEP 1. Import required packages

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/engigram";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "user";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Cosa vuoi fare?\n1) Registrati\n2) Accedi");
        int scelta = tastiera.nextInt();

        String user = "";
        String user2 = "";
        String pass = "";
        String pass2 = "";
        String email = "";

        switch (scelta){
            case 1:
                System.out.println("Inserisci uno username");
                user = tastiera.next();
                System.out.println("Inserisci una password");
                pass = tastiera.next();
                System.out.println("Inserisci una email");
                email = tastiera.next();
                try{
                    //STEP 2: Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");

                    //STEP 3: Open a connection
                    System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);

                    //STEP 4: Execute a query
                    System.out.println("Creating statement...");
                    stmt = conn.createStatement();
                    String sql;
                    sql = "INSERT INTO utenti VALUES (default, '" + user + "', '" + pass + "', '" + email + "')";
                    stmt.executeUpdate(sql);

                    //STEP 6: Clean-up environment
//                    rs.close();
//                    stmt.close();
//                    conn.close();
                }catch(SQLException se){
                    //Handle errors for JDBC
                    se.printStackTrace();
                }catch(Exception e){
                    //Handle errors for Class.forName
                    e.printStackTrace();
                }finally{
                    //finally block used to close resources
                    try{
                        if(stmt!=null)
                            conn.close();
                    }catch(SQLException se){
                    }// do nothing
                    try{
                        if(conn!=null)
                            conn.close();
                    }catch(SQLException se){
                        se.printStackTrace();
                    }//end finally try
                }//end try
                System.out.println("Registrato ");


                break;
            case 2:
                System.out.println("Inserisci uno username");
                user2 = tastiera.next();
                System.out.println("Inserisci una password");
                pass2 = tastiera.next();
                boolean autenticato = false;
                try{
                    //STEP 2: Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");

                    //STEP 3: Open a connection
                    System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);

                    //STEP 4: Execute a query
                    System.out.println("Creating statement...");
                    String sql;
                    sql = "SELECT * FROM utenti WHERE username like ? and password like ?";
                    PreparedStatement stmtp;
                    stmtp = conn.prepareStatement(sql);
                    stmtp.setString(1, user2);
                    stmtp.setString(2, pass2);
                    ResultSet rs = stmtp.executeQuery();

                    //STEP 5: Extract data from result set
                    while(rs.next()){
                        autenticato = true;
                    }
                    //STEP 6: Clean-up environment
                    rs.close();
                    stmtp.close();
                    conn.close();
                }catch(SQLException se){
                    //Handle errors for JDBC
                    se.printStackTrace();
                }catch(Exception e){
                    //Handle errors for Class.forName
                    e.printStackTrace();
                }finally{
                    //finally block used to close resources
                    try{
                        if(stmt!=null)
                            stmt.close();
                    }catch(SQLException se2){
                    }// nothing we can do
                    try{
                        if(conn!=null)
                            conn.close();
                    }catch(SQLException se){
                        se.printStackTrace();
                    }//end finally try
                }//end try
                System.out.println("Autenticato : " + autenticato);

                break;

        }

    }//end main
}//end FirstExample