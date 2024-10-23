package com.example.recyclerview
import dataclass.Place
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var myList: ArrayList<Place>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        myList = ArrayList<Place>()
        for (i in 0 until 500)
        {
            myList.add(Place("Country $i", i*500, "Capital $i"))
        }
        val recycler_view: RecyclerView = findViewById(R.id.recycler_view)
        recycler_view.adapter = LineAdap
        ter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

}