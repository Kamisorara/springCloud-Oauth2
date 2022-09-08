package com.borrow.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commons.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BorrowMapper extends BaseMapper<Borrow> {
    List<Borrow> getBorrowByUid(Long userId);

    List<Borrow> getBorrowByBid(Long bookId);

    Borrow getBorrow(@Param("userId") Long userId, @Param("bookId") Long bookId);
}
