package com.zyc.dao;

import com.zyc.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;


public class UserMapperImpl implements UserMapper{

//    原来的所有的操作都是通过sqlSession来做 ，现在通过sqlSessionTemplate

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> queryAllUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryAllUsers();
        return users;
    }
}
