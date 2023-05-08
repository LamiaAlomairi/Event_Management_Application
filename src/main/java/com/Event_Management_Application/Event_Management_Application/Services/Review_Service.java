package com.Event_Management_Application.Event_Management_Application.Services;

import com.Event_Management_Application.Event_Management_Application.Models.Review;
import com.Event_Management_Application.Event_Management_Application.Repositories.Review_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Review_Service {
    @Autowired
    Review_Repository review_repository;
    public List<Review> getAllReviews() {

        return review_repository.findAll();
    }

    public Review getReviewById(Long id) {

        return review_repository.findById(id).get();
    }
}
