package jdp.adapter;

import java.io.File;
import java.net.URI;
import java.net.URL;

import jdp.adapter.mediaplayer.AudioPlayer;

public class MainAdapterDemo {

	public static void main(String[] args) {
		File file = null;
		if (args.length!=0) {
			try {

				ClassLoader cl = MainAdapterDemo.class.getClassLoader();
				String pathToFile = args[0];
				System.out.println(cl.getResource(pathToFile));
				URL url = cl.getResource(pathToFile);
				URI uri = new URI(url.toString());
				file = new File(uri);
			} catch(Exception e) {
				e.printStackTrace();
			}
		} 

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.playAudio(file);

	}

}