package be.verbeet.maconso.dto;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import be.verbeet.maconso.enumeration.TransactionType;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Vince on 11-06-22.
 */
@Value
@Builder
public class TransactionDTO {

    private Long id;

    private String label;

    private BigDecimal amount;

    private LocalDate date;

    private Frequency frequency;

    private Category category;

    private TransactionType type;

    private WalletDTO wallet;
}
