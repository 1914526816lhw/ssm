package com.ssm.service.impl;

import com.ssm.entity.Users;
import com.ssm.mapper.UsersMapper;
import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName：UsersServiceImpl
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/7/4 19:12
 * @version 1.0.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getUser() {
        return usersMapper.selectUserByUserId(1);
    }
}
