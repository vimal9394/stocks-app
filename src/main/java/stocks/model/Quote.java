package stocks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private QuoteResponse quoteResponse;
    
    public Quote() {
    	
    }
    
    public QuoteResponse getQuoteResponse() {
		return quoteResponse;
	}



	public void setQuoteResponse(QuoteResponse quoteResponse) {
		this.quoteResponse = quoteResponse;
	}

	@Override
    public String toString() {
        return "{" +
                "quoteResponse='" + quoteResponse + '\'' +
                '}';
    }
}
