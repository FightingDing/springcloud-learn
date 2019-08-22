package com.ft.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xiaobai on 2019-08-22.
 */
@FeignClient(value = "service-hi")
public interface ServiceHi {

    @GetMapping("hi")
    String hiService(@RequestParam(value = "name") String name);

}
