## Hİbernate Criteria Query API 
- SQL sorguları yazmadan nesneye yönelik sorgular yazmamızı sağlar. 
- Veritabanı bağımsızdır.
- Sorguları önbellekleme özelliği de vardır.


1. Maven Dependencies

```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>   
    <version>5.2.12.Final</version>
</dependency>
```

+ Adım adım sorgu oluşturalım :

1. SessionFactory nesnesinden bir Session örneği oluşturulur.
           
          Session currentSession = sessionFactory.getCurrentSession();
            
2. getCriteriaBuilder() metodunu çağırarak bir CriteriBuilder örneği oluşturulur.
   
          CriteriaBuilder builder = currentSession.getCriteriaBuilder();
          
    
3. CriteriaBuilder'ın createQuery() metodunu çağırarak CriteriaQuery örneği oluşturulur
   
          CriteriaQuery cQuery = builder.createQuery(Item.class);
    
          
4. Select ile seçeceğimiz Root örneği oluşturulur.
   
          Root<Item> root = cQuery.from(Item.class);
          
5. Session'ın createQuery() metodu çağırılarak Query örneği oluşturulur.
   
          Query<Item> query = currentSession.createQuery(cQuery);        
          
6. Bize sonuçları veren Query nesnesinin getResultList() veya getSingleResult() metodu çağrılır.
   
          List<Item> employeeList = query.getResultList();
          Item item = query.getSingleResult();
          
          
 
 ## Step 10 Project

          
          
![image](https://user-images.githubusercontent.com/78444522/177060290-4b301678-329a-48d3-ab65-d42d969e2827.png)

![image](https://user-images.githubusercontent.com/78444522/177060455-415a500c-33c3-439b-9c5c-00f62bd95045.png)

![image](https://user-images.githubusercontent.com/78444522/177060502-a3c8c393-1733-4028-b923-e7afb64d0e1d.png)

![image](https://user-images.githubusercontent.com/78444522/177060524-3eadeff5-da99-4c0c-93f3-6be779031e20.png)

![image](https://user-images.githubusercontent.com/78444522/177060573-894af5ae-11ba-41ef-a850-0338d8b6765b.png)

![image](https://user-images.githubusercontent.com/78444522/177060593-a856de25-d2d2-4afe-b81f-8e4cb03fbc30.png)




 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
