package org.gust.controller;

import java.io.IOException;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gust.exception.MyException;


@Controller
public class ExceptionController {
    // 抛出空指针异常
    @RequestMapping("/showNullPointer")
    public void showNullPointer() {
        ArrayList<Object> list = null;
        System.out.println(list.get(2));
    }
    
    // 抛出IO异常
    @RequestMapping("/showIOException")
    public void showIOException() throws IOException {
        throw new IOException("IO Exception demo");
    }
    
    // 抛出算术异常
    @RequestMapping("/showArithmeticException")
    public void showArithmeticException() {
        int result = 10 / 0;
    }

    @RequestMapping("addData")
    public void addData() throws MyException {
            throw new MyException("新增数据异常！");
    }

}