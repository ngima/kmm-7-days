package np.com.ngimasherpa.kmm7days.db

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {

    actual fun createDriver(): SqlDriver{

        return NativeSqliteDriver(object: SqlDriver.Schema {
            override val version: Int
                get() = 1

            override fun create(driver: SqlDriver) {
                TODO("Not yet implemented")
            }

            override fun migrate(driver: SqlDriver, oldVersion: Int, newVersion: Int) {
                TODO("Not yet implemented")
            }
        }, "test.db")
    }
}