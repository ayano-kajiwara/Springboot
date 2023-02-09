package com.example.demo.entity;

import java.time.LocalDateTime;

/**
 * ユーザEntityクラス
 */
public class User {

	private int id; // id
	private String name; // 氏名
	private String email; // メールアドレス
	private LocalDateTime createdAt; // 登録日時
	private LocalDateTime updatedAt; // 更新日時

	/**
	 * デフォルトコンストラクタ
	 */
	public User() {
	}

	/**
	 * コンストラクタ
	 * @param id id
	 * @param name 氏名
	 * @param email メールアドレス
	 * @param createdAt 登録日時
	 * @param updatedAt 更新日時
	 */
	public User(int id, String name, String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/**
	 * id取得
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * id設定
	 * @param id id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 氏名取得
	 * @return 氏名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 氏名設定
	 * @param title 氏名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * メールアドレス取得
	 * @return メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * メールアドレス設定
	 * @param content メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 登録日時取得
	 * @return 登録日時
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	/**
	 * 登録日時設定
	 * @param createdAt 登録日時
	 */
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 更新日時取得
	 * @return 更新日時
	 */
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 更新日時設定
	 * @param updatedAt 更新日時
	 */
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
