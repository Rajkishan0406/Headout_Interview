package com.example.InterviewHeadout.Dao;

import java.util.*;
import com.example.InterviewHeadout.Model.Review;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDao {

    HashMap<Integer, List<Review>> map = new HashMap<>();

    public void addReview(Review review) {
        int productId = review.productId;
        List<Review> list = null;

        if (map.containsKey(productId)) {
            list = map.get(productId);
        } else {
            list = new ArrayList<>();
        }

        list.add(review);
        map.put(productId, list);
    }


    public List<Review> getReviews(int productId) {
        return map.get(productId);
    }

}