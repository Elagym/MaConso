package be.verbeet.maconso.service;

import be.verbeet.maconso.criteria.TransactionSearchCriteria;
import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.mapper.TransactionMapper;
import be.verbeet.maconso.entity.Transaction;
import be.verbeet.maconso.entity.Wallet;
import be.verbeet.maconso.repository.TransactionRepository;
import be.verbeet.maconso.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Vince on 31-07-22.
 */
@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepo;

    private final WalletRepository walletRepo;

    private final TransactionMapper transactionMapper;

    @Override
    public List<TransactionDTO> findAllByWalletId(Long walletId) {
        return transactionMapper.mapList(transactionRepo.findByWallet_IdEquals(walletId));
    }

    @Override
    public List<TransactionDTO> findAllByCriteria(TransactionSearchCriteria criteria) {
        return null;
    }

    @Override
    public TransactionDTO createTransaction(TransactionDTO dto, Long walletId) {
        Transaction transaction = new Transaction();
        Wallet wallet = Optional.of(walletRepo.findById(walletId)).get().orElse(null);
        if (wallet != null) {
            transaction.setWallet(wallet);
            transaction.setAmount(dto.getAmount());
            transaction.setCategory(dto.getCategory());
            transaction.setLabel(dto.getLabel());
            transaction.setFrequency(dto.getFrequency());
            transaction.setDate(dto.getDate());
            transaction.setType(dto.getType());
            return transactionMapper.map(transactionRepo.save(transaction));
        } else {
            return null;
        }
    }

    @Override
    public TransactionDTO updateTransaction(TransactionDTO dto) {
        Transaction transaction = Optional.of(transactionRepo.findById(dto.getId())).get().orElse(null);
        if (transaction != null) {
            transaction.setLabel(dto.getLabel());
            transaction.setDate(dto.getDate());
            return transactionMapper.map(transaction);
        } else {
            return null;
        }
    }

    @Override
    public void deleteTransaction(Long id) {
        transactionRepo.deleteById(id);
    }
}
