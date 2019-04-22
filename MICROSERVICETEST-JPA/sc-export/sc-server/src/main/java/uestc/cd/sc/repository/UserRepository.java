package uestc.cd.sc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import uestc.cd.sc.bean.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findById(int id);
	public User findByUserId(String userId);
	public List<User> findAll();
}
