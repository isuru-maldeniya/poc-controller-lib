package com.xventure.xapi.libs.notification.poclib;

import com.xventure.xapi.libs.notification.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@AllArgsConstructor
public class PocController {

    private final TestService testService;

    @GetMapping(value = "/{name}")
    public void test(@PathVariable String name){
        System.out.println("Hi "+name);
        testService.saveTestCollection(name);
    }


}
