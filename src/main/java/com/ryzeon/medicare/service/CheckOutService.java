package com.ryzeon.medicare.service;

import com.ryzeon.medicare.dto.Purchase;
import com.ryzeon.medicare.dto.PurchaseResponse;
import org.springframework.stereotype.Service;


public interface CheckOutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
