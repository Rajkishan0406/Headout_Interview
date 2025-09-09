
package com.example.InterviewHeadout.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.InterviewHeadout.Service.ReviewService;
import com.example.InterviewHeadout.Model.Review;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/addReview")
    public ResponseEntity<String> addReview(@RequestBody Map<String, Object> payload) {
        Review review = new Review();

        // Convert Map payload to Review object
        if (payload.get("id") != null) {
            review.setId((Integer)payload.get("id"));
        }

        if (payload.get("productId") != null) {
            review.setProductId((Integer) payload.get("productId"));
        }

        if (payload.get("customerId") != null) {
            review.setCustomerId((Integer) payload.get("customerId"));
        }

        if (payload.get("rating") != null) {
            review.setRating((Integer) payload.get("rating"));
        }

        if (payload.get("message") != null) {
            review.setMessage((String) payload.get("message"));
        }

        if (payload.get("numberOfLike") != null) {
            review.setNumberOfLike((Integer) payload.get("numberOfLike"));
        }

        if (payload.get("parentId") != null) {
            review.setParentId((Integer) payload.get("parentId"));
        }

        // Now you have a Review object to work with
        System.out.println("Converted Review: " + review);

        reviewService.addReview(review);

        return ResponseEntity.ok("Review added successfully");
    }

   

    @GetMapping("/reviews/{productId}")
    public ResponseEntity<List<Review>> getReviews(@PathVariable int productId) {
        List<Review> review = reviewService.getReviews(productId);
        return ResponseEntity.ok(review);
    }



}
