package com.example.foody

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.facebook.shimmer.ShimmerFrameLayout

class RecipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)
        val shimmerFrameLayout = view.findViewById<ShimmerFrameLayout>(R.id.recycler_view)
        shimmerFrameLayout.startShimmer()

        return view
    }
}