
package com.example.InterviewHeadout.Model;

public class Review {
    public int id; // primary Key
    public int productId;
    public int customerId;
    public int rating;
    public String message;
    public Integer numberOfLike;
    public Integer parentId;

    // Constructors
    public Review() {}

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(Integer numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", rating=" + rating +
                ", message='" + message + '\'' +
                ", numberOfLike=" + numberOfLike +
                ", parentId=" + parentId +
                '}';
    }
}