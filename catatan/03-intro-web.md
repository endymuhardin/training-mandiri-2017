# Membuat Aplikasi Web di Java #

Key points :

* Packaging di `pom.xml` diset menjadi `war`
* Sediakan file `src/main/webapp/WEB-INF/web.xml`
* File `html`, `css`, `js`, `img`, dan file statis lain ditaruh di `src/main/webapp`

## Build dan Deploy ##

* Build : `mvn clean package`
* Deploy : copy file `target/*.war` ke `[TOMCAT]/webapps`
* Run (harus setup plugin cargo dulu) : `mvn clean package cargo:run`

## Referensi ##

* [Dasar-dasar aplikasi web Java](https://software.endy.muhardin.com/java/dasar-dasar-aplikasi-web-java/)
