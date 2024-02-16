package com.test.formonix;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity) {
}
