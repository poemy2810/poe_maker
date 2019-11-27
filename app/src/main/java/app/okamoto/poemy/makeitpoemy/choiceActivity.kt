package app.okamoto.poemy.makeitpoemy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.choice.*

class choiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choice)


        val intent: Intent = Intent(this, MainActivity::class.java)
        val intentSpring: Intent = Intent(this, springAcyivity::class.java)
        val intentChristmas: Intent = Intent(this,christmasActivity::class.java)
        val intentListView: Intent = Intent(this,listViewActivity::class.java )

        summerButton.setOnClickListener {
            startActivity(intent)
        }

        springButton.setOnClickListener {
            startActivity(intentSpring)
        }

        christmasButton.setOnClickListener {
            startActivity(intentChristmas)
        }

        listViewButton.setOnClickListener {
            startActivity(intentListView)

        }



    }
}
