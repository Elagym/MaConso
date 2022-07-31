package be.verbeet.maconso.dto;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;

import java.math.BigDecimal;

/**
 * Created by Vince on 11-06-22.
 */
public class RestrictionDTO {

    private Long id;

    private BigDecimal totalAmount;

    private Frequency frequency;

    private Category category;

    private WalletDTO wallet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public WalletDTO getWallet() {
        return wallet;
    }

    public void setWallet(WalletDTO wallet) {
        this.wallet = wallet;
    }
}
