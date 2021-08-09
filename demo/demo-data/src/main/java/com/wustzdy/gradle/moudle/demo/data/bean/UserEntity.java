package com.wustzdy.gradle.moudle.demo.data.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wustzdy.gradle.moudle.demo.spec.contant.UserType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@TableName(UserEntity.TABLE_NAME)
public class UserEntity {
    public static final String TABLE_NAME = "demo_user.table";

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "created_time")
    private Date createdTime;

    @TableField(value = "updated_time")
    private Date updatedTime;

    @TableField(value = "question_type")
    private UserType questionType;


}