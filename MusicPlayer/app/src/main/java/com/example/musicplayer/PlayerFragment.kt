package com.example.musicplayer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class PlayerFragment : Fragment(R.layout.fragment_player) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        //PlayerFragment를 포함한 함수를 생성하여 내부의 인자 값이나 로직을 변경하기
        fun newInstance() : PlayerFragment {
            return PlayerFragment()
        }
    }
}