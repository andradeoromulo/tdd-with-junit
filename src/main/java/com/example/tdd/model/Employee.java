package com.example.tdd.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate hireDate;
    private BigDecimal grossPay;
    private BigDecimal netPay;

    public Employee(String name, LocalDate hireDate, BigDecimal grossPay) {
        this.name = name;
        this.hireDate = hireDate;
        this.grossPay = grossPay;
    }

    public BigDecimal getGrossPay() {
        return grossPay;
    }

    public BigDecimal getNetPay() {

        BigDecimal deductions = calculateDeductions();
        this.netPay = grossPay.subtract(grossPay.multiply(deductions)).setScale(2, RoundingMode.HALF_UP);

        return this.netPay;
    }

    private BigDecimal calculateDeductions() {

        if(this.grossPay.compareTo(new BigDecimal("2000")) > 0)
            return new BigDecimal("0.3");

        return new BigDecimal("0.2");
    }

    public void applySalaryAdjustment(Performance performance) {

        BigDecimal adjustment = grossPay.multiply(performance.getAdjustmentPercent());
        this.grossPay = grossPay.add(adjustment).setScale(2, RoundingMode.HALF_UP);

    }
}
