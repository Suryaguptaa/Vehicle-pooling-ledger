package com.fairsplit.repository;

import com.fairsplit.entity.AppGroup;
import com.fairsplit.entity.auth.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppGroupRepository extends JpaRepository<AppGroup, Long> {
    Optional<AppGroup> findByInviteCode(String inviteCode);
    List<AppGroup> findByMembersContaining(AppUser member);
}
