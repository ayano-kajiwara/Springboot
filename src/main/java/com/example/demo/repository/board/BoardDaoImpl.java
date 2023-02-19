package com.example.demo.repository.board;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.board.Board;

/**
 * BoardDao実装クラス
 */
@Repository
public class BoardDaoImpl implements BoardDao {

	// JdbcTemplate
	private final JdbcTemplate jdbcTemplate;

	/**
	 * コンストラクタ
	 * @param jdbcTemplate JdbcTemplate
	 */
	@Autowired
	public BoardDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Board> findAll() {
		// SQL定義
		String sql = "SELECT id, title, content, updated_at FROM boards ORDER BY updated_at DESC";
		// SQL実行結果を取得
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

		// 詰め替え用のList定義
		List<Board> list = new ArrayList<Board>();
		// SQL実行結果をListへ詰め替え
		for (Map<String, Object> result : resultList) {
			Board board = new Board();
			board.setId((int) result.get("id")); // id
			board.setTitle((String) result.get("title")); // タイトル
			board.setContent((String) result.get("content")); // つぶやき
			board.setUpdatedAt(((Timestamp) result.get("updated_at")).toLocalDateTime()); // 更新日時
			list.add(board);
		}
		return list;
	}

	@Override
	public Board findById(int id) {
		// SQL定義
		String sql = "SELECT id, title, content, updated_at FROM boards WHERE id = ?";
		// SQL実行結果を取得
		Map<String, Object> result = jdbcTemplate.queryForMap(sql, id);

		// SQL実行結果をBoardへ詰め替え
		Board board = new Board();
		board.setId((int) result.get("id")); // id
		board.setTitle((String) result.get("title")); // タイトル
		board.setContent((String) result.get("content")); // つぶやき
		board.setUpdatedAt(((Timestamp) result.get("updated_at")).toLocalDateTime()); // 更新日時

		return board;
	};
}
