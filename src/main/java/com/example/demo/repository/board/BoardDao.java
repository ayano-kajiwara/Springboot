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
}