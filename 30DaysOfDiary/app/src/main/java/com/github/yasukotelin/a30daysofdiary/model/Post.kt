package com.github.yasukotelin.a30daysofdiary.model

import androidx.annotation.DrawableRes
import com.github.yasukotelin.a30daysofdiary.R

data class Post(
    val day: Int,
    @DrawableRes val pictureResId: Int,
    val text: String,
)

val posts = listOf(
    Post(
        day = 1,
        pictureResId = R.drawable.photo1,
        text = "今日は外出をした。今にも雨が降りそうな雲が印象的だったけど、今にも降られるのではないかとひやひやした。"
    ),
    Post(
        day = 2,
        pictureResId = R.drawable.photo2,
        text = "メリークリスマス！クリスマスケーキがすごく美味しくて素敵な一日になった。"
    ),
    Post(
        day = 3,
        pictureResId = R.drawable.photo3,
        text = "バスケをしてきた。普段運動をしていないから、走るので精一杯だったけど気持ちの良い一日になった。"
    ),
    Post(
        day = 4,
        pictureResId = R.drawable.photo4,
        text = "紅葉を見てきた。いちょう並木が黄色く色づいていて、秋を感じれる素晴らしい一日となった。"
    ),
    Post(
        day = 5,
        pictureResId = R.drawable.photo5,
        text = "今日は生活必需品を買いに街へ。通りの向かいにおしゃれなカフェを発見。優雅な一日となった。"
    ),
    Post(
        day = 6,
        pictureResId = R.drawable.photo6,
        text = "一日何も予定がなかったので近所の河川敷へ。金網越しに咲いていた花を見つけて癒された。"
    )
)