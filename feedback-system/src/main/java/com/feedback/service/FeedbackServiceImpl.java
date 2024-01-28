package com.feedback.service;

import com.feedback.entity.Feedback;
import com.feedback.repo.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepo repo;
    @Override
    public List<Feedback> getFeedbacksByUserId(Long userId) {
        return repo.findByUser_UserId(userId);
    }
}
