package com.example.musicplayer.playerService

import com.google.gson.annotations.SerializedName

//음악 데이터 하나를 가져오는데 필요한 속성들을 정의
data class MusicEntity (

    //SerializedName을 통해 실제 Json에서 사용되는 형식명을 등록
    @SerializedName("track") val track: String,
    @SerializedName("streamUrl") val streamUrl: String,
    @SerializedName("artist") val artist: String,
    @SerializedName("coverUrl") val coverUrl: String
)