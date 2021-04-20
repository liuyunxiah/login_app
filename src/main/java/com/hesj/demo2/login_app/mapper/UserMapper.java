package com.hesj.demo2.login_app.mapper;

import com.hesj.demo2.login_app.domin.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    public User queryByName(String username);

    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void insert(User user);
}
