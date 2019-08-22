package com.ft.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaobai on 2019-08-22.
 */
@RestController
public class Controller {

    @Autowired
    private ServiceHi helloService;

    @GetMapping("hi")
    public String hi(String name) {
        return helloService.hiService(name);
    }

}
