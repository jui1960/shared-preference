package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityItemNoteBinding
import com.example.myapplication.databinding.ActivityMainBinding


class NoteAdapter(private val notlist: List<Note>) :
    RecyclerView.Adapter<NoteAdapter.noteViewholder>() {
    inner class noteViewholder(val binding: ActivityItemNoteBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): noteViewholder {
        val binding =
            ActivityItemNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return noteViewholder(binding)
    }

    override fun onBindViewHolder(
        holder: noteViewholder,
        position: Int
    ) {
        holder.binding.txtItemNote.text = notlist[position].text
    }

    override fun getItemCount(): Int {
        return notlist.size
    }

}