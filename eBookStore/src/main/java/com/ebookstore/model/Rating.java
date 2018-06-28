package com.ebookstore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Rating implements Serializable
{
    @Id
    @GeneratedValue
    private int ratingId;
    private int rating;
    private Date time;
    private String ip;

    //private Customer customer;
    @OneToOne
    @JoinColumn(name="productId")
    private Product product;

    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customer;

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}