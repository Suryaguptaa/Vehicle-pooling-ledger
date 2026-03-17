package com.pooling.ledger.entity;

import com.pooling.ledger.entity.auth.AppUser;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "activity_logs")
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action; // e.g., "EXPENSE_ADDED", "EXPENSE_DELETED", "SETTLED"
    
    private String details; // e.g., "Alice added 'Dinner' for $50.00"

    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private AppGroup group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    public ActivityLog() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public AppGroup getGroup() { return group; }
    public void setGroup(AppGroup group) { this.group = group; }
    public AppUser getUser() { return user; }
    public void setUser(AppUser user) { this.user = user; }
}
