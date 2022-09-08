package com.book.controller;


import com.book.service.BookService;
import com.commons.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") Long bid) {
        return bookService.getBookById(bid);
    }
}
