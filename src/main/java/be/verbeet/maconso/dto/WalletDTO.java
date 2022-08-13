package be.verbeet.maconso.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Vince on 11-06-22.
 */
public class WalletDTO {

    private Long id;

    private String label;

    private BigDecimal amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
