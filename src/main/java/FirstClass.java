import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class FirstClass {

	@RequestMapping("/")
	String home() {
		return "Hello World! From My First Spring Boot App";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FirstClass.class, args);
	}

}