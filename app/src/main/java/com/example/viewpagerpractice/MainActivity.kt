package com.example.viewpagerpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class MainActivity : AppCompatActivity() {

    //step-1: declare variables
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter
    private lateinit var dotsIndicator: DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //step-6: set adapter
        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = ViewPagerAdapter()

        viewPager.adapter = pagerAdapter

        dotsIndicator = findViewById(R.id.dots)
        dotsIndicator.attachTo(viewPager)
    }
}