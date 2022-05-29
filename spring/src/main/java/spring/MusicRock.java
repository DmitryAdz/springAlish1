package spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicRock implements Music {

	@Override
	public String getSong() {
		return "rock song";
	}
}
