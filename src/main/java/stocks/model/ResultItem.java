package stocks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultItem {
	
    private String symbol;
    private String longName;
    private String exchange;
    private double regularMarketPrice;
    private long regularMarketVolume;
    private long marketCap;
    
    public ResultItem() {
    	
    }
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public double getRegularMarketPrice() {
		return regularMarketPrice;
	}
	public void setRegularMarketPrice(double regularMarketPrice) {
		this.regularMarketPrice = regularMarketPrice;
	}
	public long getRegularMarketVolume() {
		return regularMarketVolume;
	}
	public void setRegularMarketVolume(long regularMarketVolume) {
		this.regularMarketVolume = regularMarketVolume;
	}
	public long getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}  
	@Override
    public String toString() {
        return "{" +
                "symbol='" + symbol + '\'' +
                "longName='" + longName + '\'' +
                "exchange='" + exchange + '\'' +
                "regularMarketPrice='" + regularMarketPrice + '\'' +
                "regularMarketVolume='" + regularMarketVolume + '\'' +
                "marketCap='" + marketCap + '\'' +                
                '}';
    }
}
