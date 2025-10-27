package com.boot.boot_251027;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
//333
public class ExamController {
    @RequestMapping("/")
    public String home(){
        log.info("hello boot 111");
        return "hello";
    }
}
