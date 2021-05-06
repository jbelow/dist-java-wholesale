package edu.wctc.wholesale.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {

    private int orderId;
    private String customerName;
    private String date;
    private String poNumber;
    private String productName;
    private String terms;
    private double total;


}