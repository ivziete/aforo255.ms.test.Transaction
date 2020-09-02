package aforo255.ms.test.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aforo255.ms.test.transaction.entity.Transaction;
import aforo255.ms.test.transaction.repository.TransactionRepository;
@Service
public class TransactionService {

	@Autowired
	TransactionRepository repository;
	
	
	public Transaction save(Transaction transaction) {
		return repository.save(transaction);
	}

	public Iterable<Transaction> findByInvoiceId(Integer invoiceId) {
		return repository.findByInvoiceId(invoiceId);
	}

	public Iterable<Transaction> findAll() {
		return repository.findAll();
	}

}
