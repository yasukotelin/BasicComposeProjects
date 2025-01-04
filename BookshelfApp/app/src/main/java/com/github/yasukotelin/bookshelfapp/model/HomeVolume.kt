package com.github.yasukotelin.bookshelfapp.model

data class HomeVolume(
    val title: String,
    private val thumbnail: String,
) {
    // URLがhttpだった場合にcoilが弾くためhttpsに置換する（Google Books APIの場合httpで返却されてくるがhttpsでも通信できるため）
    val secureThumbnail: String = thumbnail.replace("http://", "https://")
}