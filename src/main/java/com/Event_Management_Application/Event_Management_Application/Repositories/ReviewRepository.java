package com.Event_Management_Application.Event_Management_Application.Repositories;

import com.Event_Management_Application.Event_Management_Application.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
