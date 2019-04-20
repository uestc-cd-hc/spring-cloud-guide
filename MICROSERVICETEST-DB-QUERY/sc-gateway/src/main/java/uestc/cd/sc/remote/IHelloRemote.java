package uestc.cd.sc.remote;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "business-server")
public interface IHelloRemote {
	@RequestMapping("/helloworld")
	public String helloWorld();
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="nickName", required = true) String nickName);
}
