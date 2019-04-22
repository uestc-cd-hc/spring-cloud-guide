package uestc.cd.sc.rest;

import org.springframework.web.bind.annotation.PathVariable;

public interface IHelloRestService {
	public String helloworld();
	
	public String hello(@PathVariable("nickName") String nickName);
}
