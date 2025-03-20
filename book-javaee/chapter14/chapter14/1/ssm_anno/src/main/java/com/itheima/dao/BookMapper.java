package com.itheima.dao;

import com.itheima.domain.Book;

/**
 * Auther:bingli
 * ClassName:BookMapper
 * Package:com.itheima.dao
 * Description:
 *
 * @date:2023/4/15-04-15 19:17
 * @author:2550976002@qq.com
 * @version:1.0
 */
public interface BookMapper {
    public Book findBookById(Integer id);
}
