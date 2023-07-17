package be.verbeet.maconso.criteria.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import org.apache.commons.collections4.CollectionUtils;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Created by Vince on 17-07-23.
 */
public abstract class Specifications {

    protected Specifications() {
        throw new IllegalStateException("Utility class");
    }

    static Predicate equalAttr(CriteriaBuilder cb, Path<?> path, Object value) {
        if (value == null) {
            return null;
        }
        return cb.equal(path, value);
    }

    static Predicate localDateGreaterOrEqualAttr(CriteriaBuilder cb, Path<? extends LocalDate> path, LocalDate value) {
        if (value == null) {
            return null;
        }
        return cb.greaterThanOrEqualTo(path, value);
    }

    static Predicate in(Path<?> path, Collection<?> values) {
        if (CollectionUtils.isEmpty(values)) {
            return null;
        }
        return path.in(values);
    }
}
