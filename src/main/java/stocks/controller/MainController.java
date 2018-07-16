package stocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import stocks.model.Quote;
import stocks.model.Stock;
import stocks.service.StockService;



@Controller // This means that this class is a Controller
//@RequestMapping(path = "/watchlist")
public class MainController {

	@Autowired
	private StockService stockService;

//	@GetMapping(path="/add") // Map ONLY GET Requests
//	public @ResponseBody String addNewStock (@RequestParam String symbol
//			,@RequestParam String name
//			, @RequestParam String exchange) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//		return stockService.addNewStock(symbol, name, exchange);
//	}

	@ResponseStatus(value=HttpStatus.CREATED)
	@PostMapping(path = "/watchlist") // Map ONLY GET Requests
	public @ResponseBody String addNewStock(@RequestBody Stock s) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		System.out.println("The Stock is: " + s);
		return stockService.addNewStock(s.getSymbol(), s.getName(), s.getExchange());
	}

	@GetMapping(path = "/watchlist")
	public @ResponseBody Iterable<Stock> getAllStocks() {
		// This returns a JSON or XML with the stocks
		return stockService.getAllStocks();
	}
	
	@GetMapping(path = "/watchlist/{symbol}")
	public @ResponseBody Stock getStock(@PathVariable String symbol) {
		// This returns a JSON or XML with the stocks
		return stockService.getStock(symbol);
	}

	@ResponseStatus(value=HttpStatus.CREATED)
	@DeleteMapping("/watchlist/{id}")
	public @ResponseBody String deleteStock(@PathVariable String id) {
		System.out.println("Serving the delete request!!");
		return stockService.deleteStock(id);
	}

	@GetMapping(path = "/quote/{symbol}")
	public @ResponseBody Quote getQuote(@PathVariable String symbol) {
		System.out.println("Serving the get quote request!! The ID: "+symbol);
		return stockService.getQuote(symbol);
	}

}