package com.example.calcl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etInput1=findViewById<EditText>(R.id.etInput1)
        val etInput2=findViewById<EditText>(R.id.etInput2)
        val tvTotal=findViewById<TextView>(R.id.tvTotalLbl)
        val btnMultiplication=findViewById<Button>(R.id.btnMultiplication)
        val btnAdd=findViewById<Button>(R.id.btnAdd)
        val btnModule=findViewById<Button>(R.id.btnModule)
        val btnsubtration=findViewById<Button>(R.id.btnsubtration)

        btnAdd.setOnClickListener{
            if(etInput1.text.toString()==""){
                Toast.makeText(baseContext, "Enter a number",Toast.LENGTH_LONG).show()

            }
            else if (etInput2.text.toString()==""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()


            }
            else{
                val Input1=etInput1.text.toString().toInt()
                val Input2=etInput2.text.toString().toInt()
                val addTotal=Input1+Input2
                 tvTotal.text="Answer:${addTotal}"
            }
        }
        btnsubtration.setOnClickListener{
            if (etInput1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()

            }
            else if (etInput2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()

            }
            else{
                val Input1=etInput1.text.toString().toInt()
                val Input2=etInput2.text.toString().toInt()
                val subTotal=Input1-Input2
                tvTotal.text="Total:${subTotal}"
            }
        }
        btnMultiplication.setOnClickListener{
            if (etInput1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()

            }
            else if(etInput1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()

            }
            else{
                val Input1=etInput1.text.toString().toInt()
                val Input2=etInput2.text.toString().toInt()
                val multiplicationTotal=Input1*Input2
                tvTotal.text="Total:${multiplicationTotal}"

            }
        }
        btnModule.setOnClickListener {
            if (etInput1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()

            } else if (etInput2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()

            } else {
                val Input1 = etInput1.text.toString().toInt()
                val Input2 = etInput2.text.toString().toInt()
                val moduleTotalTotal = Input1 % Input2
                tvTotal.text = "Total:${moduleTotalTotal}"


            }
        }




        

    }
}