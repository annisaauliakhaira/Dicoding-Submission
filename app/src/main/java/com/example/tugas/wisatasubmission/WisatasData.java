package com.example.tugas.wisatasubmission;

import java.util.ArrayList;

public class WisatasData {
    private static String[] wisatasNames = {
            "Danau Biru",
            "Danau Maninjau",
            "Harau",
            "Jam Gadang",
            "Kepulauan Mentawai",
            "Kebun Binatang",
            "Kelok Sembilan",
            "Ngarai Sianok",
            "Pagaruyung",
            "Pantai Air Manis"
    };

    private static String[] wisatasDetails = {
            "Danau Biru terletak di daerah Parambahan, Kota Sawahlunto dan tepat berada dalam lingkungan proyek tambang batubara. " +
                    "Danau ini terbentuk dari bekas areal galian tambang batubara, untuk mencapai lokasi ini berjarak sekitar 13 kilometer dari pusat kota Sawahlunto.",
            "Danau Maninjau merupakan sebuah danau vulkanik yang berada tepat di jantung Kabupaten Agam, Sumatera Barat. Terletak di ketinggian kurang lebih 460 meter diatas permukaan laut, " +
                    "danau ini membentang seluas 100 km persegi dengan kedalaman rata-rata 105 meter. Dengan luasnya tersebut, Maninjau menjadi danau terluas kesebelas di Indonesia.",
            "Lembah Harau berlokasi dekat dengan kota Payakumbuh, dan lembah ini diapit oleh dua bukit cadas yang terjal dengan ketinggian kurang lebih 150 meter. " +
                    "Bentuk topografi dari Lembah Harau berbukit serta bergelombang Di sekitar Lembah Harau ada tebing granit yang terjal dan tingginya sekitar 80 – 300 meter. " +
                    "Pada lokasi wisata Lembah Harau terbagi jadi dua tempat yakni Sarasah Bunta yang terdapat 5 air terjun dan kolam penampung air terjun serta tempat wisata yang lain " +
                    "yaitu akar berayun dan kolam untuk berenang dengan keluarga, serta ada tempat untuk tempat berkemah.",
            "Jam Gadang adalah salah satu ikon wisata di Sumatera Barat. Jam yang mempunyai nilai histori tinggi ini telah ada sejak jaman penjajahan Belanda dulu. " +
                    "Jam Gadang sendiri mempunyai luas 13 x 4 meter serta tinggi 26 meter yang terdiri atas beberapa tingkat. " +
                    "Bagian paling atas dari jam gadang adalah tempat penyimpanan bandul jam yang pada tahun 2007 silam pernah patah karena gempa besar yang melanda Sumatera Barat termasuk juga Bukit tinggi.",
            "Kepulauan Mentawai inimencakup 4 pulau besar yaitu Pulau Sipora, Pulau Siberut, Pulau Pagai Utara, serta Pulau Pagai Selatan. Siberut merupakan pulau paling besar, " +
                    "dan satu-satunya Pulau yang mempunyai layanan pelayaran reguler yang menghubungkan Siberut dengan Pulau Sumatera terutama Padang. " +
                    "Tercatat kurang lebih ada 400 titik surfing di kepulauan Mentawai, mulai dari ombak yang sedang hingga ombak yang paling menantang yang di cari peselancar dunia.",
            "Taman Margasatwa dan Budaya Kinantan atau Kebun Binatang Bukittinggi, merupakan salah satu kebun binatang tertua di Indonesia. " +
                    "Bermula dari gagasan ide seorang Belanda yang bertugas di Fort de Kock, bernama Gravenzanden, tempat ini dibangun pada tahun 1900 dengan nama Stormpark.",
            "Kelok Sembilan terletak di kawasan Payakumbuh, Sumatera Barat. Ruas jalan yang hanya membentang 300 meter ini adalah salah satu jalan raya paling ekstrim di Indonesia. " +
                    "Menjadi penghubung antara Provinsi Sumatera Barat dan Riau, Kelok 9 siap menguji nyali kamu dengan sembilan tikungan yang hanya berjarak 30 meter.",
            "Ngarai Sianok merupakan lembah curam yang berada di tengah Kota Bukittinggi, Provinsi Sumatera Barat. Lembah curam ngarai ini mempunyai kedalaman 100 m dan memunyai panjang kurang lebih 15 km dengan lebar 200 m. " +
                    "Ngarai Sianok merupakan pemisah pulau Sumatera menjadi 2 bagian yang memanjang atau disebut Patahan Semangko. " +
                    "Sepanjang patahan yang dindingnya sangat curam serta tegak lurus ini membentuk lembah hijau yang merupakan hasil sinklinal (gerakan turunnya kulit bumi).",
            "Istana Pagaruyung atau Istana Basa yang letaknya di kecamatan Tanjung Emas, kota Batusangkar, kabupaten Tanah Datar, Sumatera Barat. " +
                    "Istana ini adalah obyek wisata budaya yang populer di Sumatera Barat. Istana ini mempunyai nilai histori yang sangat kental sekali," +
                    "dibangun oleh keluarga kerajaan Pagaruyung di Batusangkar yang memiliki ciri khas Minangkabau.",
            "Pantai Air Manis terkenal dengan legenda Malin Kundang, pantai ini mempunyai luas yang landai saat pasang surut, " +
                    "wisatawan bisa menjangkau Pulau Pisang Ketek (kecil) yang letaknya kurang lebih 200 meter didepan dengan berjalan kaki ketikapasang surut."

    };

    private static int[] wisatasImages = {
            R.drawable.danau_biru,
            R.drawable.danau_maninjau,
            R.drawable.harau,
            R.drawable.jam_gadang,
            R.drawable.kepulauan_mentawai,
            R.drawable.kebun_binatang,
            R.drawable.kelok9,
            R.drawable.ngarai,
            R.drawable.pagaruyung,
            R.drawable.pantai_air_manis

    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisatasNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(wisatasNames[position]);
            wisata.setDetail(wisatasDetails[position]);
            wisata.setPhoto(wisatasImages[position]);
            list.add(wisata);
        }
        return list;
    }
}
