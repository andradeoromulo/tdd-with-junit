package com.example.tdd.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void should_calculate_net_pay_to_gross_pay_under_2000() {

        Employee employee = new Employee("Eric ", LocalDate.now(), new BigDecimal("1000.00"));
        BigDecimal expectedNetPay = new BigDecimal("800.00");

        assertEquals(expectedNetPay, employee.getNetPay());

    }

    @Test
    public void should_calculate_net_pay_to_gross_pay_above_2000() {

        Employee employee = new Employee("Hanna ", LocalDate.now(), new BigDecimal("10000.00"));
        BigDecimal expectedNetPay = new BigDecimal("7000.00");

        assertEquals(expectedNetPay, employee.getNetPay());

    }

    @Test
    public void should_calculate_and_conceive_salary_adjustment_to_low_performance() {

        Employee employee = new Employee("Sheldon", LocalDate.now(), new BigDecimal("1000.00"));
        employee.applySalaryAdjustment(Performance.LOW);
        BigDecimal expectedGrossPay = new BigDecimal("1050.00");

        assertEquals(expectedGrossPay, employee.getGrossPay());

    }

    @Test
    public void should_calculate_and_conceive_salary_adjustment_to_average_performance() {

        Employee employee = new Employee("Howard", LocalDate.now(), new BigDecimal("1000.00"));
        employee.applySalaryAdjustment(Performance.AVERAGE);
        BigDecimal expectedGrossPay = new BigDecimal("1150.00");

        assertEquals(expectedGrossPay, employee.getGrossPay());

    }

    @Test
    public void should_calculate_and_conceive_salary_adjustment_to_high_performance() {

        Employee employee = new Employee("Bernadette", LocalDate.now(), new BigDecimal("1000.00"));
        employee.applySalaryAdjustment(Performance.HIGH);
        BigDecimal expectedGrossPay = new BigDecimal("1200.00");

        assertEquals(expectedGrossPay, employee.getGrossPay());

    }

}