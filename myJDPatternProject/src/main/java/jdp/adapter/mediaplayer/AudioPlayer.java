package jdp.adapter.mediaplayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jdp.adapter.mediaadapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void playAudio(File file) {
		int pos = file.getName().lastIndexOf(".");
		String extension=null;
		if (pos >0) {
			extension = file.getName().substring(pos+1);
		}
		FileReader freader = null;
		if(extension.equalsIgnoreCase("mp3")) {
			try {
				freader = new FileReader(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Playing with MP3 AudioPlayer");
			_streamToOutput(freader, file);
		} else if (extension.equalsIgnoreCase("mp4") || extension.equalsIgnoreCase("avi")) {
			System.out.println("Playing with MediaAdapter");
			MediaAdapter ma = new MediaAdapter(extension);
			ma.playAudio(file);
		}
	}
	
	private void _streamToOutput(FileReader freader, File file) {
		try {
			FileWriter fileout = new FileWriter("MP3read.mp3");
			while (freader.read()!= -1) {
				fileout.write(freader.read());
			}
			freader.close();
			fileout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
