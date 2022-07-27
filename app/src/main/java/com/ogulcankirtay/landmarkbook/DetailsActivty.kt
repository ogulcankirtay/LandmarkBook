package com.ogulcankirtay.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ogulcankirtay.landmarkbook.databinding.ActivityDetailsActivtyBinding
import com.ogulcankirtay.landmarkbook.databinding.ActivityMainBinding

class DetailsActivty : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsActivtyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsActivtyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=intent
        //casting
        val selectedlandmark=intent.getSerializableExtra("landmark") as Landmark

        binding.textView.setText(selectedlandmark.name)
        binding.textView3.setText(selectedlandmark.country)
        binding.imageView2.setImageResource(selectedlandmark.image)

    }
}