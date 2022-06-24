## Hİbernate Criteria Query API 
SQL sorguları yamadan sorgular üzerinde nesne yönelimli kontrol sağlamaktadır. 

1. Maven Dependencies

```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>   
    <version>5.2.12.Final</version>
</dependency>
```

+ Adım adım sorgu oluşturalım:
  + SessionFactory nesnesinden bir Session örneği oluşturulur.
           
          Session currentSession = sessionFactory.getCurrentSession();
            

  + getCriteriaBuilder() metodunu çağırarak bir CriteriBuilder örneği oluşturulur.
   
          CriteriaBuilder builder = currentSession.getCriteriaBuilder();
          
    
  + CriteriaBuilder'ın createQuery() metodunu çağırarak CriteriaQuery örneği oluşturulur
   
          CriteriaQuery cQuery = builder.createQuery(Item.class);
    
          
  + Select ile seçeceğimiz Root örneği oluşturulur.
   
          Root<Item> root = cQuery.from(Item.class);
          
  + Session'ın createQuery() metodu çağırılarak Query örneği oluşturulur.
   
          Query<Item> query = currentSession.createQuery(cQuery);        
          
   + Bize sonuçları veren Query nesnesinin getResultList() veya getSingleResult() metodu çağrılır.
   
          List<Item> employeeList = query.getResultList();
          Item item = query.getSingleResult();
