package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column
    private String creation_date;


    protected Portfolio() {

    }

    public Portfolio(Client client, String creation_date) {
        this.client = client;
        this.creation_date = creation_date;
    }

    public long getPortfolioId() { return portfolioId; }

    public Client getClient() { return client;}

    public String getCreation_date() { return creation_date; }

    public void setCreation_date(String creation_date) { this.creation_date = creation_date; }

}
