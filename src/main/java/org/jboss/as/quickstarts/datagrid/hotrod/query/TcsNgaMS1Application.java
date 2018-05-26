package org.jboss.as.quickstarts.datagrid.hotrod.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Import({AddressBookManager.class})
@SpringBootApplication
//@EnableEurekaClient
public class TcsNgaMS1Application {

	public static void main(String[] args) {
		SpringApplication.run(TcsNgaMS1Application.class, args);
	}
	
}
