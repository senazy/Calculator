package com.senazeynepyildiz.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view : View ) {

        val number1 = num1Text.text.toString().toIntOrNull()
        val number2 = num2Text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Number fields cannot be left empty."
        } else {
            val result = number1!! + number2!!
            resultText.text = "Result : ${result}"
        }
    }

    fun deduct(view : View ) {

        val number1 = num1Text.text.toString().toIntOrNull()
        val number2 = num2Text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Number fields cannot be left empty."
        } else {
            val result = number1!! - number2!!
            resultText.text = "Result : ${result}"
        }

    }

    fun multiply(view : View ) {

        val number1 = num1Text.text.toString().toIntOrNull()
        val number2 = num2Text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            resultText.text = "Number fields cannot be left empty."
        } else {
            val result = number1!! * number2!!
            resultText.text = "Result : ${result}"
        }

    }

    fun divide(view : View ) {
        val number1 = num1Text.text.toString().toIntOrNull()
        val number2 = num2Text.text.toString().toIntOrNull()

        if (number1 == null || number2 == null || number2 == 0) {
            resultText.text = "Number fields cannot be left empty. Division by zero is not allowed."
        } else {
            val result = number1!! / number2!!
            resultText.text = "Result : ${result}"

        }

    }



}