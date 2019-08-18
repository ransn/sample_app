import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snr.service.UserService;

/**
 * 
 */

/**
 * @author I326319
 *
 */
public class Application {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		//UserService userService = new UserServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = appContext.getBean("userService", UserService.class);
		System.out.println(userService.findAll().get(0).getFirstName());
	}

}
