package com.sucritydemo.sucrity.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Home {

    @RequestMapping("/getMesg/{mesg}")
    public String getMesg(@PathVariable(value = "mesg") String mesg) {
        return mesg;
    }
}
