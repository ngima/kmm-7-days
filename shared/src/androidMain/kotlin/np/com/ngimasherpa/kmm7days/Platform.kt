package np.com.ngimasherpa.kmm7days

import java.util.*

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"

    actual fun randomUUID(): String{
        return UUID.randomUUID().toString()

    }
}