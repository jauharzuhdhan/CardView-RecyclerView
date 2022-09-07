package com.example.cardview_recyclerview

var bookList = mutableListOf<Book>()

class Book (
    var cover: Int,
    var author: String,
    var title: String,
    val id: Int? = bookList.size
)