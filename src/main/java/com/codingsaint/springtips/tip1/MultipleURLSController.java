
package com.codingsaint.springtips.tip1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;

@RestController
public class MultipleURLSController {
    @GetMapping(value = {"users","customers"})
    public Collection<String> users(){
        return Set.of("Deepansh","Pallav","Rahul","Utkarsh");
    }

}

