package com.cloud.myheroacademia

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_presentation.*

class PresentationActivity : AppCompatActivity() {
    var hero : Hero? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentation)


        val intent = intent
        hero = intent.getSerializableExtra("hero") as Hero?
        if (hero!=null){
            textRealName.text = hero!!.realName
            textQuirk.text = "Quirk: ${hero!!.quirk}"
            textHeroName.text = "Hero name: "+hero!!.heroName

            textDescription.text = hero!!.description
            val bitmap = BitmapFactory.decodeResource(applicationContext.resources,hero!!.imageId)
            imageView.setImageBitmap(bitmap)
        }


    }
}