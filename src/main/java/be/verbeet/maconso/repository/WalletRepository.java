package be.verbeet.maconso.repository;

import be.verbeet.maconso.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vince on 24-07-22.
 */
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    List<Wallet> findByLabelContaining(String label);
}
