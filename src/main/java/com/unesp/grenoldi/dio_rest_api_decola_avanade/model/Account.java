package com.unesp.grenoldi.dio_rest_api_decola_avanade.model;

import jakarta.persistence.*;

@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String number;
    private String type;
    private boolean paymentStatus;
    private boolean automation;

    public Account(long id, String number, String type, boolean paymentStatus, boolean automation) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.paymentStatus = paymentStatus;
        this.automation = automation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isAutomation() {
        return automation;
    }

    public void setAutomation(boolean automation) {
        this.automation = automation;
    }
}
