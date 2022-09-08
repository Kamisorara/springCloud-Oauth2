package com.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.commons.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

    Book getBookById(Long bookId);
}
