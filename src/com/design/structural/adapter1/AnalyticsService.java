package com.design.structural.adapter1;

public class AnalyticsService implements IAnalytics{

    Adapter adapter;

    public AnalyticsService(Adapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void displayData(String data) {
        adapter.displayData(data);
    }

    //to work with adaptee i.e the json service, have a common interface that is implemented by both adapter and the Main service

}
