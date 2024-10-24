package com.design.structural.bridge1;

public class BridgeDemoTest {
    public static void main(String args[]){
        //User Interface is the abstraction.
        //The underlying database implementation is the implementation
        MongoDatabase mongoDatabase = new MongoDatabase();
        UserInterface userInterface = new UserInterface(mongoDatabase);
        System.out.println(userInterface.connectDb());
        System.out.println(userInterface.insertDetails(1,"Jack"));
        System.out.println(userInterface.updateDetails(1));
        System.out.println(userInterface.disconnectDb());

        //Now, the same userInterface can also use the SQL Db
        SQLDatabase sqlDatabase = new SQLDatabase();
        userInterface = new UserInterface(sqlDatabase);
        System.out.println(userInterface.connectDb());
        System.out.println(userInterface.insertDetails(1,"Jack"));
        System.out.println(userInterface.updateDetails(1));
        System.out.println(userInterface.disconnectDb());

    }
}


//Let's say we have a common GUI. Upon installation in Windows, it works a certain way.
//Upon installation on Mac, it works in a certain way.
//Upon installation on Linux, it works in a certain way.

//But, the user using the GUI would not know how the API calls or the system calls are being made internally.

//Let's say we are building a file explorer application GUI.
//The app should be compatible with all kinds of databases.
//Functions provided by app : Make connection with database. Fetch records of particular user, update records of particular user.
//Disconnect the connection with database. .