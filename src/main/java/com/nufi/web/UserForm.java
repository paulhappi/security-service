package com.nufi.web;

import lombok.Data;

/**
 * @author Paul Happi
 *
 */

@Data
public class UserForm {

    private String username;
    private String password;
    private String confirmedPassword;
}
