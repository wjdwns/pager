package com.example.pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = PagerAdapter(this)
        pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        pager.offscreenPageLimit = 3

        button1.setOnClickListener(){
            pager.currentItem =0
        }
        button2.setOnClickListener(){
            pager.currentItem =1
        }
        button3.setOnClickListener(){
            pager.currentItem =2
        }
    }
        inner class PagerAdapter : FragmentStateAdapter {
            constructor(activity: FragmentActivity) : super(activity)

            override fun getItemCount() = 3

            override fun createFragment(position: Int): Fragment {
                when(position){
                    0->{
                        return Fragment1()
                    }
                    1->{
                        return Fragment2()
                    }
                    2->{
                        return Fragment3()
                    }
                }
                return Fragment1()
            }
        }
    fun showToast(Message:String){
        Toast.makeText(this, Message,Toast.LENGTH_LONG).show()
    }
}
//오늘은 죄송함다...