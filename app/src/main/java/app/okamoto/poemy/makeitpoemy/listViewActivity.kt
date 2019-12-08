package app.okamoto.poemy.makeitpoemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import io.realm.Realm
import io.realm.RealmResults
import io.realm.Sort
import kotlinx.android.synthetic.main.activity_list_view.*

class listViewActivity : AppCompatActivity() {

    private val texts = arrayOf("poem","poetry","poetic","poet","I want to make a poem","That is poetic")

    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        val poemList = readAll()

        val textList = mutableListOf<String>()

        for (poem in poemList) {
            textList.add(poem.season+poem.content)

        }

        val delete = deleteAll()




        // simple_list_item_1 は、 もともと用意されている定義済みのレイアウトファイルのID
        val arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, textList)

        listView.setAdapter(arrayAdapter)

    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    fun readAll(): RealmResults<Poem> {
        return realm.where(Poem::class.java).findAll().sort("createdAt", Sort.ASCENDING)
    }


    fun deleteAll() {
        realm.executeTransaction {
            realm.deleteAll()
        }
    }

   /* val listView = ListView(this)
    setContentView(listView)

    val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, texts)


    listView.setAdapter(arrayAdapter)

*/



}
