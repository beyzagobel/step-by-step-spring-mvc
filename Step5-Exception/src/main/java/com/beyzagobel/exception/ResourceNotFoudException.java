package com.beyzagobel.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * Http Responce durum yönetimi için metod seviyesinde @ResponceStatus tanımlanır.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoudException extends RuntimeException{
    public ResourceNotFoudException(){
        super("Kaynak bulunamadı!");
    }
}
