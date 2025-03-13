package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Auther:bingli
 * ClassName:BookController
 * Package:com.itheima.controller
 * Description:
 *
 * @date:2023/4/15-04-15 19:25
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book")
    public ModelAndView findBookById(Integer id) {
        Book book = bookService.findBookById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book.jsp");
        modelAndView.addObject("books", book);
        return modelAndView;
    }
}
