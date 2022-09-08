package com.borrow.entity.resp;

import com.commons.entity.Book;
import com.commons.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
