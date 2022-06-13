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


# Create A First Spring MVC Project Using IntelliJ Ultimate

- Step 1

![1](https://user-images.githubusercontent.com/78444522/173260749-00cfbdb5-dafe-4505-bc5d-c20513c35d2a.png)

- Step 2

![2](https://user-images.githubusercontent.com/78444522/173260815-ff466876-9f13-45d9-9959-fcc6b0455e9b.png)

- Step 3

![3](https://user-images.githubusercontent.com/78444522/173260824-1ebe866e-c05f-44a2-9635-0ddf81ab525d.png)

- Step 4 : Projemiz oluştu. Şimdi Tomcat ve JDK ayarlarını yapalım.

![4](https://user-images.githubusercontent.com/78444522/173260962-850155b4-27e8-421c-a6a9-dbc257c19fd3.png)

- Step 5

![8](https://user-images.githubusercontent.com/78444522/173261063-22054143-29f9-417f-ac87-bc1976f86c97.png)

- Step 6

![9](https://user-images.githubusercontent.com/78444522/173261086-04ca30eb-d031-4ba8-92c5-879e3a2c111d.png)


- Step 7

![10](https://user-images.githubusercontent.com/78444522/173261135-e7e2b88f-e8dc-4055-b4f3-21d0687cd4aa.png)

![11](https://user-images.githubusercontent.com/78444522/173261141-0da3302e-59df-410b-8d1e-ff3e88e303f5.png)


![12](https://user-images.githubusercontent.com/78444522/173261150-b3064c2e-70e1-4ddb-8f74-3c9c4ca9ddd6.png)






























