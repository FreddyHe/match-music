package com.music.framework.mvc;

import com.music.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result handle(RuntimeException runtimeException){
        return Result.fail(runtimeException.getMessage());
    }

}
