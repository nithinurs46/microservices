package com.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private String orderId;
    private double amount;
}