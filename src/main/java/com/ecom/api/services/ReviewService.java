package com.ecom.api.services;

import com.ecom.api.entity.Review;
import com.ecom.api.entity.User;

import java.util.List;

public interface ReviewService {
    Review createReview(Review review, User user);
    List<Review> getAllReviewsByProduct(int productId);
}
