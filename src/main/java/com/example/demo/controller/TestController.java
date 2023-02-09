package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * テストコントローラクラス
 */
@Controller
public class TestController {
	// ユーザサービス
	private UserService userService;

	/**
	 * コンストラクタ
	 * @param userService ユーザサービス
	 */
	public TestController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * ユーザ情報取得
	 * @param model モデル
	 * @return テスト画面
	 */
	@GetMapping("/test")
	public String test(Model model) {

		// SQL実行結果を取得
		List<User> resultList = userService.getAll();

		// ページタイトル設定
		model.addAttribute("title", "ユーザ一覧");
		// ユーザ情報設定
		model.addAttribute("resultList", resultList);

		// テスト画面呼び出し
		return "test";
	}
}