package com.openbanking.app.web;

import com.openbanking.app.domain.Transaction;
import com.openbanking.app.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sareaboudousamadou.
 */
@RestController
public class TransactionController {


    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE}, path = "/transactions/{accountNumber}")
    public ResponseEntity<List<Transaction>> getAllTransactions(@PathVariable("accountNumber") Integer accountNumber) {
        List<Transaction> transactions = transactionService.findAllByAccountNumber();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
}

