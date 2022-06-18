## Spring MVC 5 - Internationalization ( Çoklu Dil Desteği )
1.

 ![](https://user-images.githubusercontent.com/78444522/174455714-f0aceef2-aed7-4604-bcf3-2b0afcda8668.png)

2.

![image](https://user-images.githubusercontent.com/78444522/174455771-55cfc573-ec60-4b39-85f4-1ed5ec25156e.png)

3.

![image](https://user-images.githubusercontent.com/78444522/174455797-76a522a1-a161-4ddd-b230-0e0ffedc7253.png)

* messages_en_US (Amerikan ingilizcesi) ve message_tr_TR (Türkiye türkçesi) adlı properties oluşturulur.
Tabili siz hangi dilleri eklemek isterseniz bu şekilde isimlendirerek ekleyebilirsiniz.

4.

![image](https://user-images.githubusercontent.com/78444522/174455933-96616298-2882-47d6-9081-ee8acfd72664.png)


![image](https://user-images.githubusercontent.com/78444522/174455941-31b2bd68-a529-47a3-823b-9802d2dd581d.png)


* şeklinde istediğiniz key-value çiftleri içeren tanımlamalar yapılır

## WebConig Konfigürasyonu
1. İlk olarak WebConfig sınıfında @Bean ismi messagSource olan getMessageSource() metodu tanımlanır.
2. Locale bilgisinin çözümlenmesi için 2 yöntem kullanılır:
   1. CookieLocaleResolver : Cookie'ler (çerez) kullanarak locale bilgisinin çözümlenmesi ve depolanması için CookieLocaleResolver bean'i WebConfig'de tanımlanır.
   2. SessinLocaleResolver : Session (oturum) locale bilgisinin çözümlenmesi için SessionLocaleResolver bean'i WebConfig'de tanımlanır.
3. Oturum locale dinleyicisi LocaleChangeInterceptor bean'i eklenir
4. addInterceptor metoduna diğer tüm eklenen interceptor'lar gibi LocaleChangeInteceptor metodu eklenir.
