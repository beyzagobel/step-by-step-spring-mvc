## Spring MVC 5 Service Katmanı
* Üç katmanlı mimari (controller,service,dao) nin orta katmanıdır.
* Controller tarafından karşılanan isteklerle ilgili iş süreçlerinin karşılanmasını sağlar.
* Model sınıflarına erişim durumunda veritabanı erişimi için DAO (Data Access Object) sınıflarıyla iletişim kurar.

### Service Katmanı Konfigürasyonu için ;
1 - Konfigürasyon paketinde (config) Service katmanının temel konfigürasyonu için AppConfig sınıfı oluşturulur.

2 - AppConfig sınıfında veritabanı ile yapılacak tüm etkileşimlerin nasıl yapılacağını belirleyen `TransactionalManager`  ve 
veritabanı iletişim için kullanılacak olan session tanımı ve yönetimini yapan `SessionFactory` sınıfları tanımlanır.

### Service Sınıfı oluşturmak için;
1 - java paketinde service paketi oluşturulur (tercihe bağlı).

2 - service paketinin altında bir java sınıfı oluşturulur. Örnek olarak HomeController'ın iş süreçlerini üstlenen service sınıfına HomeService adını verebilirsiniz.

![image](https://user-images.githubusercontent.com/78444522/174460532-9e348067-f3ac-46ec-8bf4-5c3aff343d37.png)


### Service Sınıfı Annotation'ları
1. Service sınflarına sınıf seviyesinde @Service annotation'ı tanımlanır.
2. @Transactional annotation'ı 5 tane farklı özellik alabilir: value, propagation, readOnly, roolbackFor, noRoolbackFor
3. @Autowired, varsa DAO sınıfı bağımlılığı eklenir.
