package com.ryzeon.medicare.service;

import com.ryzeon.medicare.dao.CustomerRepository;
import com.ryzeon.medicare.dto.Purchase;
import com.ryzeon.medicare.dto.PurchaseResponse;
import com.ryzeon.medicare.entity.Customer;
import com.ryzeon.medicare.entity.Order;
import com.ryzeon.medicare.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckOutServiceImpl implements CheckOutService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CheckOutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }



    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        //
        Order order = purchase.getOrder();


        //
        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        //
        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach( item -> order.add(item));


        //
        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        //
        Customer customer = purchase.getCustomer();
        customer.add(order);

        //
        customerRepository.save(customer);


        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        //

        return UUID.randomUUID().toString();
    }
}
