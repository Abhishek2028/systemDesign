package com.design.structural.bridge1;

import javax.xml.crypto.Data;

public class SQLDatabase implements Database {
    @Override
    public String establishConnection() {
        return "Established connection with SQLDB";
    }

    @Override
    public String updateUserDetails(int userId) {
        return "Updated details of the user with ID in SQLDB";
    }

    @Override
    public String insertUserDetails(int userId, String userName) {
        return "Inserted details of the user with ID and name to SQLDB";
    }

    @Override
    public String disconnect() {
        return "Disconnected the SQLDB connection";
    }
}
