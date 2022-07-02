package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList = fibonacci(100)
        print(numberList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter= NumberRecyclerViewAdapter(numberList)

    }
    fun fibonacci(numbers:Int): List<Int> {
        var list= ArrayList<Int>()
        var lowerLimit =1
        var firstNum = 0
        var secondNum = 1
        while (lowerLimit<=numbers){
            print(firstNum)
            val sum = firstNum + secondNum
            firstNum = secondNum
            secondNum = sum
            lowerLimit ++
            list+=sum
        }
        return  list
    }
}





