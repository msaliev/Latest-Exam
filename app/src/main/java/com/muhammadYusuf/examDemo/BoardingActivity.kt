package com.muhammadYusuf.examDemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.muhammadYusuf.examDemo.common.SharedPreferences
import com.abdullaev.smartagro.utils.statusBarColor
import com.muhammadYusuf.examDemo.databinding.ActivityBoardingBinding

class BoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBoardingBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (SharedPreferences.getLoggedIn(this)){
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding = ActivityBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

        statusBarColor(
            ResourcesCompat.getColor(
                resources,
                R.color.white,
                theme
            ), ResourcesCompat.getColor(
                resources,
                R.color.white,
                theme
            ), true
        )
    }

    override fun onSupportNavigateUp(): Boolean {
        return  navController.navigateUp() || super.onSupportNavigateUp()
    }
}