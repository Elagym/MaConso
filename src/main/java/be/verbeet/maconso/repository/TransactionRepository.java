package be.verbeet.maconso.repository;

import be.verbeet.maconso.model.Transaction;
import be.verbeet.maconso.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vince on 24-07-22.
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByWallet_IdEquals(Long walletId);
}
