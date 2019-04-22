package uestc.cd.sc.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uestc.cd.sc.dto.UserDTO;
import uestc.cd.sc.remote.IUserRemote;
import uestc.cd.sc.rest.IUserRestService;

@RestController
@RequestMapping("/rest/v1/user")
public class UserRestServiceImpl implements IUserRestService{
	@Autowired
	private IUserRemote userRemote;
	
	@RequestMapping(value = "/name/{id}", method = RequestMethod.GET)
	public String getUserNameById(@PathVariable int id) {
		return userRemote.getNameById(id);
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public UserDTO getUserInfoByUserId(@RequestParam String userId) {
		return userRemote.getInfoByUserId(userId);
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<UserDTO> getUserList() {
		return userRemote.getAll();
	}
}
