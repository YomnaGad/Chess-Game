package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public final class EmptyTile extends Tile {
	
	
	protected EmptyTile(final int tileCoordinate){
		super(tileCoordinate);
	}

	@Override
	public boolean isTileOccupied() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Piece getPiece() {
		// TODO Auto-generated method stub
		return null;
	}
}
