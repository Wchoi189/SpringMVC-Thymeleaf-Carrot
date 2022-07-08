package com.carrot.springmvc.app.board.model;

import java.util.Date;


public class BoardDTO {
    private int board_id;
    private String title;
    private String file_name;
    private String save_path;
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
    private Date reg_date;

//    public BoardDTO(String title, String file_name, String save_path, Date reg_date) {
//        this.title = title;
//        this.file_name = file_name;
//        this.save_path = save_path;
//        this.reg_date = reg_date;
//    }

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getSave_path() {
        return save_path;
    }

    public void setSave_path(String save_path) {
        this.save_path = save_path;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "board_id='" + board_id + '\'' +
                ", title='" + title + '\'' +
                ", file_name='" + file_name + '\'' +
                ", save_path='" + save_path + '\'' +
                ", reg_date=" + reg_date +
                '}';
    }
}
