package uestc.cd.sc;

import org.springframework.web.bind.annotation.RequestParam;

public interface IHelloService {
	public String helloWorld();
	public String hello(@RequestParam String nickName);
}
