package be.verbeet.maconso.controller;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.model.Wallet;
import be.verbeet.maconso.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vince on 29-07-22.
 */
//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/wallets")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping
    public ResponseEntity<List<Wallet>> findAll() {
        return ResponseEntity.ok(walletService.findAll());
    }

    @PostMapping
    public ResponseEntity<Wallet> createWallet(@RequestBody WalletDTO dto) {
        return ResponseEntity.ok(walletService.createWallet(dto));
    }

    @PutMapping
    public ResponseEntity<Wallet> updateWallet(@RequestBody WalletDTO dto) {
        return ResponseEntity.ok(walletService.updateWallet(dto));
    }

    @DeleteMapping(path = "/{id}")
    public void deleteWallet(@PathVariable Long id) {
        walletService.deleteWallet(id);
    }

}
