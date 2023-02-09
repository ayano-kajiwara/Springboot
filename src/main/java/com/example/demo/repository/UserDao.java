package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.User;

/**
 * ユーザ情報daoインターフェース
 */
public interface UserDao {
	/**
	 * ユーザ情報全件取得
	 * @return ユーザ情報リスト
	 */
	List<User> findAll();
}
