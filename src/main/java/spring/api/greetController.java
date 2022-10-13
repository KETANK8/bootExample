package spring.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {

	// HANDALING REQUEST
	@RequestMapping(value="/welcome")
	public String greeting() {
		
		// DISPLAYING STRING WHEN REQUEST OCCUR
		return "Welcome User!!!";
	}
}
