package app.okamoto.poemy.makeitpoemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class springAcyivity : AppCompatActivity() {

    val springList = arrayOf("桜", "卒業", "団子", "出会い", "入学")
    val springList2 = arrayOf("桜もち", "花見", "鯛焼き", "梅", "如月")
    val springList3 = arrayOf("学校", "屋上", "入学式", "机", "黒板", "チョーク")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spring)


            appdataButton.setOnClickListener {

                val randomnum = Random.nextInt(springList.size)
                textView.text = springList[randomnum]

                val randomnum2 = Random.nextInt(springList2.size)
                textView2.text = springList2[randomnum2]

                val randomnum3 = Random.nextInt(springList3.size)
                textView3.text = springList3[randomnum3]


                //val summerViewRandom = Random.nextInt(summerViewList.size)
                //summerView.setImageState() = summerViewList[summerViewRandom]

            }

        returnButton.setOnClickListener {

            val intent2: Intent = Intent(this, choiceActivity::class.java)
            startActivity(intent2)

        }


        }
    }

