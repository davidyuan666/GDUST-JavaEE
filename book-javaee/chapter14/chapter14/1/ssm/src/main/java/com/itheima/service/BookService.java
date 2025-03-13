package com.itheima.service;

import com.itheima.domain.Book;

/**
 * Auther:bingli
 * ClassName:BookService
 * Package:com.itheima.service
 * Description:
 *
 * @date:2023/4/15-04-15 19:19
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface BookService {
    public Book findBookById(Integer id);
}
