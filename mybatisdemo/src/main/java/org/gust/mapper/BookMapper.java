package org.gust.mapper;

import org.gust.pojo.Book;

public interface BookMapper {
    Book findBookById(Integer id);
    void updateBook(Book book);
}