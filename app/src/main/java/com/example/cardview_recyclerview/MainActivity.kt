package com.example.cardview_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cardview_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList)
        }
    }

    private fun populateBooks() {
        val book1 = Book(
            R.drawable.book1,
            "Surya Insomnia",
            "Judul Buku 1"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.book2,
            "Andre Taulany",
            "Judul Buku 2"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.book3,
            "Vincent Rompies",
            "Judul Buku 3"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.book4,
            "Deddy Mahendra Desta",
            "Judul Buku 4"
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.book5,
            "Tora Sudiro",
            "Judul Buku 5"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.book6,
            "Soleh Solihun",
            "Judul Buku 6"
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.book7,
            "Wendy Armoko",
            "Judul Buku 7"
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.book8,
            "Imam Darto",
            "Judul Buku 8"
        )
        bookList.add(book8)

        val book9 = Book(
            R.drawable.book9,
            "Ananda Omesh",
            "Judul Buku 9"
        )
        bookList.add(book9)

        val book10 = Book(
            R.drawable.book10,
            "Stevi Item",
            "Judul Buku 10"
        )
        bookList.add(book10)

        val book11 = Book(
            R.drawable.book11,
            "Gading Marten",
            "Judul Buku 11"
        )
        bookList.add(book11)
    }
}