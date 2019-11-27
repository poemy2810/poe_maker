package app.okamoto.poemy.makeitpoemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class listViewActivity : AppCompatActivity() {

    private val texts = arrayOf("poem","poetry","poetic","poet","I want to make a poem","That is poetic")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val listView = ListView(this)
        setContentView(listView)

        // simple_list_item_1 は、 もともと用意されている定義済みのレイアウトファイルのID
        val arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, texts)

        listView.setAdapter(arrayAdapter)

    }

   /* val listView = ListView(this)
    setContentView(listView)

    val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, texts)


    listView.setAdapter(arrayAdapter)

*/



}
