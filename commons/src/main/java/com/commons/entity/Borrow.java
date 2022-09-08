package com.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (Borrow)表实体类
 *
 * @author Kamisora
 * @since 2022-07-24 11:02:25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value= "db_borrow")
public class Borrow {
    //主键id
    private Long id;
    
    private Long uid;
    
    private Long bid;

}

