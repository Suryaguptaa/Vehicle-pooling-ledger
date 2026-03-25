package com.fairsplit.controller;

import com.fairsplit.dto.ApiResponse;
import com.fairsplit.dto.GroupDTO;
import com.fairsplit.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse<GroupDTO>> createGroup(@RequestParam String name) {
        GroupDTO group = groupService.createGroup(name);
        return ResponseEntity.ok(new ApiResponse<>(true, "Group created", group));
    }

    @PostMapping("/join")
    public ResponseEntity<ApiResponse<GroupDTO>> joinGroup(@RequestParam String code) {
        GroupDTO group = groupService.joinGroup(code);
        return ResponseEntity.ok(new ApiResponse<>(true, "Joined group", group));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<GroupDTO>>> getMyGroups() {
        List<GroupDTO> groups = groupService.getMyGroups();
        return ResponseEntity.ok(new ApiResponse<>(true, "Groups retrieved", groups));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<GroupDTO>> getGroup(@PathVariable Long id) {
        GroupDTO group = groupService.getGroup(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Group retrieved", group));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteGroup(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Group deleted", null));
    }

    @PostMapping("/{id}/regenerate-code")
    public ResponseEntity<ApiResponse<GroupDTO>> regenerateCode(@PathVariable Long id) {
        GroupDTO group = groupService.regenerateCode(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Invite code regenerated", group));
    }
}
