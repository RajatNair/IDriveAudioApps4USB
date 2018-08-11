package me.hufman.idriveaudioappsusb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import me.hufman.idriveconnectionkit.android.CarAPIDiscovery

class CarConnectionListener: BroadcastReceiver() {

	override fun onReceive(context: Context?, intent: Intent?) {
		if (context == null || intent == null) return
		// car changed connection status
		if (intent.action == "com.bmwgroup.connected.accessory.ACTION_CAR_ACCESSORY_ATTACHED") {

			context.startService(Intent(context, AppLauncher::class.java).setAction(AppLauncher.START_COMMAND))
		}
	}
}