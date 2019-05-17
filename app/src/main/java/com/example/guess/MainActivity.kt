package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

//    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d("Mainactivity","SecertNumber : ${secretNumber.secret}")
    }

//    fun check(view:View){
//        val n:Int = number.text.toString().toInt()
//        println("number: $n")
//        Log.d("MainActivity","number $n")
//        val diff:Int = secretNumber.validate(n)
//        var message = getString(R.string.you_got_it)
//        if(diff < 0){
//            message = getString(R.string.bigger)
//        } else if(diff > 0){
//            message = getString(R.string.smaller)
//        }
////        Toast.makeText(this , message , Toast.LENGTH_LONG).show()
//        AlertDialog.Builder(this)
//            .setTitle(getString(R.string.dialog_message))
//            .setMessage(message)
//            .setPositiveButton(R.string.ok,null)
//            .show()
//    }
}
