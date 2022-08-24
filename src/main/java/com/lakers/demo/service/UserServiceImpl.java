package com.lakers.demo.service;

/**
 * Created on 2022/8/23 15:19
 *
 * @author Lakers
 */
public class UserServiceImpl implements IUserService{


    @Override
    public String queryUserNameById(String userId) {
        return "hi user " + userId;
    }
}
