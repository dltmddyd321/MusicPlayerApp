package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //프래그먼트 컨테이너와 컨테이너에 삽입할 프래그먼트들을 담고 화면에 반영
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentMain, PlayerFragment.newInstance())
            .commit()

    }
}