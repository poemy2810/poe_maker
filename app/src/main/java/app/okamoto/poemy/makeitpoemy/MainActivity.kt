package app.okamoto.poemy.makeitpoemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.choice.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val whenList = arrayOf("朝", "昼", "夕方", "夜")
    val whereList = arrayOf("学校", "海", "山", "遊園地", "夏祭り", "花火大会")
    val whoList = arrayOf("家族", "友人", "親友", "好きな人", "ペット")
    val keywordList = arrayOf(
        arrayOf("チョーク", "机", "あ"),
        arrayOf("あ","い","u")
    )


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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*whenButton.setOnClickListener {

            val randomnum = Random.nextInt(whenList.size)
            whenView.text = whenList[randomnum]

            val randomnum2 = Random.nextInt(whereList.size)
            textView2.text = whereList[randomnum2]

            val randomnum3 = Random.nextInt(whoList.size)
            textView3.text = whoList[randomnum3]


            val typedArray = resources.obtainTypedArray(R.array.list_when)
            // array.xmlから配列として取得

            val rand = Math.floor(Math.random() * typedArray.length()).toInt()
            //0~画像の枚数からランダムに番号を取得

            val drawable = typedArray.getDrawable(rand)
            //配列からその番号の画像を取得

            viewImage.setImageDrawable(drawable) //Viewに画像をsetする

        }
        */


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



        enterButton.setOnClickListener {
            editText.text = editText.text
        }




        /*returnButton.setOnClickListener {
            val intent2: Intent = Intent(this, choiceActivity::class.java)
            startActivity(intent2)
        }

         */


    }
}



