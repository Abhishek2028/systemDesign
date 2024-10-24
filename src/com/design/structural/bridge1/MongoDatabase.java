package com.design.structural.bridge1;

public class MongoDatabase implements Database{
    @Override
    public String establishConnection() {
        return "Established connection with MongoDB";
    }

    @Override
    public String updateUserDetails(int userId) {
        return "Updated details of the user with ID in MongoDB";
    }

    @Override
    public String insertUserDetails(int userId, String userName) {
        return "Inserted details of the user with ID and name to MongoDB";
    }

    @Override
    public String disconnect() {
        return "Disconnected the MongoDB connection";
    }
}
