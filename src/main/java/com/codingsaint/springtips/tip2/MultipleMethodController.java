package com.codingsaint.springtips.tip2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MultipleMethodController {
    //@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, value = "user")
    @PutMapping("user")
    @PostMapping("user")
    public ResponseEntity<User> addOrUpdate(@RequestBody User user) {
        if (ObjectUtils.isEmpty(user.getId())) {
            //Your Logic to save goes here, Dummy logic to below
            log.info("Save the new user {}", user);
            user.setId(1l);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } else {
            //Your Logic to update goes here, Dummy logic to update
            log.info("Update The User {}", user);
            return new ResponseEntity<>(user, HttpStatus.OK);

        }
    }

}
