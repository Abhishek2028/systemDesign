package com.design.structural.adapter1;

public class AdapterTestMain {
    //have a internal software that only works with XML data - string
    //Need to integrate a client software that only works with JSON data - string buffer
    public static void main(String args[]){
        JsonAnalyticsLibraryService jsonAnalyticsLibraryService = new JsonAnalyticsLibraryService();
        Adapter adapter = new Adapter(jsonAnalyticsLibraryService);
        AnalyticsService analyticsService = new AnalyticsService(adapter);
        analyticsService.displayData("Simple XML Data");
    }

}
