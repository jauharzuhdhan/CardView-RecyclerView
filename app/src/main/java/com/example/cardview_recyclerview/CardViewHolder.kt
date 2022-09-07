package com.example.cardview_recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.cardview_recyclerview.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding
) : RecyclerView.ViewHolder(cardCellBinding.root){
    fun bindBook(book: Book)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.tvTitle.text = book.title
        cardCellBinding.tvAuthor.text = book.author
    }
}