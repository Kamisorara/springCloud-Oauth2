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
@TableName(value = "db_user")
public class User {
    //用户id
    private Long userId;
    //用户名
    private String userName;
    //密码
    private String password;

}

