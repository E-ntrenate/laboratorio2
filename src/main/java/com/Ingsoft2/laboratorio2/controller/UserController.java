package com.Ingsoft2.laboratorio2.controller;

import com.Ingsoft2.laboratorio2.pojo.RegisterUserPOJO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {

    @PostMapping(value = {"/registro/{roleId}"})
    public ResponseEntity register(@PathVariable Integer roleId,
                                   @RequestBody RegisterUserPOJO userPOJO){
        return null;
    }
}


