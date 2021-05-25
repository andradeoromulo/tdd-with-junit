package com.example.tdd;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void should_calculate_net_pay_to_gross_pay_under_2000() {

        Employee employee = new Employee("Eric ", LocalDate.now(), new BigDecimal("1000"));
        BigDecimal expectedNetPay = new BigDecimal("800.00");

        assertEquals(expectedNetPay, employee.getNetPay());

    }

    @Test
    public void should_calculate_net_pay_to_gross_pay_above_2000() {

        Employee employee = new Employee("Eric ", LocalDate.now(), new BigDecimal("10000"));
        BigDecimal expectedNetPay = new BigDecimal("7000.00");

        assertEquals(expectedNetPay, employee.getNetPay());

    }

}