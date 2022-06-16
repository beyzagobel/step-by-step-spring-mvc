package com.beyzagobel.interceptors;

import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionInterceptor extends HandlerInterceptorAdapter {

    /*
     * HandlerInterceptorAdapter interface'inin preHandle metodu,
     * WebConfig'de addPathPattern de tanımlanan istekler karşılanmadan ÖNCE istekleri keser.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object email = session.getAttribute("email");
        /*
         * /loginKontrol metodu exclude edilmiş evet ama loginKontrol metodundaki email parametresi null ise yani
         * URL'den ulaşılmaya çalışılınırsa oda 404 sayfası döndürür,erişemeyiz.
         */
        if(email == null){
            throw new NoHandlerFoundException(request.getMethod(),request.getRequestURI(),null);
        }
        else{
            return true;
        }
    }


}
