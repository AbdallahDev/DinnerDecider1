package com.sarayrah.abdallah.dinnerdecider1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("منسف", "مقلوبة")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideFoodBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addNewFoodBtn.setOnClickListener {
            foodList.add(addNewFoodTxt.text.toString())
            addNewFoodTxt.text.clear()
        }
    }
}
