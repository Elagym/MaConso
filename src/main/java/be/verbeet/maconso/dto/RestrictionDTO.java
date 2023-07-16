package be.verbeet.maconso.dto;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

/**
 * Created by Vince on 11-06-22.
 */
@Value
@Builder
public class RestrictionDTO {

    private Long id;

    private BigDecimal maxAmount;

    private Frequency frequency;

    private Category category;

    private WalletDTO wallet;
}
