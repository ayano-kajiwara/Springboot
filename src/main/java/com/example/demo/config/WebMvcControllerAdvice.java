package com.example.demo.config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * コントローラ共通事前処理クラス
 */
@ControllerAdvice
public class WebMvcControllerAdvice {

	/**
	 * 空文字をnullへ変換する
	 * @param dataBinder データバインド
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

}
