package com.feedback.service;

import com.feedback.entity.Feedback;

import java.util.List;

public interface FeedbackService {

    public List<Feedback> getFeedbacksByUserId(Long userId);
}
