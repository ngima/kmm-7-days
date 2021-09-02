package np.com.ngimasherpa.kmm7days

import platform.Foundation.NSUUID
import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

    actual fun randomUUID() = NSUUID().UUIDString()
}