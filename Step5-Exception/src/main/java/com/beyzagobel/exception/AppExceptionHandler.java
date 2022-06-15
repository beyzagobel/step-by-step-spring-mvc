package com.beyzagobel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

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
    @ResponseStatus(value = HttpStatus.NOT_FOUND)  /* NOT_FOUND : 404 , Kaynak Bulunamadı */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public void handleException(HttpServletRequest request,Exception exception){

        System.err.println(request.getRequestURI() + " isteği gerçekleşirken hata oluştu! Hata mesajı : " + exception.getMessage());

    }


}
