package com.yohanes.submission.data

import com.yohanes.submission.R
import com.yohanes.submission.model.Bahasa

object BahasaData {
    private val bahasaNames = arrayOf("HTML",
        "CSS",
        "JavaScript",
        "Java",
        "Kotlin",
        "PHP",
        "Python",
        "Go",
        "Swift",
        "Dart")

    private val bahasaPenemu = arrayOf("Tim Berners-Lee",
        "Hakon Wium Lie",
        "Brendan Eich",
        "James Gosling",
        "Dmitry Jemerov",
        "Rasmus Lerdorf",
        "Guido Van Rossum",
        "Robert Griesemer, Rob Pike, dan Ken Thompson",
        "Chris Lattner",
        "Lars Bak dan Kasper Lund")

    private val bahasaTahun = intArrayOf(1991,
        1994,
        1995,
        1990,
        2011,
        1994,
        1991,
        2009,
        2010,
        2007)

    private val bahasaSejarah = arrayOf("Pada tahun 1980 seorang ahli fisika, Tim Berners-Lee, dan juga seorang kontraktor di CERN (Organisasi Eropa untuk Riset Nuklir) mengusulkan dan menyusun ENQUIRE, sebuah sistem untuk ilmuwan CERN dalam membagi dokumen. Sembilan tahun kemudian, Berners-Lee mengusulkan adanya sistem markah berbasis internet. Berners-Lee menspesifikasikan HTML dan menulis jaringan beserta perangkat lunaknya di akhir 1990",
        "Nama CSS didapat dari fakta bahwa setiap deklarasi style yang berbeda dapat diletakkan secara berurutan, yang kemudian membentuk hubungan ayah-anak (parent-child) pada setiap style. CSS sendiri merupakan sebuah teknologi internet yang direkomendasikan oleh World Wide Web Consortium atau W3C pada tahun 1996. Setelah CSS distandardisasikan, Internet Explorer dan Netscape melepas browser terbaru mereka yang telah sesuai atau paling tidak hampir mendekati dengan standar CSS.",
        "JavaScript pertama kali dikembangkan oleh Brendan Eich dari Netscape di bawah nama Mocha, yang nantinya namanya diganti menjadi LiveScript, dan akhirnya menjadi JavaScript. Navigator sebelumnya telah mendukung Java untuk lebih bisa dimanfaatkan para pemrogram yang non-Java. Maka dikembangkanlah bahasa pemrograman bernama LiveScript untuk mengakomodasi hal tersebut. Bahasa pemrograman inilah yang akhirnya berkembang dan diberi nama JavaScript, walaupun tidak ada hubungan bahasa antara Java dengan JavaScript. JavaScript bisa digunakan untuk banyak tujuan, misalnya untuk membuat efek rollover baik di gambar maupun teks, dan yang penting juga adalah untuk membuat AJAX. JavaScript adalah bahasa yang digunakan untuk AJAX.",
        "James Gosling , Mike Sheridan, dan Patrick Naughton memprakarsai proyek bahasa Java pada Juni 1991. Java pada awalnya dirancang untuk televisi interaktif, tetapi terlalu maju untuk industri televisi kabel digital pada saat itu. Bahasa itu awalnya disebut Oak setelah pohon ek yang berdiri di luar kantor Gosling. Belakangan proyek tersebut diberi nama Green dan akhirnya berganti nama menjadi Java , dari Java coffee , sejenis kopi dari Indonesia . Gosling mendesain Java dengan C / C++-gaya sintaks yang akan dikenali oleh pemrogram sistem dan aplikasi.",
        "Pada Juli 2011, JetBrains meluncurkan Project Kotlin, bahasa baru untuk JVM, yang telah dikembangkan selama satu tahun. Pimpinan JetBrains Dmitry Jemerov mengatakan bahwa sebagian besar bahasa tidak memiliki fitur yang mereka cari, kecuali Scala . Namun, ia menyebut waktu kompilasi Scala yang lambat sebagai kekurangan. Salah satu tujuan Kotlin adalah untuk mengkompilasi secepat Java. Pada Februari 2012, JetBrains membuat proyek open source di bawah lisensi Apache 2 . Nama itu berasal dari Pulau Kotlin , dekat St. Petersburg . Andrey Breslav menyebutkan bahwa tim memutuskan untuk menamainya setelah sebuah pulau, seperti halnya Java dinamai menurut pulau Jawa di Indonesia (meskipun bahasa pemrograman Java mungkin dinamai menurut kopi daripada pulau).",
        "PHP pertama kali dikembangkan oleh Rasmus Lerdorf pada tahun 1994. Pada awalnya PHP merupakan kependekan dari Personal Home Page (Situs personal). Pada waktu itu PHP masih bernama Form Interpreted (FI), yang wujudnya berupa sekumpulan skrip yang digunakan untuk mengolah data formulir dari web. Selanjutnya Rasmus merilis kode sumber tersebut untuk umum dan menamakannya PHP/FI. Dengan perilisan kode sumber ini menjadi sumber terbuka, maka banyak pemrogram yang tertarik untuk ikut mengembangkan PHP. Pada November, dirilis PHP/FI 2.0. Pada perilisan ini, interpreter PHP sudah diimplementasikan dalam program C. Dalam rilis ini disertakan juga modul-modul ekstensi yang meningkatkan kemampuan PHP/FI secara signifikan. Pada tahun 2022, sebuah perusahaan bernama Zend menulis ulang interpreter PHP menjadi lebih bersih, lebih baik, dan lebih cepat. Kemudian pada Juni 2022, perusahaan tersebut merilis interpreter baru untuk PHP dan meresmikan rilis tersebut sebagai PHP 3.0 dan singkatan PHP diubah menjadi akronim berulang PHP: Hypertext Preprocessor.",
        "Python dibuat pada akhir 1980-an oleh Guido van Rossum di Centrum Wiskunde & Informatica (CWI) di Belanda sebagai penerus bahasa ABC (sendiri terinspirasi oleh SETL), mampu menangani pengecualian dan berinteraksi dengan sistem operasi Amoeba. Implementasinya dimulai pada bulan Desember 1989. Van Rossum memikul tanggung jawab penuh atas proyek tersebut, sebagai pengembang utama, hingga 12 Juli 2018, ketika ia mengumumkan \"liburan permanen\" dari tanggung jawabnya sebagai Benevolent Dictator For Life Python, sebuah gelar yang diberikan komunitas Python kepadanya untuk mencerminkan komitmen jangka panjangnya sebagai pengambil keputusan utama proyek.",
        "Golang dirilis perdana pada bulan November 2009. Golang telah digunakan di lingkungan produksi oleh Google dan perusahaan lain. Go awalnya sebuah percobaan oleh para insinyur Google Robert Griesemer, Rob Pike, dan Ken Thompson untuk merancang sebuah bahasa pemrograman baru yang akan menyelesaikan kritik umum dari bahasa lain selama masih mempertahankan karakteristik positif. Pengembang dipertimbangkan bahasa baru seperti:\n" +
                "•\tdiketik statis, scalable untuk sistem yang besar (seperti Java dan C++)\n" +
                "•\tproduktif dan dapat dibaca, tanpa terlalu banyak kata kunci wajib dan pengulangan (\"light on the page\" seperti bahasa dinamis)\n" +
                "•\ttidak memerlukan lingkungan pengembangan terintegrasi, tetapi mendukung mereka dengan baik\n" +
                "•\tmendukung jaringan dan multiprocessing\n" +
                "Dalam wawancara terakhir, semua dari tiga perancang bahasa tidak suka terhadap kompleksitas C++ sehingga menjadi motivasi utama untuk mendesain sebuah bahasa baru.\n",
        "Pengembangan Swift dimulai pada Juli 2010 oleh Chris Lattner , dengan kolaborasi akhirnya dari banyak programmer lain di Apple . Swift mengambil ide bahasa \"dari Objective-C , Rust , Haskell , Ruby , Python , C# , CLU , dan terlalu banyak lainnya untuk dicantumkan\". Pada tanggal 2 Juni 2014, aplikasi Apple Worldwide Developers Conference (WWDC) menjadi aplikasi pertama yang dirilis secara publik yang ditulis dengan Swift. Versi beta dari bahasa pemrograman dirilis ke pengembang Apple yang terdaftar di konferensi tersebut, tetapi perusahaan tidak menjanjikan bahwa versi final Swift akan menjadi kode sumber yang kompatibel dengan versi uji. Apple berencana untuk menyediakan konverter kode sumber jika diperlukan untuk rilis penuh.",
        "Dart diresmikan pada konferensi GOTO di Aarhus , Denmark, 10-12 Oktober 2011.  Proyek ini didirikan oleh Lars Bak dan Kasper Lund. Dart 1.0 dirilis pada 14 November 2013.  Dart awalnya mendapat sambutan yang beragam dan inisiatif Dart telah dikritik oleh beberapa orang karena memecah-mecah web, karena rencana awal untuk menyertakan Dart VM di Chrome. Rencana tersebut dibatalkan pada tahun 2015 dengan rilis 1.9 Dart untuk fokus pada kompilasi Dart ke JavaScript. Dart 2.0 dirilis pada Agustus 2018, dengan perubahan bahasa termasuk sistem tipe suara. Dart 2.6 memperkenalkan ekstensi baru, dart2native, yang memperluas kompilasi asli ke platform desktop Linux, macOS, dan Windows. Pengembang sebelumnya dapat membuat alat baru hanya menggunakan perangkat Android atau iOS. Dengan ekstensi ini juga memungkinkan untuk membuat program menjadi executable mandiri. Menurut perwakilan perusahaan, tidak perlu lagi menginstal Dart SDK, karena executable mandiri sekarang dapat mulai berjalan dalam beberapa detik. Ekstensi baru ini juga terintegrasi dengan toolkit Flutter , sehingga memungkinkan untuk menggunakan compiler pada layanan kecil (misalnya, dukungan backend).")

