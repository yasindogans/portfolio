package com.taysgroup.portfolio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping(path = "/message",method = RequestMethod.GET)
    public String message(){
        return "{message:\"bu sunucudan aldığım bir mesaj...\"}";
    }
}
