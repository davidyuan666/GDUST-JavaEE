package com.itheima.domain;

/**
 * Auther:bingli
 * ClassName:Book
 * Package:com.itheima.domain
 * Description:
 *
 * @date:2023/4/15-04-15 19:16
 * @author:2550976002@qq.com
 * @version:1.0
 */
public class Book {
    private Integer id;            //图书id
    private String name;        //图书名称
    private String press;        //出版社
    private String author;        //作者

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
