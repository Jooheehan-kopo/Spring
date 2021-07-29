package di.anno03;

import org.springframework.stereotype.Component;

//상속받지않음. auto는 type맻칭이 먼저
//@Component("tire")
public class NexenTire {
	public String getBrand() {
		return "넥센타이어";
	}
}
