package com.nsapi.niceschoolapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nsapi.niceschoolapi.entity.Role;
import com.nsapi.niceschoolapi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Set;


public interface UserMapper extends BaseMapper<User> {

    User selectUserByMap(Map<String,Object> map);

    void saveUserRoles(@Param("userId")String id, @Param("roleIds")Set<Role> roles);

    void dropUserRolesByUserId(@Param("userId")String id);
}