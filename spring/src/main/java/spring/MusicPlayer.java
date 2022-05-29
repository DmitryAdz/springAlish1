package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	private Music musicC;
	
	@Autowired
	public MusicPlayer(@Qualifier("musicClassical") Music music) {
		this.musicC = music;
	}

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public void playMusic() {
		System.out.println("play music: " + musicC.getSong());
	}
}
