package com.zyc.dao;

import com.zyc.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;


public class UserMapperImpl implements UserMapper{

//    ԭ�������еĲ�������ͨ��sqlSession���� ������ͨ��sqlSessionTemplate

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
