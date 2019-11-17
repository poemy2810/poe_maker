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

        summerButton.setOnClickListener {
            startActivity(intent)
        }


    }
}
