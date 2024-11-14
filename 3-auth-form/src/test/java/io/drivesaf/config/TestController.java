package io.drivesaf.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: DRIVESAF
 * @createTime: 2024/11/14 19:17
 * @description:
 **/
@RequestMapping
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hello Spring Security";
    }
}