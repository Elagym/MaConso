package be.verbeet.maconso.model;

import be.verbeet.maconso.enumeration.Category;
import be.verbeet.maconso.enumeration.Frequency;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Vince on 11-06-22.
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
@Table(name = "restrictions")
public class Restriction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private BigDecimal totalAmount;

    @Column
    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    private Wallet wallet;

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

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
