package com.M20.M20b.decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String getDescription() {
        return "Drive a course";
    }
}
