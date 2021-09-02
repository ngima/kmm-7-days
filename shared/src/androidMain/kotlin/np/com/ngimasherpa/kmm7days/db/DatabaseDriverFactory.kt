package np.com.ngimasherpa.kmm7days.db

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver{
        TODO("")
        return AndroidSqliteDriver(object: SqlDriver.Schema {
            override val version: Int
                get() = 1

            override fun create(driver: SqlDriver) {
                TODO("Not yet implemented")
            }

            override fun migrate(driver: SqlDriver, oldVersion: Int, newVersion: Int) {
                TODO("Not yet implemented")
            }
        }, context, "test.db")
    }
}