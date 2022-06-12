package com.beyzagobel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/*
 * Servler 3+ sonrası teknolojilerde uygulama konfigürasyonunu web.xml yerine  Java sınıfları ile yapılabilmektedir.
 * Bizim kullanacağımızda xml tabanlı konfigürasyon değil Java tabanlı konfigürasyondur.
 * O yüzden ilk işimiz web.xml dosyasını siliyoruz ve onun yerine bir config paketi(adı farketmez) tanımlayarak WebConfig (adı farketmez)
 * sınıfında konfigürasyonlarımızı yapıyoruz.
 *
 * Proje ilk oluştuğunda .jsp dosyalarımız  WEB-INF altında oluşur. Böylelikle direkt erişime karşı security sağlanmış olur.
 * WEB-INF altında view directory oluşturunuz ve .jsp dosyalarını burada olşturabilsiniz.
 *
 * ViewResolver : View isimlerinden fiziksel görüntü sayfalarının çözümlenmesini sağlar. Örn: controller da return index der isek
 * bize index.jsp döndürür.
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
