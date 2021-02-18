package com.yusril.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    private lateinit var tvData:TextView
    // membuat variabel penerima data intent
    companion object{
        const val EXTRA_AGE="extra_age"
        const val EXTRA_NAME="extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvData=findViewById(R.id.tv_data_received)
        // Ambil data dari intent
        val name=intent.getStringExtra(EXTRA_NAME)
        val age=intent.getIntExtra(EXTRA_AGE,0)
        val text = "Name : $name, \nYour Age : $age"
        tvData.text = text
    }

}