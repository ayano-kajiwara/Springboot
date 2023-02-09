package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

/**
 * ユーザ情報dao実装クラス
 */
@Repository
public class UserDaoImpl implements UserDao {

	// JdbcTemplate
	private final JdbcTemplate jdbcTemplate;

	/**
	 * コンストラクタ
	 * @param jdbcTemplate JdbcTemplate
	 */
	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> findAll() {
		// SQL定義
		String sql = "SELECT id, name, email FROM users ORDER BY id";
		// SQL実行結果を取得
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

		// 詰め替え用のList定義
		List<User> list = new ArrayList<User>();
		// SQL実行結果をListへ詰め替え
		for (Map<String, Object> result : resultList) {
			User user = new User();
			user.setId((int) result.get("id")); // id
			user.setName((String) result.get("name")); // 氏名
			user.setEmail((String) result.get("email")); // メールアドレス
			list.add(user);
		}
		return list;
	}
}