package app.okamoto.poemy.makeitpoemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.choice.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val summerList = arrayOf("海", "かき氷", "夏休み", "暑い", "Tシャツ")
    val summerList2 = arrayOf("すいか", "そうめん", "アイス","りんご飴", "焼きトウモロコシ")
    val summerList3 = arrayOf("祭り", "花火", "浴衣", "射的", "盆踊り", "エアコン")
    val summerViewList = arrayOf("summer1", "summer2", "summer3", "summer4", "summer5")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        appdataButton.setOnClickListener {

            val randomnum = Random.nextInt(summerList.size)
            textView.text = summerList[randomnum]

            val randomnum2 = Random.nextInt(summerList2.size)
            textView2.text = summerList2[randomnum2]

            val randomnum3 = Random.nextInt(summerList3.size)
            textView3.text = summerList3[randomnum3]



            val typedArray= resources.obtainTypedArray(R.array.list_random_summerView)
            // array.xmlから配列として取得

            val rand = Math.floor(Math.random() * typedArray.length()).toInt()
            //0~画像の枚数からランダムに番号を取得

            val drawable = typedArray.getDrawable(rand)
            //配列からその番号の画像を取得

            ViewImage.setImageDrawable(drawable) //Viewに画像をsetする

        }

        returnButton.setOnClickListener {

            val intent2: Intent = Intent(this, choiceActivity::class.java)
            startActivity(intent2)

        }




    }
}



