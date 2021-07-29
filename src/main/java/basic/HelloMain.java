package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		//xml 파일을 읽는 순간, 객체가 자동적으로 한번에 만들어짐.
		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml"); //여기서 파일을 읽어오지 못하면 콘솔에서 에러남. - 둘다가능
//									= new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml"); //-파일경로
//									= new ClassPathXmlApplicationContext("beanContainer.xml"); //여기서 파일을 읽어오지 못하면 콘솔에서 에러남. -main/resource
		
		
		//명시적형변환
		Hello obj =(Hello)context.getBean("hello"); //id로 빈 가져옴
		//System.out.println(obj);
		obj.prtMsg();
		
		//class 지정
		Hello obj2 = context.getBean("hello2", Hello.class);
		obj2.prtMsg();
		
		/*
		 * Hello obj = new Hello(); obj.prtMsg();
		 */
		
		
		
		
	}

}
