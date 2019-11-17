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
    /*val springList = arrayOf("桜", "卒業", "団子", "出会い", "入学")
    val christmasList = arrayOf("クリスマス", "冬", "雪", "寒さ", "お正月")

    val summerViewList = arrayOf("summer1", "summer2", "summer3", "summer4", "summer5")
*/

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


            
            //val summerViewRandom = Random.nextInt(summerViewList.size)




        }




    }
}



