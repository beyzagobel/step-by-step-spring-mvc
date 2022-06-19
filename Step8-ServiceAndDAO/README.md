## Spring MVC 5 Service Katmanı

![image](https://user-images.githubusercontent.com/78444522/174497245-d5889eb4-fa85-45c3-bd75-41b6891829f2.png)




1. pom.xml dosyasını açın ve aşağıdaki bağımlılıklerı(dependencies) projenize ekleyin. 

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
    
    
2. 
