package be.verbeet.maconso.criteria.specification;

import be.verbeet.maconso.entity.Transaction;
import be.verbeet.maconso.entity.Transaction_;
import be.verbeet.maconso.entity.Wallet_;
import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import be.verbeet.maconso.enumeration.TransactionType;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * Created by Vince on 12-07-23.
 */
public class TransactionSpecifications extends Specifications {

    private TransactionSpecifications() {
        super();
    }

    private static Path<Transaction> getLabel(Root<Transaction> root) {
        return root.get(Transaction_.LABEL);
    }

    private static Path<Transaction> getAmount(Root<Transaction> root) {
        return root.get(Transaction_.AMOUNT);
    }

    private static Path<? extends LocalDate> getDate(Root<Transaction> root) {
        return root.get(Transaction_.DATE);
    }

    private static Path<Transaction> getFrequency(Root<Transaction> root) {
        return root.get(Transaction_.FREQUENCY);
    }

    private static Path<Transaction> getCategory(Root<Transaction> root) {
        return root.get(Transaction_.CATEGORY);
    }

    private static Path<Transaction> getType(Root<Transaction> root) {
        return root.get(Transaction_.TYPE);
    }

    private static Path<Transaction> getWalletLabel(Root<Transaction> root) {
        return root.get(Transaction_.WALLET).get(Wallet_.LABEL);
    }

    public static Specification<Transaction> labelEquals(String label) {
        return ((root, query, criteriaBuilder) -> equalAttr(criteriaBuilder, getLabel(root), label));
    }

    public static Specification<Transaction> amountEquals(BigDecimal amount) {
        return ((root, query, criteriaBuilder) -> equalAttr(criteriaBuilder, getAmount(root), amount));
    }

    public static Specification<Transaction> dateEquals(LocalDate date) {
        return ((root, query, criteriaBuilder) -> localDateGreaterOrEqualAttr(criteriaBuilder, getDate(root), date));
    }

    public static Specification<Transaction> frequencyEquals(Frequency frequency) {
        return ((root, query, criteriaBuilder) -> equalAttr(criteriaBuilder, getFrequency(root), frequency));
    }

    public static Specification<Transaction> categoryEquals(Category category) {
        return ((root, query, criteriaBuilder) -> equalAttr(criteriaBuilder, getCategory(root), category));
    }

    public static Specification<Transaction> typeEquals(TransactionType type) {
        return ((root, query, criteriaBuilder) -> equalAttr(criteriaBuilder, getType(root), type));
    }

    public static Specification<Transaction> walletLabelEquals(String walletLabel) {
        return ((root, query, criteriaBuilder) -> equalAttr(criteriaBuilder, getWalletLabel(root), walletLabel));
    }
}
