package com.example.demo.registration;


import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserRole;
import com.example.demo.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;

    public String register(RegistrationRequest request) {
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
