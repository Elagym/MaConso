package be.verbeet.maconso.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vince on 11-06-22.
 */
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
@Table(name = "wallets")
public class Wallet implements Observer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String label;

    @Column
    private BigDecimal amount;

    @OneToMany(mappedBy = "wallet")
    private List<Restriction> restrictions;

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

    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    public void addRestriction(Restriction restriction) {
        if (restrictions == null) {
            restrictions = new ArrayList<>();
        }
        restrictions.add(restriction);
        restriction.setWallet(this);
    }

    @Override
    //will cause incorrect amount with update of transaction
    public void update(Observable o, Object amount) {
        this.amount = this.amount.add((BigDecimal) amount);
    }
}
