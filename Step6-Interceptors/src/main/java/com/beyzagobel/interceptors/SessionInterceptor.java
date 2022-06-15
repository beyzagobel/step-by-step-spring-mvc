package com.beyzagobel.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Interceptors (Kesiciler): Controller sınıflarına uygulanarak
 * sınıflardaki metodlar çağrılmadan önce,sonra veya yürütüm esnasında işlem yapabilme imkanı sunarlar.
 * Kullanım yerleri olarak Yetkilendirme (Authorization),Loglama (Logger-log4j),Hata Yönetimi.
 * Ancak yürütüm başarılı olursa bir sonraki adıma geçilir.
 */
@Component
public class SessionInterceptor  extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{

        HttpSession session = request.getSession();
        Object email = session.getAttribute("email");
        if(email == null){
            throw new NoHandlerFoundException(request.getMethod(),request.getRequestURI(),null);
        }
        else{
            return true;
        }

    }




}
