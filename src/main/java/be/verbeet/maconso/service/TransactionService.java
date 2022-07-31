package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.model.Transaction;
import be.verbeet.maconso.model.Wallet;

import java.util.List;

/**
 * Created by Vince on 31-07-22.
 */
public interface TransactionService {

    List<Transaction> findAllByWalletId(Long walletId);

    Transaction createTransaction(TransactionDTO dto);

    Transaction updateTransaction(TransactionDTO dto);

    void deleteTransaction(Long id);
}
