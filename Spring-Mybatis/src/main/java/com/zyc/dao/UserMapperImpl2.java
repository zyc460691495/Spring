package com.zyc.dao;

import com.zyc.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;


public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{


    @Override
    public List<User> queryAllUsers() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryAllUsers();
        return users;
    }
}
