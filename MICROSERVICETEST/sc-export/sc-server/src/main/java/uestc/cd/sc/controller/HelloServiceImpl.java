package uestc.cd.sc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uestc.cd.sc.IHelloService;

@RestController
public class HelloServiceImpl implements IHelloService{
	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "Hello, World";
	}
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String nickName) {
		return String.format("你好%s，这是来自UECTC CD的问候", nickName);
	}
}
