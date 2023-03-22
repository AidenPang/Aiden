package tw.pu.o1103017.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var txv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setOnClickListener (){
            if (txv.text == "彭定振？"){
                txv.text = "帅哥"
            }else{
                txv.text = "而呵呵"
            }

        }
    }
}