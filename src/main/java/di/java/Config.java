package di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration   //xml을 대체
public class Config {
	
	public Car car() {
		return new Car();
	}
	
	
	@Bean //bean class를 만들어줌....?
	@Qualifier("hankook")
	public Tire hankookTire() {
		
		return new HankookTire();
	}
	@Bean //bean class를 만들어줌....?
	public KumhoTire kumhoTire() {
		
		return new KumhoTire();
	}*/


@ComponentScan(basePackages = {"di.java"})
@Configuration   //xml을 대체
public class Config {
	
	public Car car() {
		return new Car();
	}
	
	
}
