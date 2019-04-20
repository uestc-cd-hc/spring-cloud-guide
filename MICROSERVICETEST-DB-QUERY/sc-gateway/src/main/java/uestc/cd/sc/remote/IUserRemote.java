package uestc.cd.sc.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uestc.cd.sc.dto.UserDTO;

@FeignClient(name= "business-server")
public interface IUserRemote {
	@RequestMapping("/user/name/{id}")
	public String getNameById(@RequestParam(value="id") int id);
	
	@RequestMapping("/user/info")
	public UserDTO getInfoByUserId(@RequestParam(value="userId") String userId);

	@RequestMapping("/user/list")
	public List<UserDTO> getAll();
}
