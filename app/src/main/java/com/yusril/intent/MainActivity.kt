package com.yusril.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMove:Button
    private lateinit var btnMoveWithData:Button
    private lateinit var btnDial:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMove=findViewById(R.id.btn_move_activity)
        btnMoveWithData=findViewById(R.id.btn_move_activity_with_data)
        btnDial=findViewById(R.id.btn_dial_number)

        btnMove.setOnClickListener (this)
        btnMoveWithData.setOnClickListener (this)
        btnDial.setOnClickListener (this)
    }

    override fun onClick(v: View?) {
      when(v?.id){
          R.id.btn_move_activity->{
              val moveIntent= Intent(this@MainActivity,MoveActivity::class.java)
              startActivity(moveIntent)
          }
          R.id.btn_move_activity_with_data->{
              val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
              moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Moh Yusril Ihza Maulana")
              moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,17)
              startActivity(moveWithDataIntent)
          }
          R.id.btn_dial_number->{
              val phoneNumber = "085155303939"
              val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
              startActivity(dialPhoneIntent)
          }
      }
    }
}