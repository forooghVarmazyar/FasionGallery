package com.example.fasioncallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fasioncallery.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGalleryBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pos = arguments?.getInt(POSISION_ARG)
        val viewPager = binding?.galleryVp

        pos?.let {
            when (pos) {
                0 -> viewPager?.adapter = IntroAdapter(PageLists.tShirts)
                1 -> viewPager?.adapter = IntroAdapter(PageLists.sneakers)
                2 -> viewPager.adapter = IntroAdapter(PageLists.hoodies)
            }
        }
    }

    companion object {
        var POSISION_ARG = "posision_arg"

        @JvmStatic
        fun newInstace(position: Int) = GalleryFragment().apply {
            arguments = Bundle().apply {
                putInt(POSISION_ARG, position)
            }
        }
    }
}