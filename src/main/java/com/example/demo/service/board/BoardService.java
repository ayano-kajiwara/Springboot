package com.example.demo.service.board;

import java.util.List;

import com.example.demo.entity.board.Board;

/**
 * Boardサービスインターフェース
 */
public interface BoardService {
	/**
	 * つぶやき情報全件取得
	 * @return つぶやき情報リスト
	 */
	List<Board> getAll();

	/**
	 * つぶやき情報1件取得
	 * 
	 * @param id つぶやき情報id
	 * @return つぶやき情報
	 */
	Board getBoard(int id);
}
