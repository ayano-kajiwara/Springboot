package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

/**
 * ユーザサービスインターフェース
 */
public interface UserService {
	/**
	 * ユーザ情報全件取得
	 * @return ユーザ情報リスト
	 */
	List<User> getAll();
}
