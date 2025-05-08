package org.gust.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

@ControllerAdvice
public class MyException extends Exception {
    private String message; // 异常信息
    
    public MyException(String message) {
        super(message);
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception ex) {
        String msg;
        if (ex instanceof MyException) {
            //自定义异常，将异常信息直接返回
            msg = ex.getMessage();
        } else {
            // 如果是系统的异常，从堆栈中获取异常信息
            Writer out = new StringWriter();
            PrintWriter s = new PrintWriter(out);
            ex.printStackTrace(s);
            String sysMsg = out.toString(); // 系统真实异常信息
            msg = "网络异常！"; // 向客户隐藏真实的异常信息，仅发送提示信息
        }
        return msg;
    }
}