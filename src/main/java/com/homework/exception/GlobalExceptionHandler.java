package com.homework.exception;

import com.homework.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
        log.error("----------------->捕捉到全局异常",e);

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }


    public R jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception{

        //TODO 错误日志处理

        return R.fail(e.getMessage(), "some data");
    }
}
