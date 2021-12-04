package com.rivaldo.gdscmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rivaldo.gdscmovie.adapter.MainTabsAdapter

class MainTabs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tabs)

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        val viewPager2 = findViewById<ViewPager2>(R.id.vPager)
        val adapter = MainTabsAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when(position) {
                0-> {
                    tab.text = "Popular"
                }
                1 -> {
                    tab.text = "Upcoming"
                }
            }
        }.attach()
    }
}