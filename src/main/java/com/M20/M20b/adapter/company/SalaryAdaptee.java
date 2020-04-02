package com.M20.M20b.adapter.company;


import com.M20.M20b.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.M20.M20b.adapter.company.newhrsystem.Employee;
import com.M20.M20b.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
