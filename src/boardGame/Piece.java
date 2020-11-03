package boardGame;

public class Piece {
	protected Position position;
	private Board board;
	public Piece(Board board) {
		super();
		this.board = board;
		position = null;//A pe�a inicialmente nao estara no tabuleiro
	}
	
	protected Board getBoard() {
		return board;
	}
}
