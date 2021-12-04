package com.rivaldo.gdscmovie.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rivaldo.gdscmovie.fragment.PopularMovie
import com.rivaldo.gdscmovie.fragment.UpcomingMovie

class MainTabsAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> {
                PopularMovie()
            }
            1 -> {
                UpcomingMovie()
            }
            else -> {
                PopularMovie()
            }
        }
    }
}