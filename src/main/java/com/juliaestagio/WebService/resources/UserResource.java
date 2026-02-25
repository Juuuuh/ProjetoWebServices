package com.juliaestagio.WebService.resources;

import com.juliaestagio.WebService.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Camila", "camila@gmail.com", "1234", "914536035");
        return ResponseEntity.ok().body(u);
    }
}
