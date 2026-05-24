package com.example.cycle_price.dto;

import java.math.BigDecimal;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CycleConfigurationDto {

    private BigDecimal frame;

    private BigDecimal handleBarAndBrakes;

    private BigDecimal seating;

    private BigDecimal wheels;

    private BigDecimal chainAssembly;

    private BigDecimal totalPrice;
}
