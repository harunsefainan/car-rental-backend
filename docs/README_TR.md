<div align="center">
<h1>Car Rental Backend</h1>


![GitHub Issues](https://img.shields.io/github/issues/harunsefainan/car-rental-backend)
![GitHub License](https://img.shields.io/github/license/harunsefainan/car-rental-backend)
![GitHub Pull Requests](https://img.shields.io/github/issues-pr/harunsefainan/car-rental-backend)
![GitHub Forks](https://img.shields.io/github/forks/harunsefainan/car-rental-backend)
![GitHub Stars](https://img.shields.io/github/stars/harunsefainan/car-rental-backend)

| [İnglizce](/README.md) | [Türkçe](/docs/README_TR.md) |


</div>

## Proje Genel Bakışı

Bu proje, araç kiralama sektöründe etkin bir rol oynamak için tasarlanmış modern bir web uygulamasını kapsamaktadır. Uygulama, yönetici (admin) ve müşteri (customer) rolleri arasında ayrım yaparak, her rol için özelleştirilmiş yetkilendirme ve işlevsellik sunar.

Uygulamanın ana özellikleri arasında araç kiralama listeleme ve arama işlevleri bulunmaktadır. Müşteriler, uygun araçları listeleyebilir ve kiralama süreçlerini yönetebilirken, yöneticiler ise araçları sisteme ekleyebilir, mevcut kiralama taleplerini yönetebilir ve genel araç bilgilerini düzenleyebilir.

Proje, Java tabanlı teknolojiler olan Spring Boot ve Hibernate kullanılarak geliştirilmiştir. Bu teknolojilerin sağladığı güçlü altyapı sayesinde, uygulama hızlı, güvenilir ve ölçeklenebilir bir şekilde çalışır. Ayrıca, Lombok kütüphanesi kod tekrarlarını azaltarak daha okunabilir bir yapı sunar.

Veritabanı işlemleri için ise JpaRepository kullanılmıştır. Bu sayede, araçların, kiralama taleplerinin ve müşteri bilgilerinin veritabanında verimli bir şekilde yönetilmesi mümkün olmuştur.



## Başlangıç

### Java 17'yi Yükle
- Bu uygulama Java 17 gerektirir.
- Java-17'yi indirip yüklemek için lütfen yandaki bağlantıya tıklayın: [Java-17](https://www.oracle.com/java/technologies/downloads/#java17)

### Gradle 8.7'yi Yükle
- Bu uygulama Gradle-8.7 gerektirir.
- Gradle-8.7'yi indirip yüklemek için lütfen yandaki bağlantıya tıklayın: [Gradle-8.7](https://gradle.org/releases/)

### Veritabanını Yükle ve Ayarla
- Bu uygulama MySQL 8 gerektirir.
- MySQL-8'i indirip yüklemek için lütfen yandaki bağlantıya tıklayın: [MySQL-8](https://dev.mysql.com/downloads/installer/)

### Uygulamayı Çalıştırma

- Repoyu klonlayın
   ```sh
   git clone https://github.com/harunsefainan/car-rental-backend
   ```
- Projeyi IntelliJ IDEA veya tercih ettiğiniz uygun bir IDE'de açın.
- Projeyi çalıştırın.
- Tarayıcıyı açın ve localhost:8080 adresine gidin (Portu değiştirdiyseniz 8080 yerine değiştirilmiş portu kullanın)

## Project Detayları

![Project Details](./images/carrentaldetails.png)

### Veritabanı

- Varlık Modelleri

![Entity Models](./images/rentacar.png)

## Kullanılan Teknolojiler

 <p align="center">
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/1200px-Spring_Framework_Logo_2018.svg.png" width="155" height="50" alt="Spring Boot" title="Spring Boot 17" class="img-small">
      <img src="https://raw.githubusercontent.com/docker-library/docs/c3d3ca6beed000f9ba6eabc98f3399158f520256/gradle/logo.png" width="155" height="50" alt="Gradle" title="Gradle" class="img-small">
      <img src="https://cogitech.pl/wp-content/uploads/2023/02/Swagger-logo.png" height="50" alt="Swagger" title="OpenAPI 2.0.4" class="img-small">
      <img src="https://cdn-icons-png.flaticon.com/512/5968/5968282.png" width="50" height="50" alt="Java" title="Java 17" class="img-small">
      <img src="https://cdn-icons-png.flaticon.com/512/5968/5968313.png" width="50" height="50" alt="" title="MySQL Workbench 8.0" class="img-small">
   </p>

  <hr>
<div align="center">
   <a href="mailto: harunsefa.inan@gmail.com" target="blank"><img align="center" src="https://cdn-icons-png.flaticon.com/512/9840/9840614.png" height="40" width="40" /></a>
   <a href="https://www.linkedin.com/in/harun-sefa-inan-761a2324b/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" height="30" width="40" /></a>
</div>
<hr> 




<p align="right">(<a href="#top">back to top</a>)</p>
