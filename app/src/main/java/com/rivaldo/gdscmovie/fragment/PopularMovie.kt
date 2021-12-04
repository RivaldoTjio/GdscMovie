package com.rivaldo.gdscmovie.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rivaldo.gdscmovie.R
import com.rivaldo.gdscmovie.adapter.RecyclerViewAdapter
import com.rivaldo.gdscmovie.model.Movie

class PopularMovie : Fragment() {

    private val Movie = mutableListOf<Movie>()
    private lateinit var adapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_popular_movie, container, false)
        Movie.add(
            Movie("popmov", "https://asianwiki.com/images/1/1c/Kingdom-_Ashin_of_the_North-P2.jpg", 1)
        )
        Movie.add(
            Movie("oijfowf", "https://asianwiki.com/images/1/1c/Kingdom-_Ashin_of_the_North-P2.jpg", 1)
        )
        Movie.add(
            Movie("foinwefw", "https://asianwiki.com/images/1/1c/Kingdom-_Ashin_of_the_North-P2.jpg", 1)
        )
        Movie.add(
            Movie("foinwefw", "https://asianwiki.com/images/1/1c/Kingdom-_Ashin_of_the_North-P2.jpg", 1)
        )
        Movie.add(
            Movie("foinwefw", "https://asianwiki.com/images/1/1c/Kingdom-_Ashin_of_the_North-P2.jpg", 1)
        )
        val rv = view.findViewById<RecyclerView>(R.id.rcvPopular)
        adapter = RecyclerViewAdapter()
        rv.apply {
            layoutManager = GridLayoutManager(context, 2)
        }
        rv.adapter = adapter
        adapter.updateData(Movie)
        return view
    }


}