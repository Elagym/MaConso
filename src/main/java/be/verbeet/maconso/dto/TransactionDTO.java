package be.verbeet.maconso.dto;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import be.verbeet.maconso.enumeration.TransactionType;

import java.math.BigDecimal;

/**
 * Created by Vince on 11-06-22.
 */
public class TransactionDTO {

    private Long id;

    private String label;

    private BigDecimal amount;

    private Frequency frequency;

    private Category category;

    private TransactionType type;

    private WalletDTO wallet;

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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public WalletDTO getWallet() {
        return wallet;
    }

    public void setWallet(WalletDTO wallet) {
        this.wallet = wallet;
    }
}
