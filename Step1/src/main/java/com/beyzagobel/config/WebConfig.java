package com.beyzagobel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*
 * Servlet 3 öncesi web.xml dosyasında yapılan uygulama konfigürasyonları,
 * Servler3+ sonrası teknolojilerde Java sınıfları ile yapılabilmektedir.
 * Bizde burada web.xml dosyasını siliyoruz ve onun yerine konfigürasyon sınıflarımızı config paketinde tanımlayacağız.
 * Paket adı size kalmış.
 * 1- ViewResolver :
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.beyzagobel"})
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver jspViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setContentType("text/html;charset=UTF-8");
        return viewResolver;
    }
}
