package com.fairsplit.repository;

import com.fairsplit.entity.AppGroup;
import com.fairsplit.entity.GroupExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GroupExpenseRepository extends JpaRepository<GroupExpense, Long> {
    List<GroupExpense> findByGroupOrderByDateDesc(AppGroup group);
}
