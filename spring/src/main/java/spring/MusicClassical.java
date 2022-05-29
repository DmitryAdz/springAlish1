package spring;

import org.springframework.stereotype.Component;

@Component
public class MusicClassical  implements Music {

	@Override
	public String getSong() {
		return "classical song";
	}
}
