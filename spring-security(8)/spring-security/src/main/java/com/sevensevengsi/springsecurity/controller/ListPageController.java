package com.sevensevengsi.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/list")
public class ListPageController {

    @GetMapping("/listManager")
    public String forAdmin(){
        return "admin/listManager";
    }

    @GetMapping("/machineStatus")
    public String forOwner(){
        return "owner/machineStatus";
    }

    @GetMapping("/listOfLaundryRequest")
    public String forStoreManager(){
        return "storeManager/listOfLaundryRequest";
    }

    @GetMapping("/listOfLaundryStore")
    public String forCustomer(){
        return "customer/listOfLaundryStore";
    }
}
