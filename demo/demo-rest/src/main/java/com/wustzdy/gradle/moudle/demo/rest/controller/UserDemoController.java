package com.wustzdy.gradle.moudle.demo.rest.controller;

import com.wustzdy.gradle.moudle.demo.core.bean.UserService;
import com.wustzdy.gradle.moudle.demo.spec.api.UserDemoApi;
import com.wustzdy.gradle.moudle.demo.spec.model.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "用户APi")
@RestController
public class UserDemoController implements UserDemoApi {

    @Autowired
    private UserService userService;
    @Override
    public User createUser(User user) {
        return userService.createUser(user);
    }
}
