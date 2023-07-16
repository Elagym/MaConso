package be.verbeet.maconso.criteria.specification;

import be.verbeet.maconso.criteria.TransactionSearchCriteria;
import be.verbeet.maconso.entity.Transaction;
import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

/**
 * Created by Vince on 12-07-23.
 */
public class TransactionSpecification implements Specification<Transaction> {

    private TransactionSearchCriteria criteria;

    @Override
    public Specification<Transaction> and(Specification<Transaction> other) {
        return Specification.super.and(other);
    }

    @Override
    public Specification<Transaction> or(Specification<Transaction> other) {
        return Specification.super.or(other);
    }

    @Override
    public Predicate toPredicate(Root<Transaction> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return null;
    }
}
