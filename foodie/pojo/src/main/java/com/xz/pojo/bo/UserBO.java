package com.xz.pojo.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "user object BO", description = "data store in the entity")
public class UserBO {

    @ApiModelProperty(value = "username", name = "username", example = "xz", required = true)
    private String username;

    @ApiModelProperty(value = "password", name = "password", example = "123456", required = true)
    private String password;

    @ApiModelProperty(value = "confirmPassword", name = "confirmPassword", example = "123456", required = true)
    private String confirmPassword;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
