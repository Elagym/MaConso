package be.verbeet.maconso.model;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import be.verbeet.maconso.enumeration.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Observable;

/**
 * Created by Vince on 11-06-22.
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
@Table(name = "transactions")
public class Transaction extends Observable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String label;

    @Column
    private BigDecimal amount;

    @Column
    private Calendar date;

    @Column
    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @ManyToOne
    private Wallet wallet;

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
        setChanged();
        notifyObservers(amount);
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
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

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
