🍽️ Aplikasi Pengelolaan Resep Makanan
Ujian Tengah Semester — Pemrograman Berorientasi Objek 2

Dibuat oleh: Muhammad Nabil Zaky — 2310010511

<div align="center"> <img width="180" src="https://cdn-icons-png.flaticon.com/512/1046/1046857.png" alt="food icon"> </div>
📘 Gambaran Umum

Aplikasi Pengelolaan Resep Makanan adalah aplikasi desktop berbasis Java Swing yang dirancang untuk mencatat, mengelola, serta menyimpan berbagai jenis resep makanan.
Pengguna dapat menambahkan resep baru, mengedit resep lama, menghapus data, hingga menyimpan atau memuat data resep melalui fitur Export & Import file (.txt / .csv).

Aplikasi ini dikembangkan sebagai pemenuhan tugas UTS Praktikum PBO 2, dengan menerapkan konsep OOP, pemisahan model–service–UI, dan antarmuka yang bersih serta mudah digunakan.

🍜 Kategori Resep yang Didukung

Aplikasi menyediakan beberapa kategori umum agar data lebih tertata:

Makanan Pembuka

Makanan Utama

Makanan Penutup / Dessert

Cepat Saji

Minuman

Camilan / Snack

Salad / Sayuran

✨ Fitur Utama Aplikasi
1. Form Input Resep

Setiap resep terdiri dari:

Nama Resep

Bahan-Bahan

Instruksi Memasak

Kategori Makanan

2. Manajemen Data — CRUD

Tambah resep baru

Edit resep tertentu

Hapus resep dari tabel

Bersihkan form dengan tombol Clear

3. Tabel Resep Interaktif

Data langsung tampil di tabel setelah ditambahkan

Klik baris untuk memunculkan data ke form

Tampilan rapi dan mudah dibaca

4. Import & Export

Export ke .txt untuk menyimpan seluruh data resep

Export ke .csv untuk kompatibilitas Excel

Import data dari .txt / .csv untuk memuat kembali daftar resep

5. Desain Antarmuka

Tata letak dibuat sederhana dan konsisten

Tombol diberi warna yang mudah dikenali

Tabel menggunakan header kontras agar mudah dibaca

🛠️ Teknologi yang Digunakan

Java SE (JDK 8+)

Java Swing (GUI)

NetBeans IDE

Tidak menggunakan library tambahan (untuk memenuhi syarat UTS)

📂 Struktur Project
AplikasiResepMakanan
└── src
    ├── model
    │   └── Recipe.java       // class data resep
    ├── service
    │   └── RecipeService.java // logika CRUD + import/export
    └── ui
        └── RecipeMainFrame.java // tampilan utama aplikasi

🚀 Cara Menjalankan Aplikasi

Buka NetBeans → Open Project

Pilih folder project

Klik kanan pada project → Run

Atau jalankan class ui.RecipeMainFrame secara langsung

📌 Cara Menggunakan
➕ Menambahkan Resep Baru

Isi Nama Resep

Ketik daftar Bahan

Masukkan Instruksi Memasak

Pilih kategori

Tekan tombol Tambah

✏ Mengedit Resep

Klik salah satu baris pada tabel

Data akan otomatis masuk ke form

Ubah data → klik Ubah

❌ Menghapus Resep

Pilih resep di tabel

Klik Hapus

📄 Export Data

Tekan Export → pilih format .txt atau .csv

📂 Import Data

Tekan Import → pilih file .txt atau .csv → data langsung dimuat

🎨 Tampilan Aplikasi

(Ganti link gambar dengan screenshot aplikasi milikmu)

<img width="850" src="path_to_your_screenshot.png" />

📝 Catatan Pengembang

Aplikasi dibuat dengan pola pemisahan antara data, logika, dan antarmuka sehingga lebih mudah dipelihara.

Fitur Import/Export dibuat tanpa library tambahan agar tetap memenuhi ketentuan UTS.

Program diuji menggunakan dataset kecil dan besar, serta seluruh fungsi berjalan sesuai rencana.

📚 Status Project

Aplikasi ini diselesaikan sebagai bagian dari UTS Pemrograman Berorientasi Objek 2,
disusun oleh:

📌 Muhammad Nabil Zaky — 2310010511
