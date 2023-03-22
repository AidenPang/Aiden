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
            if (txv.text == "你好不好吗？"){
                txv.text = "不想知道"
            }else{
                txv.text = "哈哈啊哈哈啊哈"
            }

        }
    }
}