package stocks.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteResponse {
	
    private List<ResultItem> result;
    
    public QuoteResponse() {
    	
    }
    
   
	public List<ResultItem> getResult() {
		return result;
	}


	public void setResult(List<ResultItem> result) {
		this.result = result;
	}


	@Override
    public String toString() {
        return "quoteResponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
