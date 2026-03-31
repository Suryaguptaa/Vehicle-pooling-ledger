package com.fairsplit.controller;

import com.fairsplit.dto.ApiResponse;
import com.fairsplit.dto.BalanceDTO;
import com.fairsplit.dto.GroupExpenseDTO;
import com.fairsplit.dto.SettlementDTO;
import com.fairsplit.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse<GroupExpenseDTO>> addExpense(@Valid @RequestBody GroupExpenseDTO dto) {
        GroupExpenseDTO created = expenseService.addExpense(dto);
        return ResponseEntity.ok(new ApiResponse<>(true, "Expense added", created));
    }

    @GetMapping("/group/{groupId}")
    public ResponseEntity<ApiResponse<List<GroupExpenseDTO>>> getGroupExpenses(@PathVariable Long groupId) {
        List<GroupExpenseDTO> expenses = expenseService.getGroupExpenses(groupId);
        return ResponseEntity.ok(new ApiResponse<>(true, "Expenses retrieved", expenses));
    }

    @PutMapping("/{expenseId}")
    public ResponseEntity<ApiResponse<GroupExpenseDTO>> editExpense(
            @PathVariable Long expenseId,
            @Valid @RequestBody GroupExpenseDTO dto) {
        GroupExpenseDTO updated = expenseService.editExpense(expenseId, dto);
        return ResponseEntity.ok(new ApiResponse<>(true, "Expense updated", updated));
    }

    @DeleteMapping("/{expenseId}")
    public ResponseEntity<ApiResponse<Void>> deleteExpense(@PathVariable Long expenseId) {
        expenseService.deleteExpense(expenseId);
        return ResponseEntity.ok(new ApiResponse<>(true, "Expense deleted", null));
    }

    @PostMapping("/settle")
    public ResponseEntity<ApiResponse<SettlementDTO>> settle(@Valid @RequestBody SettlementDTO dto) {
        SettlementDTO created = expenseService.addSettlement(dto);
        return ResponseEntity.ok(new ApiResponse<>(true, "Settlement recorded", created));
    }

    @GetMapping("/group/{groupId}/balances")
    public ResponseEntity<ApiResponse<List<BalanceDTO>>> getBalances(@PathVariable Long groupId) {
        List<BalanceDTO> balances = expenseService.getBalances(groupId);
        return ResponseEntity.ok(new ApiResponse<>(true, "Balances calculated", balances));
    }

    @GetMapping("/group/{groupId}/debts")
    public ResponseEntity<ApiResponse<List<Map<String, Object>>>> getSimplifiedDebts(@PathVariable Long groupId) {
        List<Map<String, Object>> debts = expenseService.getSimplifiedDebts(groupId);
        return ResponseEntity.ok(new ApiResponse<>(true, "Debts simplified", debts));
    }
}
