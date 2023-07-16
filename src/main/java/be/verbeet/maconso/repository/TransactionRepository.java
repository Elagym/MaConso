package be.verbeet.maconso.repository;

import be.verbeet.maconso.entity.Transaction;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

/**
 * Created by Vince on 24-07-22.
 */
public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {

    List<Transaction> findByWallet_IdEquals(Long walletId);
}
