package be.verbeet.maconso.controller;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.entity.Wallet;
import be.verbeet.maconso.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vince on 29-07-22.
 */
//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/wallets")
public class WalletController {

    private final WalletService walletService;

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
