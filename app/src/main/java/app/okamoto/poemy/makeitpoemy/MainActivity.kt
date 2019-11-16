package app.okamoto.poemy.makeitpoemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val summerList = arrayOf("海", "かき氷", "夏休み", "暑い", "")

    val summerView = arrayOf("summer1", "summer2", "summer3", "summer4", "summer5")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appdataButton.setOnClickListener {

            val randomnum = Random.nextInt(summerList.size)
            textView.text = summerList[randomnum]

            val randomnumber = Random.nextInt(summerView.size)

        }



        /*override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            appdataButton.setOnClickListener {


        }
            */


    }
}



