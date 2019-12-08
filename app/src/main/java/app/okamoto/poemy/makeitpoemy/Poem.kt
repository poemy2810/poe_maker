package app.okamoto.poemy.makeitpoemy

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Poem(
    @PrimaryKey open var id: String = UUID.randomUUID().toString(),
   open var season: String = "",
    open var content: String = "",
    open var createdAt: Date = Date(System.currentTimeMillis())
) : RealmObject()