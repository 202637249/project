package com.mpri.project.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2019/11/28 10:57
 * @Created by lzq
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @RequestMapping("/test")
    public String Test() {
        return "123";
    }
}
