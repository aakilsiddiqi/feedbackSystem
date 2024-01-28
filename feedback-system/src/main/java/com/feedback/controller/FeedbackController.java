package com.feedback.controller;

import com.feedback.entity.Feedback;
import com.feedback.service.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackServiceImpl feedbackService;

    @GetMapping("/history/{userId}")
    public List<Feedback> getFeedbackByUserId(@PathVariable Long userId){
        return feedbackService.getFeedbacksByUserId(userId);
    }
}
