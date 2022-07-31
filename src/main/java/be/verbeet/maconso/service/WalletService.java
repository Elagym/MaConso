package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.model.Wallet;

import java.util.List;

/**
 * Created by Vince on 29-07-22.
 */
public interface WalletService {

    List<Wallet> findAll();

    Wallet createWallet(WalletDTO dto);

    Wallet updateWallet(WalletDTO dto);

    void deleteWallet(Long id);
}
