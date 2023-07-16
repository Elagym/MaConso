package be.verbeet.maconso.repository;

import be.verbeet.maconso.entity.Wallet;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

/**
 * Created by Vince on 24-07-22.
 */
public interface WalletRepository extends ListCrudRepository<Wallet, Long> {
    List<Wallet> findByLabelContaining(String label);
}
