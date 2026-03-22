package com.fairsplit.dto;

import java.util.List;

public class GroupDTO {
    private Long id;
    private String name;
    private String inviteCode;
    private List<UserDTO> members;

    public GroupDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getInviteCode() { return inviteCode; }
    public void setInviteCode(String inviteCode) { this.inviteCode = inviteCode; }
    public List<UserDTO> getMembers() { return members; }
    public void setMembers(List<UserDTO> members) { this.members = members; }
}
