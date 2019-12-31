package com.example.excel2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var kms = Cell("kms", 0.0)
    var time = Cell("time", 0.0)
    var speed = Cell("speed", 0.0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonId.setOnClickListener {


            var myKms = kmsId.text.toString().toDouble()
            var myTime = timeId.text.toString().toDouble()
            var mySpeed = speedId.text.toString().toDouble()


            kms.value = myKms
            time.value = myTime
            speed.value = mySpeed


            if (speed.value == 0.0 ) {
                speed.value = kms.value/time.value

            } else if(time.value == 0.0) {
                time.value = kms.value/speed.value

            } else {
                kms.value = time.value*speed.value
            }


            println("---> kms: ${kms.value}")
            println("---> time: ${time.value}")
            println("---> speed: ${speed.value}")


            kmsId.setText(formattedDoubleToString(kms.value))
            timeId.setText(formattedDoubleToString(time.value))
            speedId.setText(formattedDoubleToString(speed.value))

        }
    }



}








