package ru.credit.demo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class RestResource {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@PathParam("value") String value){
        return value;
    }
}
