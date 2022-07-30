package com.xz.controller;

import com.xz.pojo.bo.UserBO;
import com.xz.service.UserService;
import com.xz.utils.IMOOCJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExist")
    public IMOOCJSONResult usernameIsExist(@RequestParam String username) {
        if (StringUtils.isBlank(username)) {
            return IMOOCJSONResult.errorMsg("Username doesn't exist");
        }

        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist) {
            return IMOOCJSONResult.errorMsg("Username have already exist");
        }

        return IMOOCJSONResult.ok();
    }

    @PostMapping("/register")
    public IMOOCJSONResult register(@RequestBody UserBO userBO) {

        String username = userBO.getUsername();
        String password = userBO.getPassword();
        String confirmPwd = userBO.getConfirmPassword();

        if (StringUtils.isBlank(username) ||
                StringUtils.isBlank(password) ||
                StringUtils.isBlank(confirmPwd)) {
            return IMOOCJSONResult.errorMsg("username or password can not be empty");
        }

        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist) {
            return IMOOCJSONResult.errorMsg("Username have already exist");
        }

        if (password.length() < 6) {
            return IMOOCJSONResult.errorMsg("the length of password can not less than 6");
        }

        if (!password.equals(confirmPwd)) {
            return IMOOCJSONResult.errorMsg("enter password are not same");
        }
        userService.createUser(userBO);

        return IMOOCJSONResult.ok();
    }

}