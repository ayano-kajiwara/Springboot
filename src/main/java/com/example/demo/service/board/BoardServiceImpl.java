package com.example.demo.service.board;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.board.Board;
import com.example.demo.repository.board.BoardDao;

/**
 * Boardサービス実装クラス
 */
@Service
public class BoardServiceImpl implements BoardService {
    // BoardDao
    private final BoardDao dao;

    /**
     * コンストラクタ
     * 
     * @param dao つぶやき情報
     */
    public BoardServiceImpl(BoardDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Board> getAll() {
        return dao.findAll();
    };

    @Override
    public Board getBoard(int id) {
        return dao.findById(id);
    };

    @Override
    public void save(Board board) {
        dao.insert(board);
    }

    @Override
    public void update(Board board) {
        dao.update(board);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
