package com.example.cookingmama

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val btnLogout = view.findViewById<Button>(R.id.btn_logout)
        val btnSwitchAccount = view.findViewById<Button>(R.id.btn_switch_account)

        val firebaseAuth = FirebaseAuth.getInstance()

        btnLogout.setOnClickListener {
            firebaseAuth.signOut() // Logout dari Firebase
            Toast.makeText(requireContext(), "Logout berhasil!", Toast.LENGTH_SHORT).show()

            val intent = Intent(requireContext(), LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        btnSwitchAccount.setOnClickListener {
            firebaseAuth.signOut() // Logout sebelum ganti akun
            Toast.makeText(requireContext(), "Silakan login dengan akun lain!", Toast.LENGTH_SHORT).show()

            val intent = Intent(requireContext(), LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        return view
    }
}
