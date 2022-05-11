package com.example.fasioncallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.fasioncallery.databinding.ActivityMainBinding
import java.time.zone.ZoneOffsetTransition

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewPager2: ViewPager2

    private val pager2Callback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)

            if (position == PageLists.introSlides.size - 1) {
                binding.controllerBtn.text = "Finish"
            } else {
                binding.controllerBtn.text = "Next"
                binding.controllerBtn.setOnClickListener {
                    viewPager2.currentItem = position + 1
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViewPager(binding)
    }

    private fun setupViewPager(binding: ActivityMainBinding) {
        val adapter = IntroAdapter(PageLists.introSlides)
        viewPager2 = binding.viewpager

        viewPager2.adapter = adapter
        viewPager2.registerOnPageChangeCallback(pager2Callback)
        binding.dotsIndicator.setViewPager2(viewPager2)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewPager2.unregisterOnPageChangeCallback(pager2Callback)
    }
}