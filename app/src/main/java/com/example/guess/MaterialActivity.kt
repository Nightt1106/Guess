package com.example.guess

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_material.*
import kotlinx.android.synthetic.main.content_material.*

class MaterialActivity : AppCompatActivity() {

    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    fun check(view: View){
        val n:Int = number.text.toString().toInt()
        println("number: $n")
        Log.d("MainActivity","number $n")
        val diff:Int = secretNumber.validate(n)
        var message = getString(R.string.you_got_it)
        if(diff < 0){
            message = getString(R.string.bigger)
        } else if(diff > 0){
            message = getString(R.string.smaller)
        }
//        Toast.makeText(this , message , Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle(getString(R.string.dialog_message))
            .setMessage(message)
            .setPositiveButton(R.string.ok,null)
            .show()
    }

}
