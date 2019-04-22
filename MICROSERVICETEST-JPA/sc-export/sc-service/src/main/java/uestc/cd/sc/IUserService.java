package uestc.cd.sc;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import uestc.cd.sc.bean.User;

public interface IUserService {
	//根据用户的系统id查询用户名
	public String getNameById(@PathVariable int id);
	//根据用户id查询用户信息
	public User getInfoByUserId(@RequestParam String userId);
	//查询所有用户信息
	public List<User> getAll();
}
