import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 */

/**
 * @author I326319
 *
 */
@Configuration
@ComponentScan({"com.snr"})
public class AppConfig {
	
	//@Bean(name= "userService"  )
	//public UserService getUserService() {
		//UserServiceImpl service = new UserServiceImpl(getUserRepository());
		//service.setUserRepository(getUserRepository());
	//	return new UserServiceImpl();
	//}
	  
	//@Bean(name="userRepository")
	//public UserRepository getUserRepository() {
	//	return new UserRepositoryImpl();
	//}

}
