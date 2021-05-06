package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class WholesaleOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "purchase_order_num")
    private String purchaseOrderNum;

    @Column(name = "terms")
    private String terms;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "purchase_date")
    private Date datePurchased;

    @Column(name = "shipped_date")
    private Date dateShipped;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
