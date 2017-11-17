package jdp.adapter.mediaplayer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class VideoPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVideo(File file) {
		try {
			FileReader freader = new FileReader(file);
			System.out.println("Playing with VideoPlayer");
			FileWriter fileout = new FileWriter("AVIread.avi");
			while (freader.read()!= -1) {
				fileout.write(freader.read());
			}
			freader.close();
			fileout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void playMP4(File file) {
		
	}

}
