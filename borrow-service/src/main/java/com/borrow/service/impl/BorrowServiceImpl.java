package com.borrow.service.impl;

import com.borrow.entity.resp.UserBorrowDetail;
import com.borrow.mapper.BorrowMapper;
import com.borrow.service.BorrowService;
import com.borrow.service.client.BookClient;
import com.borrow.service.client.UserClient;
import com.commons.entity.Book;
import com.commons.entity.Borrow;
import com.commons.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    private BorrowMapper borrowMapper;
    @Resource
    private BookClient bookClient;

    @Resource
    private UserClient userClient;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(Long uid) {
        List<Borrow> borrow = borrowMapper.getBorrowByUid(uid);
        //RestTemplate支持多种方式的远程调用
        //这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        //获取获取用户信息
        User user = userClient.getUserById(uid);
        //获取每一本书的详细信息
        List<Book> bookList = new ArrayList<>();
        for (Borrow b : borrow) {
            Book book = bookClient.getBookById(b.getBid());
            bookList.add(book);
        }
        return new UserBorrowDetail(user, bookList);
    }
}
