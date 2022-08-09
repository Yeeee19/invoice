package com.wym.invoice.controller;

import com.wym.invoice.service.ex.ReturnErrorException;
import com.wym.invoice.service.ex.ServiceException;
import com.wym.invoice.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

    public static final int OK = 200;

    @ExceptionHandler(ServiceException.class)
    public JsonResult<Void> exceptionHandler(Throwable e){
        JsonResult<Void> result = new JsonResult<>(e);

        if(e instanceof ReturnErrorException){
            result.setState(4000);
            result.setMessage("沒有正確的收到回應");
        }

        return result;
    }

}
