package com.wickedwitch.commands;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by ZuZ on 2017-01-27.
 */
@Data
public class LoginCommand {

    @NotEmpty
    @Size(min = 6)
    private String username;

    @NotEmpty
    @Size(min = 8)
    private String password;

}
