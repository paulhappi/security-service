package com.nufi.web;

import com.nufi.entities.AppUser;
import com.nufi.service.AccountService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paul Happi
 *
 */

@RestController
public class UserController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public AppUser register(@RequestBody UserForm userForm){
        return accountService.saveUser(userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword());
        /*
        // Check if the passwords are matching
        if(!userForm.getPassword().equals(userForm.getConfirmedPassword()))
            throw new RuntimeException("You must confirm your password");

        // Check if the username already exist in the database
        AppUser user = accountService.findUserByUsername(userForm.getUsername());
        if(user != null) throw new RuntimeException("This user already exists");

        AppUser appUser = new AppUser();
        appUser.setUsername(userForm.getUsername());
        appUser.setPassword(userForm.getPassword());
        accountService.saveUser(appUser);
        accountService.addRoleToUser(userForm.getUsername(), "USER");
        return appUser;
        */
    }
}
