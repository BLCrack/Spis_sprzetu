package pl.cm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database
{
    static final String DB_URL = "jdbc:h2:O:/SUPPORT/SPRZĘT/test_bazy";
    static final String USER = "admin";
    static final String PASS = "admin";

    void test()
    {
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        }
        catch(SQLException sqlex)
        {

        }
        catch (Exception e)
        {

        }
    }
}
