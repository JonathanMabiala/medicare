package com.ryzeon.medicare.controller;

import com.ryzeon.medicare.dto.Purchase;
import com.ryzeon.medicare.dto.PurchaseResponse;
import com.ryzeon.medicare.service.CheckOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckOutController {

    private final CheckOutService checkOutService;

    @Autowired
    public CheckOutController(CheckOutService checkOutService){
        this.checkOutService = checkOutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){

        PurchaseResponse purchaseResponse = checkOutService.placeOrder(purchase);

        return  purchaseResponse;
    }

}












