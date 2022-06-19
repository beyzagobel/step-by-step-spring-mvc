## Spring MVC 5 Service and DAO

![image](https://user-images.githubusercontent.com/78444522/174497245-d5889eb4-fa85-45c3-bd75-41b6891829f2.png)


### Technologies Used 
- Hibernate (ORM Framework) - Veritabanı ile iletişimi sağlayarak, biz geliştiricileri veritabanı yönetim sisteminden soyutlar. Kısaca bizi tek satır sql komutu yazmadan veritanında işlemler yapabilmemizi sağlar.
- c3pO - JDBC bağlantı havuzu yönetim kütüphanesi, Hibernate ve veritanı arasındaki sistem yönetimini ve bazı özelleştimeleri sağlar.
- MySQL - Veritabanı Yönetim Sistemi, 


### What to create ?
1- config (uygulama konfigürasyon paketi) paketinde AppConfig sınıfı tanımlanır.AppConfig, Spring veritabanı işlemlerinin tanımlanacağı konfigürasyon sınıfıdır.

2- service package - @Service ile tanımlanır.Controller tarafından karşılanan isteklerin iş süreçleriyle ilgilenir ve veritabanı erişimi için dao ile iletişim kurar.

3- dao package - @Repository ile tanımlanır. Veritabanı iletişimi ve işlemlerin yapılmasını sağlar.

4- model package - entity'ler yani veri tabanı  tablalorımız burada tanımlanır. 

5- main -> new -> directory -> resources 

6- resources -> new -> Resouces Bundle -> `hibernate.properties` oluşturulur. hibernate.properties MySql,Hibernate ve c3pO ayarları yer alır.


* pom.xml dosyasını açın ve aşağıdaki bağımlılıklerı(dependencies) projenize ekleyin. 

 <!-- **********************************************************************
** 				HIBERNATE DEPENDENCIES 							 	**
********************************************************************** -->

    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>${hibernate.version}</version>
    </dependency>
    
    <!-- Hibernate c3p0 connection pool -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-c3p0</artifactId>
        <version>${hibernate.version}</version>
    </dependency>

    <!-- c3p0 -->
    <dependency>
        <groupId>com.mchange</groupId>
        <artifactId>c3p0</artifactId>
        <version>${c3p0.version}</version>
    </dependency>

    <!--  MySQL JDBC Driver -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>${mysql.driver.version}</version>
    </dependency>

    <!--net.sf.json-lib-->
    <dependency>
        <groupId>net.sf.json-lib</groupId>
        <artifactId>json-lib</artifactId>
        <version>2.4</version>
        <classifier>jdk15</classifier>
    </dependency>
    
    


