import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()
	let uuid = UUID.randomUUID()

	var body: some View {
		Text("\(greet) && Random UUID \(uuid)")
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}