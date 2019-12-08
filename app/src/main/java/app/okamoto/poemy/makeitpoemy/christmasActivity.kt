package app.okamoto.poemy.makeitpoemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class christmasActivity : AppCompatActivity() {

    val christmasList = arrayOf("クリスマス", "サンタ", "クリスマスツリー", "ドイツ", "フィンランド")
    val christmasList2 = arrayOf("ジンジャーブレッド", "シュトーレン", "クリスマスケーキ", "七面鳥", "チキン")
    val christmasList3 = arrayOf("雪", "雪だるま", "手袋", "マフラー", "寒さ", "暖房")

    var whenIndex3 = 0
    var whoIndex3 = 0
    var whereIndex3 = 0
    var keywordIndex3 = 0


    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_christmas)


        val whenImageList3 = arrayOf(R.drawable.morning, R.drawable.noon, R.drawable.evening,R.drawable.night)
        val whoImageList3 = arrayOf(R.drawable.friend, R.drawable.couple, R.drawable.pet, R.drawable.parents)
        val whereImageList3 = arrayOf(R.drawable.house,R.drawable.road,R.drawable.snow,R.drawable.station)
        val keywordImageList3 = arrayOf(
            arrayOf(R.drawable.cake, R.drawable.cocoa, R.drawable.present,R.drawable.santa,R.drawable.tree),
            arrayOf(R.drawable.jihanki, R.drawable.mitton, R.drawable.nitcap,R.drawable.roadtree),
            arrayOf(R.drawable.ski, R.drawable.slider, R.drawable.snowboard,R.drawable.snowman),
            arrayOf(R.drawable.clock, R.drawable.crowded, R.drawable.information,R.drawable.muffler)

        )




        whenButton.setOnClickListener {
            whenIndex3 = Random.nextInt(whenImageList3.size)
            whenImage.setImageResource(whenImageList3[whenIndex3])
        }

        whoButton.setOnClickListener {
            whoIndex3 = Random.nextInt(whoImageList3.size)
            whoImage.setImageResource(whoImageList3[whoIndex3])
        }

        whereButton.setOnClickListener {
            whereIndex3 = Random.nextInt(whereImageList3.size)
            whereImage.setImageResource(whereImageList3[whereIndex3])
        }

        keywordButton.setOnClickListener {
            keywordIndex3 = Random.nextInt(keywordImageList3[whereIndex3].size)
            keywordImage.setImageResource(keywordImageList3[whereIndex3][keywordIndex3])
        }




        saveButton.setOnClickListener {
            //editText.text = editText.text
            create( "christmas: ", editText.text.toString())
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

    fun create(season: String, content: String) {
        realm.executeTransaction {
            val poem = it.createObject(Poem::class.java, UUID.randomUUID().toString())
            poem.season = season
            poem.content = content
        }
    }
}
