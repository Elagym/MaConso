package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.mapper.TransactionMapper;
import be.verbeet.maconso.model.Transaction;
import be.verbeet.maconso.model.Wallet;
import be.verbeet.maconso.repository.TransactionRepository;
import be.verbeet.maconso.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vince on 31-07-22.
 */
@Component
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepo;

    private final WalletRepository walletRepo;

    @Override
    public List<TransactionDTO> findAllByWalletId(Long walletId) {
        return TransactionMapper.INSTANCE.mapList(transactionRepo.findByWallet_IdEquals(walletId));
    }

    @Override
    public TransactionDTO createTransaction(TransactionDTO dto, Long walletId) {
        Transaction transaction = new Transaction();
        Wallet wallet = walletRepo.getReferenceById(walletId);
        transaction.setWallet(wallet);
        transaction.addObserver(wallet);
        transaction.setAmount(dto.getAmount());
        transaction.setCategory(dto.getCategory());
        transaction.setLabel(dto.getLabel());
        transaction.setFrequency(dto.getFrequency());
        transaction.setDate(dto.getDate());
        transaction.setType(dto.getType());
        return TransactionMapper.INSTANCE.map(transactionRepo.save(transaction));
    }

    @Override
    public TransactionDTO updateTransaction(TransactionDTO dto) {
        Transaction transaction = transactionRepo.getReferenceById(dto.getId());
        if (!transaction.getAmount().equals(dto.getAmount())) {
            Wallet wallet = transaction.getWallet();
            wallet.setAmount(wallet.getAmount().subtract(transaction.getAmount()).add(dto.getAmount()));
            transaction.setAmount(dto.getAmount());
        }
        transaction.setLabel(dto.getLabel());
        transaction.setDate(dto.getDate());
        return TransactionMapper.INSTANCE.map(transaction);
    }

    @Override
    public void deleteTransaction(Long id) {
        Transaction transaction = transactionRepo.getReferenceById(id);
        Wallet wallet = transaction.getWallet();
        wallet.setAmount(wallet.getAmount().subtract(transaction.getAmount()));
        transactionRepo.delete(transaction);
    }
}
