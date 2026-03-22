package com.fairsplit.dto;

import java.time.LocalDateTime;
import java.util.List;

public class GroupExpenseDTO {
    private Long id;
    private String title;
    private Double amount;
    private String category;
    private LocalDateTime date;
    private Long groupId;
    private UserDTO paidBy;
    private List<UserDTO> splitBetween;

    public GroupExpenseDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
    public Long getGroupId() { return groupId; }
    public void setGroupId(Long groupId) { this.groupId = groupId; }
    public UserDTO getPaidBy() { return paidBy; }
    public void setPaidBy(UserDTO paidBy) { this.paidBy = paidBy; }
    public List<UserDTO> getSplitBetween() { return splitBetween; }
    public void setSplitBetween(List<UserDTO> splitBetween) { this.splitBetween = splitBetween; }
}
