package com.example.todo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageTemp.setOnClickListener{
            val intent = Intent(this, TemperatureActivity::class.java)
            startActivity(intent);
        }
        imageTime.setOnClickListener{
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent);
        }
        imageSpeed.setOnClickListener{
            val intent = Intent(this, SpeedActivity::class.java)
            startActivity(intent);
        }
        imageLength.setOnClickListener{
            val intent = Intent(this, LengthActivity::class.java)
            startActivity(intent);
        }
        imageWeight.setOnClickListener{
            val intent = Intent(this, WeightActivity::class.java)
            startActivity(intent);
        }
    }

}