package com.fairsplit.dto;

public class BalanceDTO {
    private UserDTO user;
    private Double netBalance;

    public BalanceDTO() {}
    public BalanceDTO(UserDTO user, Double netBalance) {
        this.user = user;
        this.netBalance = netBalance;
    }

    public UserDTO getUser() { return user; }
    public void setUser(UserDTO user) { this.user = user; }
    public Double getNetBalance() { return netBalance; }
    public void setNetBalance(Double netBalance) { this.netBalance = netBalance; }
}
