package com.goswift.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "system_config")
@Data
public class SystemConfig {
    @Id
    private Integer configId =1;

    @Column(name = "service_tax_pct")
    private BigDecimal serviceTaxPct;

    @Column(name = "booking_fee")
    private BigDecimal bookingFee;
}