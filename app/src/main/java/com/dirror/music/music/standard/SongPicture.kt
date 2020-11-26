package com.dirror.music.music.standard

import com.dirror.music.api.API_FCZBL_VIP
import com.dirror.music.music.standard.data.SOURCE_NETEASE
import com.dirror.music.music.standard.data.SOURCE_QQ
import com.dirror.music.music.standard.data.StandardSongData

object SongPicture {

    const val TYPE_LARGE = 1
    const val TYPE_SMALL = 2

    /**
     * 获取图片
     */
    fun getSongPictureUrl(songData: StandardSongData, type: Int): String {
        return when (songData.source) {
            SOURCE_NETEASE -> {
                // url = url.replace("?param=300y300", "?param=1000y60")
                when (type) {
                    TYPE_LARGE -> {
                        "$API_FCZBL_VIP/?type=cover&id=${songData.id}"
                    }
                    else -> {
                        "$API_FCZBL_VIP/?type=cover&id=${songData.id}"
                    }
                }

            }
            SOURCE_QQ -> {
                "https://y.gtimg.cn/music/photo_new/T002R300x300M000${songData.imageUrl as String}.jpg?max_age=2592000"
            }
            else -> {
                ""
            }
        }

    }

}