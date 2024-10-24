package com.design.structural.bridge1;

public class UserInterface {

    Database database;

    public UserInterface(Database database) {
        this.database = database;
    }

    String insertDetails(int userId, String name){
        return database.insertUserDetails(userId,name);
    }

    String updateDetails(int userId){
        return database.updateUserDetails(userId);
    }

    String connectDb(){
        return database.establishConnection();
    }

    String disconnectDb(){
        return database.disconnect();
    }

}
