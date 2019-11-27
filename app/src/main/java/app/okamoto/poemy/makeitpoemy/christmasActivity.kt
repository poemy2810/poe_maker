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


        val whenImageList = arrayOf(R.drawable.morning, R.drawable.noon, R.drawable.evening,R.drawable.night)
        val whoImageList = arrayOf(R.drawable.friend, R.drawable.couple, R.drawable.pet, R.drawable.parents,R.drawable.sea)
        val whereImageList = arrayOf(R.drawable.camp,R.drawable.festival,R.drawable.grandmother,R.drawable.sea)
        val keywordImageList = arrayOf(
            arrayOf(R.drawable.bbq, R.drawable.candle, R.drawable.shavedice,R.drawable.star),
            arrayOf(R.drawable.mask, R.drawable.ringoame, R.drawable.shateki,R.drawable.yukata),
            arrayOf(R.drawable.furin, R.drawable.ocha, R.drawable.trump,R.drawable.watermelon),
            arrayOf(R.drawable.parasol, R.drawable.ukiwa, R.drawable.watermelon2)

        )


        var whenIndex = 0
        var whoIndex = 0
        var whereIndex = 0
        var keywordIndex = 0

        whenButton.setOnClickListener {
            whenIndex = Random.nextInt(whenImageList.size)
            whenImage.setImageResource(whenImageList[whenIndex])
        }

        whoButton.setOnClickListener {
            whoIndex = Random.nextInt(whoImageList.size)
            whoImage.setImageResource(whoImageList[whoIndex])
        }

        whereButton.setOnClickListener {
            whereIndex = Random.nextInt(whereImageList.size)
            whereImage.setImageResource(whereImageList[whereIndex])
        }

        keywordButton.setOnClickListener {
            keywordIndex = Random.nextInt(keywordImageList[whereIndex].size)
            keywordImage.setImageResource(keywordImageList[whereIndex][keywordIndex])
        }








        /*appdataButton.setOnClickListener {

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
        */


    }
}
