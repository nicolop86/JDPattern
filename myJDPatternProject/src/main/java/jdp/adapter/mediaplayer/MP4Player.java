package jdp.adapter.mediaplayer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVideo(File file) {
		
	}

	@Override
	public void playMP4(File file) {
		try {
			FileReader freader = new FileReader(file);
			System.out.println("Playing with MP4Player");
			FileWriter fileout = new FileWriter("MP4read.mp4");
			while (freader.read()!= -1) {
				fileout.write(freader.read());
			}
			freader.close();
			fileout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
