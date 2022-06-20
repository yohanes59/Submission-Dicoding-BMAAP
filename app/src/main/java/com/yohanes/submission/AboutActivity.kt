package com.yohanes.submission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionbar = supportActionBar
        actionbar!!.title = "Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val img: ImageView = findViewById(R.id.img_item_photo)
        Glide.with(this)
            .load(R.drawable.me)
            .apply(RequestOptions())
            .into(img)

        val imgGithub = findViewById<ImageView>(R.id.img_github)
        val imgLinkedIn = findViewById<ImageView>(R.id.img_linkedin)
        val imgWeb = findViewById<ImageView>(R.id.img_web)

        imgGithub.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/yohanes59")
            startActivity(intent)
        }

        imgLinkedIn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/yohanes-cahyadi")
            startActivity(intent)
        }

        imgWeb.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://yohanes59.github.io/")
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}