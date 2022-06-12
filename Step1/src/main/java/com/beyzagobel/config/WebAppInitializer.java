package com.beyzagobel.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/*
 * Dispatcher Servlet : Bütün isteklerin karşılandığı ve gelen istekleri uygun controller'a yönlendiren Front Controller tanımı
 * WebApplicationInitializer arayüzünün onStartup metodunda Dispatcher Servlet tanımlanır.
*/
public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) {

        AnnotationConfigWebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("DispatcherServlet",new DispatcherServlet(context));
        dispatcherServlet.setLoadOnStartup(1);
        dispatcherServlet.addMapping("/");

        /*
         * UTF-8 Karakter Kodlaması için bir Web Filtresi
         * Dispatcher Servler'den önce işleme alınır.
         */
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setForceRequestEncoding(true);
        characterEncodingFilter.setForceResponseEncoding(true);
        servletContext.addFilter("characterEncodingFilter",characterEncodingFilter).addMappingForUrlPatterns(null,false,"/*");
    }

    private AnnotationConfigWebApplicationContext getContext(){
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.beyzagobel.config");
        return context;
    }
}
