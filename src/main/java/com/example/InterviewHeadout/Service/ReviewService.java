package com.example.InterviewHeadout.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.InterviewHeadout.Model.Review;
import com.example.InterviewHeadout.Dao.ReviewDao;
import java.util.List;

@Service
public class ReviewService {

    @Autowired 
    ReviewDao reviewDao;

    public void addReview(Review review) {
        reviewDao.addReview(review);
    }

    public List<Review> getReviews(int productId) {
        return reviewDao.getReviews(productId);
    }

}