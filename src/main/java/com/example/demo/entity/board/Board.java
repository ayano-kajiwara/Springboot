package com.example.demo.entity.board;

import java.time.LocalDateTime;

/**
 * Boardエンティティクラス
 */
public class Board {

    private int id; // id
    private String title; // タイトル
    private String content; // つぶやき
    private LocalDateTime createdAt; // 登録日時
    private LocalDateTime updatedAt; // 更新日時

    /**
     * デフォルトコンストラクタ
     */
    public Board() {
    }

    /**
     * コンストラクタ
     * 
     * @param id        id
     * @param title     タイトル
     * @param content   つぶやき
     * @param createdAt 登録日時
     * @param updatedAt 更新日時
     */
    public Board(int id, String title, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * id取得
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * id設定
     * 
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * タイトル取得
     * 
     * @return タイトル
     */
    public String getTitle() {
        return title;
    }

    /**
     * タイトル設定
     * 
     * @param title タイトル
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * つぶやき取得
     * 
     * @return つぶやき
     */
    public String getContent() {
        return content;
    }

    /**
     * つぶやき設定
     * 
     * @param content つぶやき
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 登録日時取得
     * 
     * @return 登録日時
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * 登録日時設定
     * 
     * @param createdAt 登録日時
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新日時取得
     * 
     * @return 更新日時
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 更新日時設定
     * 
     * @param updatedAt 更新日時
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
