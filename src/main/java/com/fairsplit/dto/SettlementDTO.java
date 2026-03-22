package com.fairsplit.dto;

import java.time.LocalDateTime;

public class SettlementDTO {
    private Long id;
    private Long groupId;
    private UserDTO paidBy;
    private UserDTO paidTo;
    private Double amount;
    private LocalDateTime date;

    public SettlementDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getGroupId() { return groupId; }
    public void setGroupId(Long groupId) { this.groupId = groupId; }
    public UserDTO getPaidBy() { return paidBy; }
    public void setPaidBy(UserDTO paidBy) { this.paidBy = paidBy; }
    public UserDTO getPaidTo() { return paidTo; }
    public void setPaidTo(UserDTO paidTo) { this.paidTo = paidTo; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
}
