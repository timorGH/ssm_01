package com.chinasoft.dao;

import com.chinasoft.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {


    @Select("select * from tab_user")
    List<User> findAll();
}
