package com.example.demo.controller.board;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String index(Model model, @ModelAttribute("complete") String complete) {
        // つぶやき情報リスト取得
        List<Board> boardList = boardService.getAll();

        // ページタイトル設定
        model.addAttribute("title", "タイムライン");
        // つぶやき情報リスト設定
        model.addAttribute("boardList", boardList);

        // タイムライン画面呼び出し
        return "board/index";
    }

    @GetMapping("/show/{id}")
    public String show(@PathVariable int id, Model model) {
        // つぶやき情報取得
        Board board = boardService.getBoard(id);
        // つぶやき情報設定
        model.addAttribute("board", board);
        // つぶやき詳細画面呼び出し
        return "board/show";
    }

    @GetMapping("/create")
    public String create(BoardForm boardForm, Model model) {
        // ページタイトル設定
        model.addAttribute("title", "つぶやき登録");
        // つぶやき登録画面呼び出し
        return "board/create";
    }

    @PostMapping("/create/confirm")
    public String createConfirm(@Validated BoardForm boardForm, BindingResult result, Model model) {
        // バリデーションチェック
        if (result.hasErrors()) {
            // ページタイトル設定
            model.addAttribute("title", "つぶやき登録");
            // つぶやきフォーム設定
            model.addAttribute("boardForm", boardForm);
            // つぶやき登録画面呼び出し
            return "board/create";
        }

        // ページタイトル設定
        model.addAttribute("title", "つぶやき登録確認");
        // つぶやき登録登録呼び出し
        return "board/create_confirm";
    }

    @PostMapping("/create")
    public String createGoBack(BoardForm boardForm, Model model) {
        // ページタイトル設定
        model.addAttribute("title", "つぶやき登録");
        // つぶやきフォーム設定
        model.addAttribute("boardForm", boardForm);
        // つぶやき登録登録呼び出し
        return "board/create";
    }

    @PostMapping("/store")
    public String store(@Validated BoardForm boardForm, BindingResult result, Model model,
            RedirectAttributes redirectAttributes) {
        // バリデーションチェック
        if (result.hasErrors()) {
            // ページタイトル設定
            model.addAttribute("title", "つぶやき登録");
            // つぶやきフォーム設定
            model.addAttribute("boardForm", boardForm);
            // つぶやき登録画面呼び出し
            return "board/create";
        }

        // BoardFormをBoardエンティティに詰め替え
        // Boardインスタンス定義
        Board board = new Board();
        // 現在日時取得
        LocalDateTime nowTime = LocalDateTime.now();
        board.setTitle(boardForm.getTitle());
        board.setContent(boardForm.getContent());
        board.setCreatedAt(nowTime);
        board.setUpdatedAt(nowTime);
        // Boardエンティティ保存
        boardService.save(board);

        // フラッシュメッセージ設定
        redirectAttributes.addFlashAttribute("complete", "つぶやきの登録に成功しました");
        // タイムライン画面にリダイレクト
        return "redirect:/board/index";
    }
}
