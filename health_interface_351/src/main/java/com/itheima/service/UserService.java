package com.itheima.service;

import com.itheima.entity.Result;
import com.itheima.pojo.SysUser;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 * @Version 1.0
 */
public interface UserService {


    SysUser findUserByName(String username);

    Result findMenuByName(String username);
}
