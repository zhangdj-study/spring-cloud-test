package com.neusiri.consumer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangdj
 * @date 2020-07-17 18:20
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("buy")
    public String buy(){
        System.out.println("222");
        String object = restTemplate.getForObject("http://provider-ticket/ticket/getTicket", String.class);
        return "buy" + object;
    }
}
