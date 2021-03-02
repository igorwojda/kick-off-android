package com.example.kickoff.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kickoff.R
import com.example.kickoff.databinding.ActivityMainBinding
import com.example.kickoff.presentation.delegate.viewBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val viewModel by viewModels<MainActivityViewModel>()

    private val binding: ActivityMainBinding by viewBinding()

    private val actorAdapter = ActorAdapter()

    private val observer = Observer<List<String>> {
        actorAdapter.items = it
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = actorAdapter
        }

        viewModel.LiveData.observe(this, observer)
    }
}
