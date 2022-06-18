package com.beyzagobel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
 * AppConfig, Spring veritabanı işlemlerinin tanımlanacağı konfigürasyon sınıfıdır.
 * Transaction Manager ve Session Factory bean'leri tanımlanır.
 * Transaction Manager, veritabanı ile yapılan bütün etkileşimlerin nasıl yapılacağını belirler.
 * SessionFactory, veritabanı ile iletişim için kullanılacak olan session(oturum)'ların tanımı ve yönetimi yapılır.
 */
@EnableTransactionManagement
@Configuration
@ComponentScan(basePackages ={"com.beyzagobel"})
public class AppConfig {

    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        return factoryBean;
    }
    @Bean
    public HibernateTransactionManager getTransactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());  // SessionFactory nesnesi oluşturulur
        return transactionManager;
    }
}
