package com.example.InterviewHeadout.dto;

public class ReviewDTO {
    private String reviewText;
    private Integer rating;
    private String reviewerName;
    
    // Default constructor
    public ReviewDTO() {}
    
    // Constructor with parameters
    public ReviewDTO(String reviewText, Integer rating, String reviewerName) {
        this.reviewText = reviewText;
        this.rating = rating;
        this.reviewerName = reviewerName;
    }
    
    // Getters and Setters
    public String getReviewText() {
        return reviewText;
    }
    
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
    
    public Integer getRating() {
        return rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    
    public String getReviewerName() {
        return reviewerName;
    }
    
    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    
    @Override
    public String toString() {
        return "ReviewDTO{" +
                "reviewText='" + reviewText + '\'' +
                ", rating=" + rating +
                ", reviewerName='" + reviewerName + '\'' +
                '}';
    }
}
