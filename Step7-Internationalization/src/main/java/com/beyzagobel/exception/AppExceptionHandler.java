package com.beyzagobel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class AppExceptionHandler {


    @ExceptionHandler(value = NoHandlerFoundException.class)

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String handleException(HttpServletRequest request,Exception e){
        System.err.println(request.getRequestURI() + " isteği gerçekleşirken hata oluştu! Hata mesajı : " + e.getMessage());
        return "404";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = RuntimeException.class)  // ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException,ClassCastException,IOException
    public String handleInternal(HttpServletRequest request,Exception e){

        System.err.println(request.getRequestURI() + " isteği gerçekleşirken hata oluştu! Hata mesajı : " + e.getMessage());
        return "500";

    }

}
