# Step By Step Spring MVC 5
Merhabalar,
Bu repoda sizlerle Spring MVC ile adım adım nasıl web tabanlı projeler geliştirilir öğreneceğiz.


Proje geliştirirken önemli noktadan birisi, version bilgileridir. Tavsiyem sizinle paylaştığım version bilgilerine sadık kalmanızdır.
Çünkü bazı ürün ailesini farklı sürümleri diğer bir üründe desteklenmeyebiliyor. Dikkat etmenizde fayda var.




## Spring MVC Proje Bileşenleri
- JDK 11 - Java Development Kit 
- IntelliJ Ultimate 
- Tomcat 9 - Java Uygulama Sunucusu
- Apache Maven 3.3+ - Proje Bağımlılık Yöneticisi
- Hibernate - ORM 

## JDK 11 Installing
[JDK 11 Download](https://www.oracle.com/java/technologies/downloads/#java11)
> JDK kurulumunu next diyerek aşamaları tamamladıktan sonra, /bin klasörü Ortam Değişkenlerindeki PATH'e eklenmelidir.

![image](https://user-images.githubusercontent.com/78444522/173260445-7146593a-70ec-4f73-8a15-85db3d2a88bd.png)

> İndirme işleminden sonra cmd ekranına
`java -version` yazarak JDK'i sorunsuz indirmiş iseniz JDK version bilgisini öğrenebilirsiniz.

## IntelliJ Ultimate Installing
> Ben projelerimi IntelliJ Ultimate IDE kullanarak geliştirdim fakat siz Eclipse gbi diğer IDE'lerde kullanabilirsiniz.
> Fakat IntelliJ Ultimate sadece 30 günlük ücretsiz deneme sürümü veriyor. Öğrenciler için öğrenci e postanız ile hesap açarak 
> sürenizi öğrencilik hayatınız boyunca uzatarak IntelliJ 'nin diğer ürünleri yani nimetlerinden de yararlanabilirsiniz 😅

[IntelliJ Ultimate Free 30-day trial available](https://www.jetbrains.com/idea/download/#section=windows)

[Ücretsiz Eğitim Lisansı için](https://www.jetbrains.com/community/education/#students)

## Apache Maven Installing
[Apache Maven 3.8.6](https://maven.apache.org/download.cgi)

 İndirme işlemi yapıldıktan sonra /bin klasörü Ortam Değişkenlerindeki PATH'e eklenmelidir.
 
 ![image](https://user-images.githubusercontent.com/78444522/173260404-cf26d808-36c7-4b27-acf0-22f40c4f876d.png)


>Apache Maven bir proje yönetim aracıdır.Projenizde kullanmanız zorunlu değildir. Fakat bağımlılık (dependency) yönetimi,
yazılımın derlenmesi (compile), paketlenmesi (packaging), sunucuya yüklenmesi(deploy) işlemleri dahil birçok işlemi yazılımcının elinden alarakbizleri iş yükünden kurtarır.

### Nasıl Çalışır ?
- Maven Projeyi okur.
- Proje derlenir.
- Projenin ihtiyacı olan kütüphaneler için ilk önce local repoyu (kendi bilgisayarınızda  ~/.me/repository) kontrol eder.
- Eğer istenilen bağımlılık repoda var ise kullanarak projenin target yani çıktı dosyasını oluşturur.
- Eğer local repoda yok ise merkezi repoya (remote) gidilerek istenilen bağımlılık local repoya download edilir, bağımlılık kullanılır ve target oluşur.

![image](https://user-images.githubusercontent.com/78444522/173258759-626c6ba8-7df4-4eee-9ae5-36fd356f6180.png)

### Maven Proje Yapısı
Maven ile proje oluştururken archtype denilen hazır proje şablonları ile projelerimizi oluşturabiliriz ki buda Maven'ın diğer bir kolaylığı.
Maven ile Spring MVC web projesi oluşturulurken ise `maven-webapp-archetype` şablonunu kullanacağız.

Proje oluşturulduktan sonra ilk proje yapısı Maven tarafından aşağıdaki resimdeki gibi oluşturulur. Buda bize sunduğu diğer bir kolaylık.

![image](https://user-images.githubusercontent.com/78444522/173260156-64ee8b4d-b5b4-41db-8f1f-87bec76bc644.png)



## Apache Tomcat 9 Installing
[Tomcat 9 Download](https://tomcat.apache.org/download-90.cgi)

> Java tabanlı web uygulamalar geliştirmek için kallanılan web sunucusudur. Tomcat ayarlarını projemizi oluşturduktan sonra yapacağız.

--------------

# Create A First Spring MVC Project Using IntelliJ Ultimate

- Step 1 : maven-archetype-webapp şablonu ile web projesi oluşturmaya ilk adım atılır.

![image](https://user-images.githubusercontent.com/78444522/173262221-903d9332-d0c6-453d-9a69-ac2d57b0ff6e.png)


- Step 2 : 
>  Name : Proje dosya adı
>  
> Location : Projenizi konumlandıracağınız dizin
> 
> GroupId : Projenin organizasyon bilgisi
> 
> ArtifactId Projenin Adı
>
> version : Projenin version bilgisi

![image](https://user-images.githubusercontent.com/78444522/173262367-75d306f0-3388-4b9d-97cb-72d3f78d66f1.png)


- Step 3 
> Local Repository : Maven local reposu

![image](https://user-images.githubusercontent.com/78444522/173262511-46318fa3-56f6-4bc9-8b2d-f9789471ca75.png)


- Step 4 : Projemiz oluştu. Şimdi Tomcat ve JDK ayarlarını yapalım.

![image](https://user-images.githubusercontent.com/78444522/173262542-bc303ba6-697f-4b5a-95f6-c9ce6efd3ed4.png)


- Step 5

![image](https://user-images.githubusercontent.com/78444522/173262606-fba0af3f-facf-456d-b46e-1c082a723e56.png)


- Step 6
> Application server kısmında Tomcat eklenir.
> JRE(Java Runtime Environment) kısmına indirilen JDK seçilir.

![image](https://user-images.githubusercontent.com/78444522/173262659-6b50a053-5554-433e-aa48-b6e08a004402.png)

- Step 7

![image](https://user-images.githubusercontent.com/78444522/173262703-7b96978f-3b96-4f76-97bc-d1059053f90c.png)

![image](https://user-images.githubusercontent.com/78444522/173264035-9f95bd4b-c637-406f-8d6d-ba32ce6e54d7.png)

>Application context : Uygulama bağlamı

![image](https://user-images.githubusercontent.com/78444522/173264079-25181081-c449-4988-8e92-4bfd341319fe.png)



- Genel yapılandırna ayarlarımız burada bitiyor ve uygulamayı Run ederek projenin ilk oluşturulduğu halinin çalıştığını  görebilirsiniz.
- Genel proje ayarlarını burada bitiriyoruz. Bu kısımdan sonra ise web projelerimizi nasıl kodluyoruzdan bahsedeceğim.
































