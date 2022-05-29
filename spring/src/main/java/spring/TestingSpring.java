package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		musicPlayer.playMusic();
		System.out.println("name: " + musicPlayer.getName());
		System.out.println("volume: " + musicPlayer.getVolume());
		
		MusicClassical musicC1 = context.getBean("musicClassical", MusicClassical.class);
		MusicClassical musicC2 = context.getBean("musicClassical", MusicClassical.class);
		System.out.println("musicC1 hash: " + musicC1);
		System.out.println("musicC2 hash: " + musicC2);
		System.out.println("musicC1 == musicC2: " + (musicC1 == musicC2));
		
		
		MusicRock musicR1 = context.getBean("musicRock", MusicRock.class);
		MusicRock musicR2 = context.getBean("musicRock", MusicRock.class);
		System.out.println("musicR1 hash: " + musicR1);
		System.out.println("musicR2 hash: " + musicR2);
		System.out.println("musicR1 == musicR2: " + (musicR1 == musicR2 ));
		
		context.close();
	}

}
