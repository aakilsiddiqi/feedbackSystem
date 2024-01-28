package com.feedback.entity;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedBackId;
    private String actionType;
    private String columnName;
    private String createdBy;
    @ManyToOne
    @JoinColumn(name="userId",nullable = false)
    private User user;

    public Long getFeedBackId() {
        return feedBackId;
    }

    public void setFeedBackId(Long feedBackId) {
        this.feedBackId = feedBackId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
