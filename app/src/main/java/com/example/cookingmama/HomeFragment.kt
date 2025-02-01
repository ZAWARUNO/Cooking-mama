package com.example.cookingmama

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNasiUduk: Button = view.findViewById(R.id.btnNasiUduk)
        val btnPempek: Button = view.findViewById(R.id.btnPempek)
        val btnSoto: Button = view.findViewById(R.id.btnSoto)
        val btnRendang: Button = view.findViewById(R.id.btnRendang)
        val btnGadoGado: Button = view.findViewById(R.id.btnGadoGado)

        btnNasiUduk.setOnClickListener {
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra("nama", "Nasi Uduk")
            intent.putExtra("deskripsi", """
        Nasi Uduk adalah hidangan khas Indonesia yang dimasak dengan santan dan rempah-rempah, memberikan rasa yang gurih dan aroma khas.
        
        🍽️ **Bahan-bahan:**
        - 2 gelas beras
        - 200 ml santan
        - 1 batang serai (memarkan)
        - 2 lembar daun salam
        - Garam secukupnya
        
        🔥 **Cara Membuat:**
        1. Cuci bersih beras, lalu tiriskan.
        2. Masak santan bersama serai, daun salam, dan garam hingga mendidih.
        3. Masukkan beras, aduk hingga meresap, lalu kukus hingga matang.
        4. Sajikan dengan lauk seperti ayam goreng, tempe, atau sambal.
    """.trimIndent())

            intent.putExtra("idGambar", R.drawable.nasi_uduk)
            startActivity(intent)

        }

        btnPempek.setOnClickListener {
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra("nama", "Pempek")
            intent.putExtra("deskripsi", """
        Pempek adalah makanan khas Palembang yang terbuat dari ikan dan sagu, disajikan dengan kuah cuko yang asam manis pedas.
        
        🍽️ **Bahan-bahan:**
        - 500 gram ikan tenggiri (haluskan)
        - 250 gram tepung sagu
        - 1 butir telur
        - 2 siung bawang putih (haluskan)
        - Garam secukupnya
        - Air secukupnya
        
        🔥 **Cara Membuat:**
        1. Campur ikan halus dengan bawang putih, garam, dan sedikit air.
        2. Tambahkan tepung sagu sedikit demi sedikit, aduk hingga kalis.
        3. Bentuk sesuai selera, bisa diisi telur untuk pempek kapal selam.
        4. Rebus hingga mengapung, lalu goreng sebelum disajikan.
        5. Hidangkan dengan kuah cuko yang pedas manis.
    """.trimIndent())
            intent.putExtra("idGambar", R.drawable.pempek)
            startActivity(intent)
        }

        btnSoto.setOnClickListener {
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra("nama", "Soto")
            intent.putExtra("deskripsi", """
        Soto adalah sup khas Indonesia yang berisi daging, bihun, dan kuah rempah yang lezat.
        
        🍽️ **Bahan-bahan:**
        - 500 gram daging ayam / sapi
        - 2 batang serai (memarkan)
        - 3 lembar daun jeruk
        - 100 gram bihun (rendam air panas)
        - 2 butir telur rebus
        - 2 sdm bawang goreng
        
        🔥 **Cara Membuat:**
        1. Rebus daging hingga empuk, angkat dan iris tipis.
        2. Tumis bumbu halus, serai, dan daun jeruk hingga harum.
        3. Masukkan bumbu ke dalam air kaldu, masak hingga mendidih.
        4. Sajikan soto dengan bihun, daging, telur, dan bawang goreng.
    """.trimIndent())
            intent.putExtra("idGambar", R.drawable.soto)
            startActivity(intent)
        }

        btnRendang.setOnClickListener {
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra("nama", "Rendang")
            intent.putExtra("deskripsi", """
        Rendang adalah masakan khas Minangkabau yang terbuat dari daging sapi dimasak lama dengan santan dan rempah.
        
        🍽️ **Bahan-bahan:**
        - 1 kg daging sapi (potong-potong)
        - 1 liter santan kental
        - 5 lembar daun jeruk
        - 2 batang serai (memarkan)
        - 100 gram cabai merah (haluskan)
        - 5 siung bawang putih (haluskan)
        - 7 butir bawang merah (haluskan)
        
        🔥 **Cara Membuat:**
        1. Tumis bumbu halus hingga harum, masukkan daun jeruk dan serai.
        2. Tambahkan santan dan aduk terus hingga mendidih.
        3. Masukkan daging sapi, masak dengan api kecil hingga santan mengering.
        4. Masak terus hingga rendang berwarna kecoklatan dan bumbu meresap.
    """.trimIndent())
            intent.putExtra("idGambar", R.drawable.rendang)
            startActivity(intent)
        }

        btnGadoGado.setOnClickListener {
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra("nama", "Gado-Gado")
            intent.putExtra("deskripsi", """
        Gado-gado adalah salad khas Indonesia dengan sayuran segar yang disajikan dengan bumbu kacang.
        
        🍽️ **Bahan-bahan:**
        - 100 gram tahu (goreng, potong dadu)
        - 100 gram tempe (goreng, potong kecil)
        - 200 gram kangkung (rebus)
        - 100 gram tauge (rebus)
        - 1 buah kentang (rebus, iris)
        - 2 butir telur rebus
        - 100 gram bumbu kacang
        
        🔥 **Cara Membuat:**
        1. Tata tahu, tempe, kentang, dan sayuran dalam piring.
        2. Tuang bumbu kacang di atasnya.
        3. Tambahkan telur rebus dan kerupuk sebagai pelengkap.
        4. Gado-gado siap disajikan.
    """.trimIndent())
            intent.putExtra("idGambar", R.drawable.gado)
            startActivity(intent)
        }


    }

}