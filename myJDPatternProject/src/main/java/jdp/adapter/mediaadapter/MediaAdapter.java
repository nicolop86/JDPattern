package jdp.adapter.mediaadapter;

import java.io.File;

import jdp.adapter.mediaplayer.AdvancedMediaPlayer;
import jdp.adapter.mediaplayer.MP4Player;
import jdp.adapter.mediaplayer.MediaPlayer;
import jdp.adapter.mediaplayer.VideoPlayer;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("avi") ){
			advancedMusicPlayer = new VideoPlayer();			

		}else if (audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new MP4Player();
		}	
	}

	@Override
	public void playAudio(File file) {
		int pos = file.getName().lastIndexOf(".");
		String extension=null;
		if (pos >0) {
			extension = file.getName().substring(pos+1);
		}
		if(extension.equalsIgnoreCase("avi")){
			advancedMusicPlayer.playVideo(file);
		}
		else if(extension.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMP4(file);
		}
	}

}
