package com.example.musicbysas

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.app.ActivityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.musicbysas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toogle:ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        runtimePermission()

        // initize binding
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // navview
        binding.navView.setNavigationItemSelectedListener(){
            when(it.itemId){
                R.id.feedback->
                    Toast.makeText(this,"Feedback ",Toast.LENGTH_SHORT).show()
                R.id.setting->
                    Toast.makeText(this,"Setting ",Toast.LENGTH_SHORT).show()
                R.id.setting->
                    Toast.makeText(this,"Setting ",Toast.LENGTH_SHORT).show()
                R.id.exit->
                    Toast.makeText(this,"Exit ",Toast.LENGTH_SHORT).show()

            }
            true
        }

        // for navdrawer
        toogle= ActionBarDrawerToggle(this,binding.root,R.string.open,R.string.close)
        binding.root.addDrawerListener(toogle)
        toogle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(false)


        binding.shuffleButon.setOnClickListener(){
            val intent= Intent(this@MainActivity,PlayerActivity::class.java)
            startActivity(intent)
        }

        binding.favouriteButton.setOnClickListener(){
            val intent= Intent(this@MainActivity,FavouriteActivity::class.java)
            startActivity(intent)
        }

        binding.playlistButton.setOnClickListener(){
            val intent= Intent(this@MainActivity,PlayllistActivity::class.java)
            startActivity(intent)
        }

    }

    // for requesting permission
    private fun runtimePermission(){
        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        !=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),12)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 12) {
            if(grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show()
            }
            else
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),12)

        }
    }

    // for drawerlayout overridd menthod
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item))
            return true
        return super.onOptionsItemSelected(item)

    }
}