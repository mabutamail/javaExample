package com.github.mabutamail.javatemplate.tipograf.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tg_order")
@NamedQuery(name = "PrintOrder.getAll", query = "SELECT c from PrintOrder c")
public class PrintOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ORDER_ID")
    private Long orderId;
    @Column(name = "DATE", unique = true, nullable = false)
    private LocalDateTime createDate;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private com.github.mabutamail.javatemplate.tipograf.model.Client client;
    private Long price;
    private String comment;
    @Column(name = "CONDITION", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private com.github.mabutamail.javatemplate.tipograf.model.OrderCondition condition;

    public PrintOrder() {
        this.createDate = LocalDateTime.now();
        this.condition = com.github.mabutamail.javatemplate.tipograf.model.OrderCondition.ACCEPTED;
    }

    public PrintOrder(com.github.mabutamail.javatemplate.tipograf.model.Client client, Long price) {
        this.createDate = LocalDateTime.now();
        this.client = client;
        this.price = price;
        this.condition = com.github.mabutamail.javatemplate.tipograf.model.OrderCondition.ACCEPTED;
    }

    public PrintOrder(com.github.mabutamail.javatemplate.tipograf.model.Client client, Long price, String comment) {
        this.createDate = LocalDateTime.now();
        this.client = client;
        this.price = price;
        this.comment = comment;
        this.condition = com.github.mabutamail.javatemplate.tipograf.model.OrderCondition.ACCEPTED;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = LocalDateTime.now();
    }

    public com.github.mabutamail.javatemplate.tipograf.model.Client getClient() {
        return this.client;
    }

    public void setClient(com.github.mabutamail.javatemplate.tipograf.model.Client client) {
        this.client = client;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public com.github.mabutamail.javatemplate.tipograf.model.OrderCondition getCondition() {
        return condition;
    }

    public void setCondition(com.github.mabutamail.javatemplate.tipograf.model.OrderCondition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "PrintOrder{" +
                "orderId=" + orderId +
                ", createDate=" + createDate +
                ", client=" + client +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                ", condition=" + condition +
                '}';
    }
}