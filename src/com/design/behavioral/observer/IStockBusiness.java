package com.design.behavioral.observer;

public interface IStockBusiness {
    void updateStockPrice(String stock, Integer price);
    void refreshStocks();
}
