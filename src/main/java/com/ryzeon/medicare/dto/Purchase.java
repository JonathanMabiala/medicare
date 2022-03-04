package com.ryzeon.medicare.dto;

import com.ryzeon.medicare.entity.Address;
import com.ryzeon.medicare.entity.Customer;
import com.ryzeon.medicare.entity.Order;
import com.ryzeon.medicare.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;


}
