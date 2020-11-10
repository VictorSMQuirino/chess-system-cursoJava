package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// Posi��es acima
		p.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es abaixo
		p.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es � esquerda
		p.setValues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es � direita
		p.setValues(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es a noroeste
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es a nordeste
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es a sudoeste
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Posi��es a sudeste
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExistis(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

}
