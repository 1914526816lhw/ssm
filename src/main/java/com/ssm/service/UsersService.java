package com.ssm.service;

import com.ssm.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * ClassName：UsersService
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/7/4 19:12
 * @version 1.0.0
 */
@Repository
public interface UsersService {
    Users getUser();
}
