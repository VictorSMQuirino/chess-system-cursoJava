package boardGame;

public abstract class Piece {
	protected Position position;
	private Board board;
	public Piece(Board board) {
		super();
		this.board = board;
		position = null;//A peça inicialmente nao estara no tabuleiro
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean [][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		
		return false;
	}
}
