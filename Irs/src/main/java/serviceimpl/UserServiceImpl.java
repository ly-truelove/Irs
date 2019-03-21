package serviceimpl;

import pojo.User;
import service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper UserService;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return UserService.login(user);
	}

}
