
package cat.itacademy.barcelonaactiva.cordero.claudio.s04.t01.n01.S04T01N01CorderoClaudio.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonaactiva.cordero.claudio.s04.t01.n01.S04T01N01CorderoClaudio.apis.HelloWorldApi;


@RestController
public class HelloWorldController implements HelloWorldApi{

	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping("/HelloWorld")
	public String greet(@RequestParam @DefaultValue("UNKNOWN")String name) {
		
		logger.info("HelloWordControler :: greet :: Return a greeting @RequestParam.");
		
		return "Hello " + name + ". You are running a Maven project.";
	}
	
	@GetMapping("/HelloWorld/{name}")
	public String greet2(@PathVariable String name) {
		
		logger.info("HelloWordControler :: greet2 :: Return a greeting @PathVariable.");
		
		return "Hello " + name + ". You are running a Maven project.";
	}
}
