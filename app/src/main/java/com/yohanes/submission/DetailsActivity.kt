package com.yohanes.submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailsActivity : AppCompatActivity() {
    private lateinit var tvDetailName : TextView
    private lateinit var ivDetailImg : ImageView
    private lateinit var tvDetailPenemu : TextView
    private lateinit var tvDetailTahun : TextView
    private lateinit var tvDetailSejarah : TextView
    private lateinit var tvDetailPenjelasan : TextView
    private lateinit var tvDetailSumber : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Bahasa"
        actionbar.setDisplayHomeAsUpEnabled(true)

        tvDetailName = findViewById(R.id.tv_set_name)
        ivDetailImg = findViewById(R.id.iv_set_img)
        tvDetailPenemu = findViewById(R.id.tv_set_penemu)
        tvDetailTahun = findViewById(R.id.tv_set_tahun)
        tvDetailSumber = findViewById(R.id.tv_set_sumber)
        tvDetailSejarah = findViewById(R.id.tv_set_sejarah)
        tvDetailPenjelasan = findViewById(R.id.tv_set_penjelasan)

        intent?.let {
            getExtraDetail()
        }
    }

    private fun getExtraDetail() {
        tvDetailName.text = intent.getStringExtra(EXTRA_NAME)
        tvDetailPenemu.text = intent.getStringExtra(EXTRA_PENEMU)
        tvDetailTahun.text = intent.getIntExtra(EXTRA_TAHUN, 0).toString()
        tvDetailSumber.text = intent.getStringExtra(EXTRA_SUMBER)
        tvDetailSejarah.text = intent.getStringExtra(EXTRA_SEJARAH)
        tvDetailPenjelasan.text = intent.getStringExtra(EXTRA_PENJELASAN)

        val getImg = intent.getIntExtra(EXTRA_IMG, 0)
        Glide.with(this)
            .load(getImg)
            .into(ivDetailImg)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_PENEMU = "extra_penemu"
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_PENJELASAN = "extra_penjelasan"
        const val EXTRA_SUMBER = "extra_sumber"
        const val EXTRA_SEJARAH = "extra_sejarah"
    }
}