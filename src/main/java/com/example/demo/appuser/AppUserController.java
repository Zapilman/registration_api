package com.example.demo.appuser;


import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/users")
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET})
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping
    public List<AppUser> getAllUsers(){
       return appUserService.getAllUsers();
    }
}
