package com.example.unitconverterpro

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //defined codes

        //set a listener to convert meters to centimeters button
        val convertToCm : Button = findViewById(R.id.btntocentimeters)
        val convertToMeters : Button = findViewById(R.id.btncmtometers)




        convertToCm.setOnClickListener {
            val metersToConvert : EditText = findViewById(R.id.meterstoconvert)
            val centimeters = metersToConvert.text.toString()
            val displayCentimeters :TextView =findViewById(R.id.centimetersdisplay)

            val centimetersorNull = centimeters.toDoubleOrNull()
            if (centimetersorNull ==null){
                Toast.makeText(this, "This Field Can not be Empty", Toast.LENGTH_SHORT).show()
                displayCentimeters.text = ""

            }else{

                var convertedCentimeters =String.format("%.3f", centimetersorNull * 100).toDouble()

                displayCentimeters.text = "The Answer : ${convertedCentimeters}CM"
            }




        }


        //convert to meters

        convertToMeters.setOnClickListener {

            val centimetersToConvert : EditText = findViewById(R.id.cmtoconvert)
            val meters = centimetersToConvert.text.toString()
            val displaymeters :TextView =findViewById(R.id.metersdisplay)

            val metersorNull = meters.toDoubleOrNull()
            if (metersorNull ==null){
                Toast.makeText(this, "This Field Can not be Empty", Toast.LENGTH_SHORT).show()
                displaymeters.text = ""

            }else{

                var convertedmeters =String.format("%.4f", metersorNull / 100).toDouble()
                //var convertedmeters = metersorNull / 100

                displaymeters.text = "The Answer : ${convertedmeters}M"
            }
        }








        //endofdefined codes


    }
}