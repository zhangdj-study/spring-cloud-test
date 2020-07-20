package com.neusiri.provider.ticket.controller;

import com.neusiri.provider.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdj
 * @date 2020-07-17 18:03
 */
@RestController
@RequestMapping("ticket")
public class TicketController {

    @Autowired
    ServerProperties serverProperties;

    @Autowired
    private TicketService ticketService;

    @GetMapping("getTicket")
    public String getTicket(){
        System.out.println(serverProperties.getPort());
        return ticketService.getTicket();
    }
}
