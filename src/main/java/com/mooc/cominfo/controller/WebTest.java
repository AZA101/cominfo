package com.mooc.cominfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class WebTest {
    @GetMapping("/look")
    public ModelAndView look() {
        return new ModelAndView("common/test");
    }

}
