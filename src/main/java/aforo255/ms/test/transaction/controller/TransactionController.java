package aforo255.ms.test.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import aforo255.ms.test.transaction.entity.Transaction;
import aforo255.ms.test.transaction.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transaction;
	
	@GetMapping("/transaction/{invoiceId}")
	public ResponseEntity<?> obtenerByAccountId (@PathVariable Integer invoiceId){
		
		Iterable<Transaction> iTransaction=transaction.findByInvoiceId(invoiceId);
		
		return ResponseEntity.ok(iTransaction);
		
	}
	
	
	@GetMapping("/listar")
	public List<Transaction> listar(){
		
		return (List<Transaction>) transaction.findAll();
	}
	
	
}


