package com.breakthrough.workinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.breakthrough.workinfo.dao.UserDao;
import com.breakthrough.workinfo.domain.User;

public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public User update(User user, int id) {
		// TODO Auto-generated method stub
		return userDao.update(user, id);
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	@Override
	public User updatePartially(User user, int id) {
		// TODO Auto-generated method stub
		// todo call updatefields method to update user fieldS
		return userDao.findById(id);
	}
}
