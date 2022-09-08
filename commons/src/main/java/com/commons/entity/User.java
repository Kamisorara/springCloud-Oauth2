package com.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (db_user)表实体类
 *
 * @author Kamisora
 * @since 2022-07-24 11:02:05
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value= "db_user")
public class User {
    //用户id
    private Long uid;
    //用户名
    private String name;
    //用户年龄
    private Integer age;
    //用户性别
    private String sex;

}

