public class App {

	public static void main(String[] args) {

		CSVParser realEstate = new RealEstateMarketDataParser();
		CSVParser machineLearning = new MachineLearningDataParser();

		CSVParser StockMarket = new StockMarketAdaptor(new StockMarketDataParser());

		parse(realEstate);
		parse(machineLearning);
		parse(StockMarket);

	}

	public static void parse(CSVParser parser) {
		parser.parseCSV();
	}
}
