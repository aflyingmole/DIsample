package test.di03;

import org.springframework.stereotype.Controller;

@Controller(value = "controller") // 빈으로 등록되는 이름 지정
public class BoardController {
    private Board board;


    public BoardController(Board board) {
        this.board = board;
    }

    public void service(){
        board.insert("일유현");
        board.update("이유현");
        board.delete("삼유현");
        board.select("사유현");
    }
}
