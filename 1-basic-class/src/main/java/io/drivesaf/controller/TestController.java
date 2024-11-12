package io.drivesaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: DRIVESAF
 * @createTime: 2024/11/12 14:10
 * @description:
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public Object test() {
        return "Hello World!";
    }
}
