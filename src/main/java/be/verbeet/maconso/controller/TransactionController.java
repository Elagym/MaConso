package be.verbeet.maconso.controller;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vince on 31-07-22.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping(path = "/{walletId}")
    public ResponseEntity<List<TransactionDTO>> findAllByWalletId(@PathVariable Long walletId) {
        return ResponseEntity.ok(transactionService.findAllByWalletId(walletId));
    }

    @PostMapping(path = "/{walletId}")
    public ResponseEntity<TransactionDTO> createTransaction(@RequestBody TransactionDTO dto, @PathVariable Long walletId) {
        return ResponseEntity.ok(transactionService.createTransaction(dto, walletId));
    }

    @PutMapping
    public ResponseEntity<TransactionDTO> updateTransaction(@RequestBody TransactionDTO dto) {
        return ResponseEntity.ok(transactionService.updateTransaction(dto));
    }

}
