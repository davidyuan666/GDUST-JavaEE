package com.itheima.service.impl;

import com.itheima.dao.BookMapper;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Auther:bingli
 * ClassName:BookServiceImpl
 * Package:com.itheima.service.impl
 * Description:
 *
 * @date:2023/4/15-04-15 19:22
 * @author:2550976002@qq.com
 * @version:1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }
}
