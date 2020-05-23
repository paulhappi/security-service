package com.nufi.service;

import com.nufi.entities.AppRole;
import com.nufi.entities.AppUser;

/**
 * @author Paul Happi
 *
 */

public interface AccountService {

    public AppUser saveUser(String username,String password,String confirmedPassword);
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username,String rolename);
}
