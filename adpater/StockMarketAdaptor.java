public class StockMarketAdaptor implements CSVParser {
    
    private StockMarketDataParser stockMarket;

    public StockMarketAdaptor(StockMarketDataParser stockMarket) {
        this.stockMarket = stockMarket;
    }
    @Override
    public void parseCSV(){
        stockMarket.parseFromCSV();
    }
    
}
