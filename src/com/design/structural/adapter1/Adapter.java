package com.design.structural.adapter1;

public class Adapter implements IAnalytics{

    JsonAnalyticsLibraryService jsonAnalyticsLibraryService;

    public Adapter(JsonAnalyticsLibraryService jsonAnalyticsLibraryService) {
        this.jsonAnalyticsLibraryService = jsonAnalyticsLibraryService;
    }

    @Override
    public void displayData(String data) {
        StringBuffer bufferedData = new StringBuffer(data);
        jsonAnalyticsLibraryService.displayData(bufferedData);
    }
}
