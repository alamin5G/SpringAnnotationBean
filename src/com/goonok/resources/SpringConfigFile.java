package com.goonok.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.goonok.beans") // 1 way
//@ComponentScan ({"com.goonok.beans"}) //2nd way
@ComponentScan(basePackages = {"com.goonok.beans"})
public class SpringConfigFile {

	
}
