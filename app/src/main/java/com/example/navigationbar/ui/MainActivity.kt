package com.example.navigationbar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.navigationbar.R
import com.example.navigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val drawer = findViewById<DrawerLayout>(R.id.drawerLayout)
        toggle=ActionBarDrawerToggle(this, drawer,R.string.open,R.string.close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.navView.setNavigationItemSelectedListener{
            when(it.itemId){
                R.id.MyName->Toast.makeText(this,"wed",Toast.LENGTH_SHORT).show()
                R.id.MyEmail->Toast.makeText(this,"wed",Toast.LENGTH_SHORT).show()
                R.id.MyPhone->Toast.makeText(this,"wed",Toast.LENGTH_SHORT).show()
                R.id.MyPassword->Toast.makeText(this,"wed",Toast.LENGTH_SHORT).show()

            }
            true
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)

    }
}