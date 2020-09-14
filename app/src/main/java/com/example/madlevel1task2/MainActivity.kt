package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.button.setOnClickListener(){
            checkAnswers()
        }
    }

    private fun checkAnswers(){


        val answer1 = binding.a1.text.toString()
        val answer2 = binding.a2.text.toString()
        val answer3 = binding.a3.text.toString()
        val answer4 = binding.a4.text.toString()

        if (answer1 == getString(R.string.T_set)) {
            index++
        }
        if (answer2 == getString(R.string.F_set)) {
            index++
        }
        if (answer3 == getString(R.string.F_set)) {
            index++
        }
        if (answer4 == getString(R.string.F_set)) {
            index++
        }
    }

    private fun submitAnswers(){
        checkAnswers()
        if (index == 4){
            Toast.makeText(this, getString(R.string.Correct_Text), Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, getString(R.string.Incorrect_Text), Toast.LENGTH_LONG).show()
        }

    }

}