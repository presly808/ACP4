package ua.artcode.model;

import java.util.Date;

/**
 * Created by serhii on 22.02.15.
 */
public class Order {

    private int id;
    private Client client;
    private Date creation;
    private Bucket bucket;
    private double amount;
    private OrderStatus status;

    public Order() {
    }

    public Order(Client client, Date creation,
                 Bucket bucket, double amount,
                 OrderStatus status) {
        this.client = client;
        this.creation = creation;
        this.bucket = bucket;
        this.amount = amount;
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
