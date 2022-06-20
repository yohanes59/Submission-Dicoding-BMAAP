package com.yohanes.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yohanes.submission.adapter.BahasaAdapter
import com.yohanes.submission.data.BahasaData
import com.yohanes.submission.model.Bahasa

class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasa: RecyclerView
    private var list: ArrayList<Bahasa> = arrayListOf()

    private var backPressedTime: Long = 0
    private lateinit var backToast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title = "Home"

        rvBahasa = findViewById(R.id.rv_bahasa)
        rvBahasa.setHasFixedSize(true)

        list.addAll(BahasaData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBahasa.layoutManager = LinearLayoutManager(this)
        val listBahasaAdapter = BahasaAdapter(list)
        rvBahasa.adapter = listBahasaAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_me -> {
                val about = Intent(this, AboutActivity::class.java)
                startActivity(about)
            }
        }
    }

//    menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        backToast = Toast.makeText(this, "Tekan Sekali lagi untuk keluar", Toast.LENGTH_SHORT)
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel()
            super.onBackPressed()
            return
        } else {
            backToast.show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}