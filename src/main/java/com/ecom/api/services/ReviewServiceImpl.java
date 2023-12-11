package com.ecom.api.services;

import com.ecom.api.entity.Review;
import com.ecom.api.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Override
    public Review createReview(Review review, User user) {
        return null;
    }

    @Override
    public List<Review> getAllReviewsByProduct(int productId) {
        return null;
    }
}
