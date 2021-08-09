package com.wustzdy.gradle.moudle.demo.spec.api;

import com.wustzdy.gradle.moudle.demo.spec.model.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface UserDemoApi {

    String BASE_PATH = "/demo/user";

    @Operation(summary = "创建用户")
    @PostMapping(BASE_PATH + "/_createUser")
    User createUser(@RequestBody @Valid User user);
}
