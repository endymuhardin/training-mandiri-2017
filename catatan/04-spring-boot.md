# Spring Boot #

Memudahkan pembuatan aplikasi Spring dengan menyediakan konfigurasi default, sehingga kita tidak perlu lagi menulis konfigurasi yang umum dibuat (misalnya : dataSource, transactionManager, viewResolver, component-scan, dsb)

Referensi :
* [Video Tutorial Spring Boot](https://www.youtube.com/watch?v=45UzMUE35QI&list=PL9oC_cq7OYbwPnEqUpUkbTVZEnqfD8n3e)

## Pagination dengan Thymeleaf ##

Kita bisa menggunakan `SpringDataJpaDialect` untuk Thymeleaf sehingga kita tidak perlu lagi membuat sendiri pager (tombol untuk next/prev page). Library ini bisa didapatkan [di sini](https://github.com/jpenren/thymeleaf-spring-data-dialect)

## Form Validation ##

Validasi form dilakukan dengan membaca dokumentasi di sisi CSS (bootstrap) dan di sisi aplikasi Java (Spring MVC dan Thymeleaf). Hasilnya, kita perlu mendefinisikan CSS class yang akan dipasang pada waktu error, dengan menggunakan atribut `th:errorclass`

```html
<input type="text" class="form-control" id="nama"
	th:field="*{nama}"  th:errorclass="is-invalid" placeholder="Nama Nasabah">
```

Kemudian, kita menampilkan pesan error bila terjadi kegagalan validasi dengan `th:if`. Isi dari pesan error ditampilkan dengan `th:errors`.

```html
<div class="invalid-feedback"
	th:if="${#fields.hasErrors('nama')}" th:errors="*{nama}">
	Nama nasabah harus diisi.</div>
```

Di sisi Java, validasi dilakukan secara deklaratif dengan annotation:

* `@NotNull` : tidak boleh null
* `@NotEmpty` : tidak boleh string kosong
* `@Size` : panjang string
* `@Min` dan `@Max` : batas nilai numerik

## Custom Validation Message ##

Buat file `src/main/resources/messages.properties`

```
NotEmpty={0} harus diisi!
Size.nama=Nama nasabah minimal {1} huruf dan maksimal {0} huruf
```

Nama variabel ditentukan sebagai berikut:

* `NamaClass` : berlaku global untuk semua yang menggunakan class tersebut (misal : `NotNull`)
* `NamaClass.namaField` : berlaku untuk field tertentu saja (misal : `NotEmpty.nama`)

Referensi :
* [Stack Overflow](https://stackoverflow.com/a/20422857)
* [Dokumentasi MessageResolver](https://docs.spring.io/spring-framework/docs/4.3.10.RELEASE/javadoc-api/org/springframework/validation/DefaultMessageCodesResolver.html)
