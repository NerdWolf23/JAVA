import java.sql.*;
import java.util.Scanner;


public class SelectExample {

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
        System.out.println("Inserisci uno username");
        String user = tastiera.nextLine();
        System.out.println("Inserisci una password");
        String pass = tastiera.nextLine();
        boolean autenticato = false;
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
            sql = "SELECT * FROM utenti WHERE username like '" + user+ "' and password like '" + pass + "'";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                autenticato = true;
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
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

        System.out.println("Goodbye!");
    }//end main
}//end FirstExample