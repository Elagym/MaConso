package be.verbeet.maconso.service;

import be.verbeet.maconso.criteria.TransactionSearchCriteria;
import be.verbeet.maconso.dto.TransactionDTO;

import java.util.List;

/**
 * Created by Vince on 31-07-22.
 */
public interface TransactionService {

    List<TransactionDTO> findAllByWalletId(Long walletId);

    List<TransactionDTO> findAllByCriteria(TransactionSearchCriteria criteria);

    TransactionDTO createTransaction(TransactionDTO dto, Long walletId);

    TransactionDTO updateTransaction(TransactionDTO dto);

    void deleteTransaction(Long id);
}
