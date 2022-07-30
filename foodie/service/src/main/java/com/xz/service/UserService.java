package com.xz.service;

import com.xz.pojo.Users;
import com.xz.pojo.bo.UserBO;

public interface UserService {

    public boolean queryUsernameIsExist(String username);

    public Users createUser(UserBO userBO);
}
