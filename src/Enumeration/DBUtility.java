package Enumeration;

import java.sql.Connection;

public class DBUtility {

    Connection connection;

    public void openConnection(DateBase db){
        switch (db){
            case USERS:
                // Connection = connect
                // code to connect to user db

            case SALES:
                // Connection = connect
                // code to connect to Sales db

            case MEDIA:
                // Connection = connect
                // code to connect to MEDIA db

        }

    }
}
