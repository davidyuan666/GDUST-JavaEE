package org.gust.pojo;
import java.io.Serializable;


public class Book implements Serializable {
    private Integer id;                    // 主键
    private String bookName;       // 图书名称
    private double price;    private String author;     // 价格、作者
    // 省略getter/setter方法
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id + ", bookName='" + bookName +
                ", price=" + price + ", author='" + author+ '}';
    }
}
