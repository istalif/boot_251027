package com.boot.boot_251027;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
//3333
public class ExamController {
    @RequestMapping("/")
    public String home(){
        log.info("hello boot 111 222 444");
        return "hello"; 
    }
}
