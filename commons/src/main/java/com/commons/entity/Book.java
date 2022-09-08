package com.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * (db_book)表实体类
 *
 * @author Kamisora
 * @since 2022-07-24 11:02:43
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "db_book")
public class Book {

    private Long bid;

    private String title;

    private String desc;

}

