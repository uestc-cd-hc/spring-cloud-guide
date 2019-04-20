package uestc.cd.sc.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uestc.cd.sc.remote.IHelloRemote;
import uestc.cd.sc.rest.IHelloRestService;

@RestController
public class HelloRestServiceImpl implements IHelloRestService{
	@Autowired
    IHelloRemote helloRemote;
	
	@RequestMapping("/helloworld")
	public String helloworld() {
		return helloRemote.helloWorld();
	}
	
	@RequestMapping("/hello/{nickName}")
	public String hello(@PathVariable("nickName") String nickName) {
		return helloRemote.hello(nickName);
	}
}
