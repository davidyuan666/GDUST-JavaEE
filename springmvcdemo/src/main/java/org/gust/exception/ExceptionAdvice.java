package org.gust.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@ControllerAdvice
public class ExceptionAdvice { 
    // 处理MyException类型的异常
    @ExceptionHandler(MyException.class)
    public ModelAndView doMyException(MyException ex) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", ex.getMessage());
        modelAndView.setViewName("error.jsp"); 
        return modelAndView;
    } 
    
    // 处理Exception类型的异常
    @ExceptionHandler(Exception.class)
    public ModelAndView doOtherException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "System error occurred");
        modelAndView.setViewName("error.jsp");
        return modelAndView;
    }
}