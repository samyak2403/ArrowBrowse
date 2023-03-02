package com.arrowwould.arrowbrowse.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.arrowwould.arrowbrowse.adapter.BookmarkAdapter
import com.arrowwould.arrowbrowse.databinding.ActivityBookmarkBinding



class BookmarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBookmarkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBookmarks.setItemViewCacheSize(5)
        binding.rvBookmarks.hasFixedSize()
        binding.rvBookmarks.layoutManager = LinearLayoutManager(this)
        binding.rvBookmarks.adapter = BookmarkAdapter(this, isActivity = true)
    }
}