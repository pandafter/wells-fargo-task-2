package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private String purchase_date;

    @Column
    private String purchase_price;

    @Column
    private float quantity;


    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, String purchase_date, String purchase_price, float quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }

    public Portfolio getPortfolioId() { return portfolio; }

    public String getName() { return name; }

    public void setName(String name) {this.name = name; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getPurchase_date() { return purchase_date; }

    public void setPurchase_date(String purchase_date) { this.purchase_date = purchase_date; }

    public String getPurchase_price() { return purchase_price; }

    public void setPurchase_price(String purchase_price) { this.purchase_price = purchase_price; }

    public float getQuantity() { return quantity; }

    public void setQuantity(float quantity) { this.quantity = quantity; }

}
