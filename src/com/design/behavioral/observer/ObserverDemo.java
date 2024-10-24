package com.design.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer indTrader = new IndividualTrader();
        Observer istTrader = new InstitutionalTrader();
        Observer mfTrader = new MFTrader();
        StockMarket stockMarket = new StockMarket();
        stockMarket.addSubscribers(indTrader);
        stockMarket.addSubscribers(mfTrader);
        stockMarket.addSubscribers(istTrader);
        stockMarket.refreshStocks();
        stockMarket.removeSubscribers(indTrader);
        stockMarket.refreshStocks();
        //stockMarket.updateStockPrice("MSFT",new Integer(100));
        //stockMarket.updateStockPrice("GOOGLE",new Integer(150));
    }
}

//    Subject Interface: Maintains a list of observers and provides methods to add, remove, and notify observers.
//
//        Concrete Subject: Implements the Subject interface and holds the actual state of interest.
//
//        Observer Interface: Declares the update method that gets called when the Subject's state changes.
//
//        Concrete Observer: Implements the Observer interface and updates itself based on the Subject's state.


//    Stock Market:
//
//        Subject: Stock (with price changes)
//
//        Observers: Traders, Investors, News Agencies
//
//        Scenario: Notify observers when a stock price changes.