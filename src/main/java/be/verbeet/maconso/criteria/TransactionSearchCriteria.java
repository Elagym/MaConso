package be.verbeet.maconso.criteria;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import be.verbeet.maconso.enumeration.TransactionType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Vince on 12-07-23.
 */
@Getter
@RequiredArgsConstructor
public class TransactionSearchCriteria {

    private String label;

    private BigDecimal amount;

    private LocalDate date;

    private Frequency frequency;

    private Category category;

    private TransactionType type;

    private String walletLabel;
}