    private val bahasaPenjelasan = arrayOf(
        "Hypertext Markup Language (HTML) adalah bahasa markah standar untuk dokumen yang dirancang untuk ditampilkan di peramban internet. Ini dapat dibantu oleh teknologi seperti Cascading Style Sheets (CSS) dan bahasa scripting seperti JavaScript dan VBScript. \n" +
                "Peramban internet menerima dokumen HTML dari server web atau dari penyimpanan lokal dan membuat dokumen menjadi halaman web multimedia. HTML menggambarkan struktur halaman web secara semantik dan isyarat awal yang disertakan untuk penampilan dokumen.\n" +
                "Elemen HTML digambarkan oleh tag, ditulis menggunakan tanda kurung sudut. Tag seperti <img /> dan <input /> langsung perkenalkan konten ke dalam halaman. Tag lain seperti <p> mengelilingi dan memberikan informasi tentang teks dokumen dan mungkin menyertakan tag lain sebagai sub-elemen. Peramban tidak menampilkan tag HTML, tetapi menggunakannya untuk menafsirkan konten halaman.\n" +
                "HTML dapat menyematkan program yang ditulis dalam bahasa scripting seperti JavaScript, yang memengaruhi perilaku dan konten halaman web. Dimasukkannya CSS mendefinisikan tampilan dan tata letak konten. World Wide Web Consortium (W3C), mantan pengelola HTML dan pemelihara standar CSS saat ini, telah mendorong penggunaan CSS pada HTML presentasi eksplisit sejak 1997.\n",
        "Cascading Style Sheet (CSS) merupakan aturan untuk mengatur beberapa komponen dalam sebuah web sehingga akan lebih terstruktur dan seragam. CSS bukan merupakan bahasa pemograman. Sama halnya styles dalam aplikasi pengolahan kata seperti Microsoft Word yang dapat mengatur beberapa style, misalnya heading, subbab, bodytext, footer, images, dan style lainnya untuk dapat digunakan bersama-sama dalam beberapa berkas (file). Pada umumnya CSS dipakai untuk memformat tampilan halaman web yang dibuat dengan bahasa HTML dan XHTML.\n" +
                "CSS dapat mengendalikan ukuran gambar, warna bagian tubuh pada teks, warna tabel, ukuran border, warna border, warna hyperlink, warna mouse over, spasi antar paragraf, spasi antar teks, margin kiri, kanan, atas, bawah, dan parameter lainnya. CSS adalah bahasa style sheet yang digunakan untuk mengatur tampilan dokumen. Dengan adanya CSS memungkinkan kita untuk menampilkan halaman yang sama dengan format yang berbeda.\n" +
                "Untuk saat ini terdapat tiga versi CSS, yaitu CSS1, CSS2, dan CSS3.\n" +
                "CSS1 dikembangkan berpusat pada pemformatan dokumen HTML, CSS2 dikembangkan untuk memenuhi kebutuhan terhadap format dokumen agar bisa ditampilkan di printer, sedangkan CSS3 adalah versi terbaru dari CSS yang mampu melakukan banyak hal dalam desain website. CSS3 mendukung penentuan posisi konten, downloadable, huruf font, tampilan pada tabel /table layout dan media tipe untuk printer. CSS3 juga dapat melakukan animasi pada halaman website, di antaranya animasi warna hingga animasi 3D. Dengan CSS3 desainer lebih dimudahkan dalam hal kompatibilitas websitenya pada smartphone dengan dukungan fitur baru yakni media query. Selain itu, banyak fitur baru pada CSS3 seperti: multiple background, border-radius, drop-shadow, border-image, CSS Math, dan CSS Object Model.\n",
        "JavaScript (disingkat JS) adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT. JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.\n" +
                "Awalnya hanya diimplementasi sebagai client-side dalam penjelajah web, kini engine JavaScript disisipkan ke dalam perangkat lunak lain seperti dalam server-side dalam server web dan basis data, dalam program non web seperti perangkat lunak pengolah kata dan pembaca PDF, dan sebagai runtime environment yang memungkinkan penggunaan JavaScript untuk membuat aplikasi desktop maupun mobile. JavaScript adalah merek dagang yang dikeluarkan dari Oracle Corporation di Amerika Serikat.\n",
        "Java adalah bahasa pemrograman berorientasi objek tingkat tinggi , berbasis kelas , yang dirancang untuk memiliki dependensi implementasi sesedikit mungkin. Ini adalah bahasa pemrograman tujuan umum yang dimaksudkan untuk membiarkan pemrogram menulis sekali, berjalan di mana saja.\n" +
                "yang berarti bahwa kode Java yang dikompilasi dapat berjalan di semua platform yang mendukung Java tanpa perlu dikompilasi ulang. Aplikasi Java biasanya dikompilasi ke bytecode yang dapat berjalan di mesin virtual Java (JVM) apa pun terlepas dari apa yang mendasarinya. arsitektur komputer . Sintaks Java mirip dengan C dan C++ , tetapi memiliki fasilitas tingkat rendah yang lebih sedikit daripada keduanya. Java runtime menyediakan kapabilitas dinamis (seperti refleksi dan modifikasi kode runtime) yang biasanya tidak tersedia dalam bahasa kompilasi tradisional. Pada 2019 , Java adalah salah satu bahasa pemrograman paling populer yang digunakan menurut GitHub , terutama untuk aplikasi web client-server , dengan dilaporkan 9 juta pengembang.\n",
        "Kotlin adalah lintas platform , diketik secara statis , bahasa pemrograman tujuan umum dengan inferensi tipe . Kotlin dirancang untuk beroperasi sepenuhnya dengan Java , dan versi JVM dari pustaka standar Kotlin bergantung pada Pustaka Kelas Java , tetapi inferensi tipe memungkinkan sintaksnyamenjadi lebih ringkas. Kotlin terutama menargetkan JVM, tetapi juga mengkompilasi ke JavaScript (misalnya, untuk aplikasi web frontend menggunakan React ) atau kode asli melalui LLVM (misalnya, untuk aplikasi iOS asli yang berbagi logika bisnis dengan aplikasi Android ). Biaya pengembangan bahasa ditanggung oleh JetBrains , sedangkan Kotlin Foundation melindungi merek dagang Kotlin.",
        "PHP: Hypertext Preprocessor (sebelumnya disebut Personal Home Pages) atau hanya PHP saja, adalah bahasa skrip dengan fungsi umum yang terutama digunakan untuk pengembangan web. Bahasa ini awalnya dibuat oleh seorang pemrogram Denmark-Kanada Rasmus Lerdorf pada tahun 1994. Implementasi referensi PHP sekarang diproduksi oleh The PHP Group. PHP awalnya merupakan singkatan dari Personal Home Page, tetapi sekarang merupakan singkatan dari inisialisasi rekursif PHP: Hypertext Preprocessor.\n" +
                "Kode PHP biasanya diproses di server web oleh interpreter PHP yang diimplementasikan sebagai modul, daemon, atau sebagai Common Gateway Interface (CGI) yang bisa dijalankan. Di server web, hasil dari kode PHP yang ditafsirkan dan dieksekusi (dapat berupa semua jenis data, seperti HTML atau data gambar biner) akan membentuk keseluruhan atau sebagian dari respons HTTP. Berbagai sistem templat web, sistem manajemen konten web, dan kerangka kerja web ada yang dapat digunakan untuk mengatur atau memfasilitasi pembuatan respons itu. Selain itu, PHP dapat digunakan untuk banyak tugas pemrograman di luar konteks web, seperti aplikasi grafis mandiri dan kontrol drone robotik. Kode PHP juga dapat langsung dieksekusi dari baris perintah.\n",
        "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan. Konstruksi bahasanya dan pendekatan berorientasi objek bertujuan untuk membantu pemrogram menulis kode yang jelas dan logis untuk proyek skala kecil dan besar.\n" +
                "Python diketik secara dinamis dan pengumpulan sampah (bahasa Inggris: garbage collection atau disingkat GC) . Ini mendukung beberapa paradigma pemrograman, termasuk pemrograman terstruktur (terutama, prosedural), berorientasi objek, dan fungsional. Python sering dideskripsikan sebagai bahasa \"termasuk baterai\" karena perpustakaan standarnya yang komprehensif.\n",
        "Go (sering disebut sebagai Golang) adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Go adalah bahasa pemrograman sumber terbuka yang mudah, sederhana, efisien. Selain itu, Go memiliki level yang sama dengan Java. Yaitu bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berurutan. Kompiler dan IDE lainnya disediakan oleh Google dari awal secara bebas dan sumber terbuka.",
        "tujuan umum , multi-paradigma , bahasa pemrograman yang dikompilasi yang dikembangkan oleh Apple Inc. dan komunitas sumber terbuka . Pertama kali dirilis pada tahun 2014, Swift dikembangkan sebagai pengganti bahasa pemrograman sebelumnya Apple Objective-C , karena Objective-C sebagian besar tidak berubah sejak awal 1980-an dan tidak memiliki fitur bahasa modern.\n" +
                "Swift bekerja dengan kerangka kerja Cocoa dan Cocoa Touch Apple , dan aspek kunci dari desain Swift adalah kemampuan untuk beroperasi dengan kumpulan besar kode Objective-C yang sudah ada yang dikembangkan untuk produk Apple selama beberapa dekade sebelumnya. Itu dibangun dengan kerangka kompiler LLVM open source dan telah disertakan dalam Xcode sejak versi 6, dirilis pada tahun 2014. Pada platform Apple,  ia menggunakan perpustakaan runtime Objective-C , yang memungkinkan C , Objective-C , C++ dan Kode Swift untuk dijalankan dalam satu program. \n",
        "Dart adalah bahasa pemrograman yang dirancang untuk pengembangan klien, seperti untuk web dan aplikasi seluler . Ini dikembangkan oleh Google dan juga dapat digunakan untuk membangun aplikasi server dan desktop. Ini adalah bahasa berorientasi objek , berbasis kelas , dan mengumpulkan sampah dengan sintaks gaya - C .  Hal ini dapat mengkompilasi baik kode asli atau JavaScript , dan mendukung antarmuka , mixin , kelas abstrak , generik reified dan inferensi jenis.")

