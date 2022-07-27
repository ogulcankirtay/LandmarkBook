package com.ogulcankirtay.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ogulcankirtay.landmarkbook.databinding.ActivityDetailsActivtyBinding
import com.ogulcankirtay.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //initilaze ettik
        landmarkList=ArrayList<Landmark>()
        //data
        val pisa=Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum=Landmark("Colosseum","Italy",R.drawable.colosseum)
        val london=Landmark("London Bridge","UK",R.drawable.londonbridge)
        val eiffel=Landmark("Eiffel","France",R.drawable.eiffel)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colosseum)
        landmarkList.add(london)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val lma=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=lma
    }
}