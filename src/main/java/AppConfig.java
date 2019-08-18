import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 
 */

/**
 * @author I326319
 *
 */
@Configuration
@ComponentScan({"com.snr"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
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
