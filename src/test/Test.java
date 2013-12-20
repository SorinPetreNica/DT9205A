package test;

import java.io.File;
import java.util.Map;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Test {

	public static void main(String[] args) throws NativeHookException {

		GlobalScreen.registerNativeHook();

		final FileManager fileManager = new FileManager();

		GlobalScreen.getInstance().addNativeKeyListener(new NativeKeyListener() {

			@Override
			public void nativeKeyTyped(NativeKeyEvent event) {
				fileManager.addChar(fileManager.calculateFinalChar(event));
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

		private final StringBuilder content = new StringBuilder();

		public Character calculateFinalChar(NativeKeyEvent event) {
			return event.getKeyChar();
		}

		public void addChar(Character c) {
			content.append(c);
		}

		public byte[] getContent() {
			return null;
		}

		public void resetContent() {

		}
	}

	public static class TransportClient {

		private final Map<String, Integer> servers = null;

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
