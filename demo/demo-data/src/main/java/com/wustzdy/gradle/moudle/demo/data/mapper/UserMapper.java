package com.wustzdy.gradle.moudle.demo.data.mapper;

import com.baomidou.mybatisplus.annotation.SqlParser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wustzdy.gradle.moudle.demo.data.bean.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;


@SqlParser(filter = true)
public interface UserMapper extends BaseMapper<UserEntity> {

    @Insert(" insert into " + UserEntity.TABLE_NAME + " (id,created_time,updated_time,question_type,question_description,contact,contact_telephone,contact_email,corporate_name) " +
            " values(#{entity.id},#{entity.createdTime},#{entity.updatedTime},#{entity.questionType},#{entity.questionDescription},#{entity.contact},#{entity.contactTelephone},#{entity.contactEmail},#{entity.corporateName}) ")
    int insert(@Param("entity") UserEntity entity);
}