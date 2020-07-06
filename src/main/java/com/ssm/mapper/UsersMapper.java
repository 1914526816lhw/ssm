package com.ssm.mapper;

import com.ssm.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * ClassName：UsersDao
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/7/4 20:47
 * @version 1.0.0
 */
@Repository
public interface UsersMapper {
    Users selectUserByUserId(int userId);
}
