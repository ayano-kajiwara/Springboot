package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserDao;

/**
 * ユーザサービス実装クラス
 * @author hayakawa
 */
@Service
public class UserServiceImpl implements UserService {

	// つぶやき情報dao
	private final UserDao dao;

	/**
	 * コンストラクタ
	 * @param dao ユーザ情報
	 */
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public List<User> getAll() {
		return dao.findAll();
	}
}