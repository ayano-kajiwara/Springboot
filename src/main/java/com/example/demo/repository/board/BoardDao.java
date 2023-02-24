package com.example.demo.repository.board;

import java.util.List;

import com.example.demo.entity.board.Board;

/**
 * BoardDaoインターフェース
 * 
 */
public interface BoardDao {
	/**
	 * つぶやき情報全件取得
	 * 
	 * @return つぶやき情報リスト
	 */
	List<Board> findAll();

	/**
	 * つぶやき情報1件取得
	 * 
	 * @param id つぶやき情報id
	 * @return つぶやき情報
	 */
	Board findById(int id);

	/**
	 * つぶやき情報登録
	 * 
	 * @param board お問い合わせ情報
	 */
	void insert(Board board);
}