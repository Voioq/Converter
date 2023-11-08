package com.example.todo

import android.os.Bundle
import android.util.Log
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_speed.*

class SpeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speed)
        //завершение программы
        btn_back.setOnClickListener{finish()}
        //цифры
        btn_zero.setOnClickListener{setTextFields("0")}
        btn_one.setOnClickListener{setTextFields("1")}
        btn_two.setOnClickListener{setTextFields("2")}
        btn_three.setOnClickListener{setTextFields("3")}
        btn_four.setOnClickListener{setTextFields("4")}
        btn_five.setOnClickListener{setTextFields("5")}
        btn_six.setOnClickListener{setTextFields("6")}
        btn_seven.setOnClickListener{setTextFields("7")}
        btn_eight.setOnClickListener{setTextFields("8")}
        btn_nine.setOnClickListener{setTextFields("9")}
        //только одна точка
        btn_dot.setOnClickListener{
            if (textValue.text.toString().indexOf(".") == -1){
                setTextFields(".")
            }
        }
        //сброс AC
        btn_c.setOnClickListener{
            textValue.text = ""
        }
        //backspace
        btn_backspace.setOnClickListener{
            if (textValue.text.isNotEmpty()){
                textValue.text = textValue.text.substring(0, textValue.text.length - 1)
            }
        }
        //запуск вычислений
        btn_enter.setOnClickListener{
            try {
                val num_value: Double = textValue.text.toString().toDouble()
                val spinner = findViewById<Spinner>(R.id.spinner)
                val selected: Int = spinner.selectedItemPosition
                when (selected) {
                    0 -> {
                        textFirst.text = "%.3f".format(num_value).toString() + " Км/ч"
                        textSecond.text = "%.3f".format(num_value/3.6).toString() + " М/с"
                    }
                    1 -> {
                        textFirst.text = "%.3f".format(num_value * 3.6).toString() + " Км/ч"
                        textSecond.text = (num_value).toString() + " М/с"
                    }
                }
            }
            catch (e:Exception){
                Log.d("Error.","Сообщение: ${e.message}")
            }
        }
    }
    //добавляем 1 символ в поле
    fun setTextFields(str: String){
        textValue.append(str)
    }
}