package com.example.medicare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast


class locationActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.location_input)

        // get reference to the string array that we just created
        val location = resources.getStringArray(R.array.location)

        // create an array adapter and pass the required parameter
        // in our case pass the context, drop down layout , and array.
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_list, location)

        // get reference to the autocomplete text view
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoComplete)

        // set adapter to the autocomplete tv to the arrayAdapter
        autoCompleteTextView.setAdapter(arrayAdapter)

        val button1= findViewById(R.id.button1)as Button

        button1.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}