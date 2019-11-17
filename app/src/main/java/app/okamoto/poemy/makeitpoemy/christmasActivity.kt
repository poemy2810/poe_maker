package app.okamoto.poemy.makeitpoemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class christmasActivity : AppCompatActivity() {

    val christmasList = arrayOf("クリスマス", "サンタ", "クリスマスツリー", "ドイツ", "フィンランド")
    val christmasList2 = arrayOf("ジンジャーブレッド", "シュトーレン", "クリスマスケーキ", "七面鳥", "チキン")
    val christmasList3 = arrayOf("雪", "雪だるま", "手袋", "マフラー", "寒さ", "暖房")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_christmas)



        appdataButton.setOnClickListener {

            val randomnum = Random.nextInt(christmasList.size)
            textView.text = christmasList[randomnum]

            val randomnum2 = Random.nextInt(christmasList2.size)
            textView2.text = christmasList2[randomnum2]

            val randomnum3 = Random.nextInt(christmasList3.size)
            textView3.text = christmasList3[randomnum3]


            //val summerViewRandom = Random.nextInt(summerViewList.size)
            //summerView.setImageState() = summerViewList[summerViewRandom]

        }

        returnButton.setOnClickListener {

            val intent2: Intent = Intent(this, choiceActivity::class.java)
            startActivity(intent2)

        }

    }
}
