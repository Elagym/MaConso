package be.verbeet.maconso.controller;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.model.Transaction;
import be.verbeet.maconso.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vince on 31-07-22.
 */
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping(path = "/{walletId}")
    public ResponseEntity<List<Transaction>> findAllByWalletId(@PathVariable Long walletId) {
        return ResponseEntity.ok(transactionService.findAllByWalletId(walletId));
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO dto) {
        return ResponseEntity.ok(transactionService.createTransaction(dto));
    }

    @PutMapping
    public ResponseEntity<Transaction> updateTransaction(@RequestBody TransactionDTO dto) {
        return ResponseEntity.ok(transactionService.updateTransaction(dto));
    }

}
