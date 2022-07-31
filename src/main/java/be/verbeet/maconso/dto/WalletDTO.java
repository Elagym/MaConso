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

    private List<RestrictionDTO> restrictions;

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

    public List<RestrictionDTO> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<RestrictionDTO> restrictions) {
        this.restrictions = restrictions;
    }
}
