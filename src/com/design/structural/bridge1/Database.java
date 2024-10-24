package com.design.structural.bridge1;

public interface Database {

    String establishConnection();

    String updateUserDetails(int userId);

    String insertUserDetails(int userId, String userName);

    String disconnect();
}
