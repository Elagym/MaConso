package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.mapper.WalletMapper;
import be.verbeet.maconso.entity.Wallet;
import be.verbeet.maconso.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Vince on 29-07-22.
 */
@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository repo;

    @Autowired
    private final WalletMapper walletMapper;

    @Override
    public List<Wallet> findAll() {
        return repo.findAll();
    }

    @Override
    public Wallet createWallet(WalletDTO dto) {
        Wallet wallet = walletMapper.map(dto);
        repo.save(wallet);
        return wallet;
    }

    @Override
    public Wallet updateWallet(WalletDTO dto) {
        Wallet wallet = Optional.of(repo.findById(dto.getId())).get().orElse(null);
        if (wallet != null) {
            wallet.setLabel(dto.getLabel());
        }
        return wallet;
    }

    @Override
    public void deleteWallet(Long id) {
        repo.deleteById(id);
    }
}
