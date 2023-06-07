package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Review;
import com.Event_Management_Application.Event_Management_Application.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public List<Review> getAllReviews() {

        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {

        return reviewRepository.findById(id).get();
    }
}
