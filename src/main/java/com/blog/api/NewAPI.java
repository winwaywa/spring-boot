package com.blog.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dto.NewDTO;

//@Controller
@RestController // = @Controller + @RequestBody
public class NewAPI {

//    @RequestMapping(value = "/new", method = RequestMethod.POST)
//    @ResponseBody
//    public NewDTO createNew(@RequestBody NewDTO model) {
//            return model;
//    }
    
    @PostMapping("/new") // @RequestMapping + RequestMethod.POST
    public NewDTO createNew(@RequestBody NewDTO model) {
            return model;
    }
}
