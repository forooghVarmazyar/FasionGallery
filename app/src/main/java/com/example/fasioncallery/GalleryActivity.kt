package com.example.fasioncallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fasioncallery.databinding.ActivityGalleryBinding
import com.google.android.material.tabs.TabLayoutMediator

class GalleryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val galleryViewPager = binding?.galleryVp
        val adapter = GalleryAdapter(this)
        galleryViewPager?.adapter = adapter

        TabLayoutMediator(binding.tabLayout, galleryViewPager!!) {
                tab, position ->
            tab.text = getTitle(position)
        }.attach()

    }

    private fun getTitle(position: Int): String? {
        return when (position) {
            0 -> "T-shirts"
            1 -> "Sneaker"
            2 -> "Hoodies"
            else -> null
        }
    }
}