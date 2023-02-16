package com.example.demo.controller.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.board.Board;
import com.example.demo.service.board.BoardService;

/**
 * Boardコントローラクラス
 */
@Controller
@RequestMapping("/board")
public class BoardController {
    // Boardサービス
    private final BoardService boardService;

    /**
     * コンストラクタ
     * 
     * @param boardService つぶやきサービス
     */
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    /**
     * タイムライン画面表示
     * 
     * @param model モデル
     * @return タイムライン画面
     */
    @GetMapping("/index")
    public String index(Model model) {
        // つぶやき情報リスト取得
        List<Board> boardList = boardService.getAll();

        // ページタイトル設定
        model.addAttribute("title", "タイムライン");
        // つぶやき情報リスト設定
        model.addAttribute("boardList", boardList);

        // タイムライン画面呼び出し
        return "board/index";
    }
}
