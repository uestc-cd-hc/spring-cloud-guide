package uestc.cd.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BusinessServer 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(BusinessServer.class, args);
    	System.out.println("SC business server started");
    }
}
