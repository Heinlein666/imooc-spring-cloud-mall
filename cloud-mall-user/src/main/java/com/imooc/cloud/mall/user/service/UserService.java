package com.imooc.cloud.mall.user.service;


import com.imooc.cloud.mall.common.exception.ImoocMallException;
import com.imooc.cloud.mall.user.model.pojo.User;

/**
 * 描述：     UserService
 */
public interface UserService {

    void register(String userName, String password) throws ImoocMallException;

    User login(String userName, String password) throws ImoocMallException;

    void updateInformation(User user) throws ImoocMallException;

    boolean checkAdminRole(User user);
}
