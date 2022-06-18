package com.beyzagobel.interceptors;

import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionInterceptor extends HandlerInterceptorAdapter {

  /*  @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object email = session.getAttribute("email");
        if(email == null){
            throw new NoHandlerFoundException(request.getMethod(),request.getRequestURI(),null);
        }else{
            return true;
        }
    }

   */
}
