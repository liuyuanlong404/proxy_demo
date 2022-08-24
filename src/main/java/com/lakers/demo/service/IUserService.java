package com.lakers.demo.service;

/**
 * Created on 2022/8/23 15:18
 *
 * @author Lakers
 */
public interface IUserService {

    /**
     * 根据用户id查询用户名称
     *
     * @param userId 用户id
     * @return 用户名称
     */
    String queryUserNameById(String userId);
}
