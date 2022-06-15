package com.beyzagobel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*
 * Controller sınflarında meydana gelebilecek exception'ları yakalamak için sınıf seviyesinde
 * @ControllerAdvice annotation'ı kullanılır.
 */
@ControllerAdvice
public class AppExceptionHandler {
    /*
     * @ExceptionHandler ile tanımlanan metodların value ile tanımlanan exception'ları karşımak üzere kullanılacağını belirtiriz.
     * Http Durum Kodları : istemci sunucudan HTTP kullanrak bir içeriğe ulaşmak istediğinde sunucu yanıtını durumunu durum kodu ile belirtir.
     * @ResponceStatus anotation'ı ile biz sunucunun cevabının durum kodunu belirtebiliriz.
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)  /* NOT_FOUND : 404 , Kaynak Bulunamadı */
    public String handleException(HttpServletRequest request,Exception exception){

        System.err.println(request.getRequestURI() + " isteği gerçekleşirken hata oluştu! Hata mesajı : " + exception.getMessage());
        return "404";

    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = RuntimeException.class)  /* ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException,ClassCastException,IOException */
    public String handleInternal(HttpServletRequest request,Exception exception){

        System.err.println(request.getRequestURI() + " isteği gerçekleşirken hata oluştu! Hata mesajı : " + exception.getMessage());
        return "500";

    }




}
