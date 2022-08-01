package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.model.Transaction;
import be.verbeet.maconso.model.Wallet;
import be.verbeet.maconso.repository.TransactionRepository;
import be.verbeet.maconso.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vince on 31-07-22.
 */
@Component
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepo;

    @Autowired
    private WalletRepository walletRepo;

    @Override
    public List<Transaction> findAllByWalletId(Long walletId) {
        return transactionRepo.findByWallet_IdEquals(walletId);
    }

    @Override
    public Transaction createTransaction(TransactionDTO dto) {
        Transaction transaction = new Transaction();
        Wallet wallet = walletRepo.getReferenceById(dto.getId());
        transaction.setWallet(wallet);
        transaction.addObserver(wallet);
        transaction.setAmount(dto.getAmount());
        transaction.setCategory(dto.getCategory());
        transaction.setLabel(dto.getLabel());
        transaction.setFrequency(dto.getFrequency());
        transaction.setDate(dto.getDate());
//        transaction.setType(dto.getType()); This shouldn't be updatable. An incorrect transaction should be recreated
        return transactionRepo.save(transaction);
    }

    @Override
    public Transaction updateTransaction(TransactionDTO dto) {
        Transaction transaction = transactionRepo.getReferenceById(dto.getId());
        if (!transaction.getAmount().equals(dto.getAmount())) {
            Wallet wallet = transaction.getWallet();
            wallet.setAmount(wallet.getAmount().subtract(transaction.getAmount()).add(dto.getAmount()));
            transaction.setAmount(dto.getAmount());
        }
        transaction.setLabel(dto.getLabel());
        transaction.setDate(dto.getDate());
        return transaction;
    }

    @Override
    public void deleteTransaction(Long id) {
        Transaction transaction = transactionRepo.getReferenceById(id);
        Wallet wallet = transaction.getWallet();
        wallet.setAmount(wallet.getAmount().subtract(transaction.getAmount()));
        transactionRepo.delete(transaction);
    }
}
