package com.zhangl.smduser.dao;

import com.zhangl.smduser.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    String TABLE_NAME="user";
    String BASE_FILE="userId,userName,phone";

    @Select({"select" , BASE_FILE ,"from ",TABLE_NAME,"where userId=#{userId}"})
    User getUserById(Integer userId);
}