    private val bahasaSumber = arrayOf("https://id.wikipedia.org/wiki/HTML",
        "https://id.wikipedia.org/wiki/Cascading_Style_Sheets",
        "https://id.wikipedia.org/wiki/JavaScript",
        "https://en.wikipedia.org/wiki/Java_(programming_language)",
        "https://en.wikipedia.org/wiki/Kotlin_(programming_language)",
        "https://id.wikipedia.org/wiki/PHP",
        "https://id.wikipedia.org/wiki/Python_(bahasa_pemrograman)",
        "https://id.wikipedia.org/wiki/Go_(bahasa_pemrograman)",
        "https://en.wikipedia.org/wiki/Swift_(programming_language)",
        "https://en.wikipedia.org/wiki/Dart_(programming_language)")

    private val bahasaImages = intArrayOf(R.drawable.html,
    R.drawable.css,
        R.drawable.js,
        R.drawable.java,
        R.drawable.kotlin,
        R.drawable.php,
        R.drawable.python,
        R.drawable.go,
        R.drawable.swift,
        R.drawable.dart)

    val listData: ArrayList<Bahasa>
        get() {
            val list = arrayListOf<Bahasa>()
            for (position in bahasaNames.indices) {
                val bahasa = Bahasa()
                bahasa.name = bahasaNames[position]
                bahasa.penemu = bahasaPenemu[position]
                bahasa.tahun = bahasaTahun[position]
                bahasa.sejarah = bahasaSejarah[position]
                bahasa.penjelasan = bahasaPenjelasan[position]
                bahasa.sumber = bahasaSumber[position]
                bahasa.photo = bahasaImages[position]
                list.add(bahasa)
            }
            return list
        }
}