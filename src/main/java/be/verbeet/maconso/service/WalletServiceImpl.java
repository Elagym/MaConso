package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.mapper.WalletMapper;
import be.verbeet.maconso.model.Wallet;
import be.verbeet.maconso.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vince on 29-07-22.
 */
@Component
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository repo;

    @Override
    public List<Wallet> findAll() {
        return repo.findAll();
    }

    @Override
    public Wallet createWallet(WalletDTO dto) {
        Wallet wallet = WalletMapper.INSTANCE.map(dto);
        repo.save(wallet);
        return wallet;
    }

    @Override
    public Wallet updateWallet(WalletDTO dto) {
        Wallet wallet = repo.getReferenceById(dto.getId());
        wallet.setLabel(dto.getLabel());
        return wallet;
    }

    @Override
    public void deleteWallet(Long id) {
        repo.deleteById(id);
    }
}
