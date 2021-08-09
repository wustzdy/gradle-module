package com.wustzdy.gradle.moudle.demo.core.bean;

import com.wustzdy.gradle.moudle.demo.data.bean.UserEntity;
import com.wustzdy.gradle.moudle.demo.data.mapper.UserMapper;
import com.wustzdy.gradle.moudle.demo.spec.api.UserDemoApi;
import com.wustzdy.gradle.moudle.demo.spec.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class UserService implements UserDemoApi {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User createUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
//        userMapper.insert(userEntity);
        return null;
    }
}
