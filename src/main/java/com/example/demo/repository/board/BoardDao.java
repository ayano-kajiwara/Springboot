package com.example.demo.repository.board;

import java.util.List;

import com.example.demo.entity.board.Board;

/**
 * BoardDaoインターフェース
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
	 * @param board つぶやき情報
	 */
	void insert(Board board);

	/**
	 * つぶやき情報更新
	 * 
	 * @param board つぶやき情報
	 */
	void update(Board board);

	/**
	 * つぶやき情報削除
	 * 
	 * @param id つぶやきID
	 */
	void deleteById(int id);
}