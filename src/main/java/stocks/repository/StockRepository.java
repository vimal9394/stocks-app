package stocks.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import stocks.model.Stock;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StockRepository extends CrudRepository<Stock, Long> {

	@Transactional
	void deleteBySymbol(String symbol);

	Stock findStockBySymbol(String symbol);

}
