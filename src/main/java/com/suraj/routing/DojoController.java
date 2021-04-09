package com.suraj.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DojoController {
//	Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
//	Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
//	Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the headquarters'.

	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo){
		String output = "";
		
		if(dojo.equals("burbank-dojo")) {
			output = "Burbank Dojo is located in Southern California";
		}
		else if (dojo.equals("san-jose")) {
			output = "SJ dojo is the headquarters";
		}
		else {
			output = dojo + " is awesome";
		}
    	return output;
    }

}
