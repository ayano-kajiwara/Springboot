package com.example.demo.controller.board;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * つぶやきフォームクラス
 * 
 * @author hayakawa
 */
public class BoardForm {

	@NotNull(message = "タイトルの入力は必須です")
	@Size(min = 1, max = 20, message = "タイトルは20文字以内で入力してください")
	private String title; // タイトル

	@NotNull(message = "つぶやきの入力は必須です")
	@Size(min = 1, max = 140, message = "つぶやきは140文字以内で入力してください")
	private String content; // つぶやき

	/**
	 * デフォルトコンストラクタ
	 */
	public BoardForm() {
	}

	/**
	 * コンストラクタ
	 * 
	 * @param title   タイトル
	 * @param content つぶやき
	 */
	public BoardForm(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	/**
	 * タイトル取得
	 * 
	 * @return タイトル
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * タイトル設定
	 * 
	 * @param title タイトル
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * つぶやき取得
	 * 
	 * @return つぶやき
	 */
	public String getContent() {
		return content;
	}

	/**
	 * つぶやき設定
	 * 
	 * @param content つぶやき
	 */
	public void setContent(String content) {
		this.content = content;
	}
}