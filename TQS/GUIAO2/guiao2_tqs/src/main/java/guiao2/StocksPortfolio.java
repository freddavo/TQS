package guiao2;

import java.util.ArrayList;

public class StocksPortfolio {
    private String name;
    private IStockMarket marketService;
    private ArrayList<Stock> stocks = new ArrayList<>();


    public IStockMarket getMarketService(){
        return this.marketService;
    }

    public void setMarketService(IStockMarket newMarket){
        this.marketService = newMarket;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getTotalValue(){
        double total = 0;

        for(Stock stock : this.stocks){
            total = total + (marketService.getPrice(stock.getName()) * stock.getQuantity());
        }

        return total;
    }

    public void addStock(Stock newStock){
        this.stocks.add(newStock);
    }


}




