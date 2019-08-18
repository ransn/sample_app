import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = appContext.getBean("userService", UserService.class);
		System.out.println(userService.findAll().get(0).getFirstName());
	}

}
