package uestc.cd.sc.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import uestc.cd.sc.dto.UserDTO;

public interface IUserRestService {
	public String getUserNameById(@PathVariable int id);
	public UserDTO getUserInfoByUserId(@RequestParam String userId);
	public List<UserDTO> getUserList();
}
