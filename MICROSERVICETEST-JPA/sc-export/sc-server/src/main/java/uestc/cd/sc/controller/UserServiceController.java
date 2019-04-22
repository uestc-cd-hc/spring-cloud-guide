package uestc.cd.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uestc.cd.sc.IUserService;
import uestc.cd.sc.bean.User;
import uestc.cd.sc.repository.UserRepository;

@RestController
public class UserServiceController implements IUserService{
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/user/name/{id}")
	public String getNameById(@PathVariable int id) {
		User user = userRepository.findById(id);
		if (user != null) {
			return user.getUserName();
		}
		return "";
	}
	
	@RequestMapping("/user/info")
	public User getInfoByUserId(@RequestParam String userId) {
		return userRepository.findByUserId(userId);
	}

	@RequestMapping("/user/list")
	public List<User> getAll() {
		return userRepository.findAll();
	}
}
