package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public final class OccupiedTile extends Tile{

	private final Piece pieceOnTile;
	protected OccupiedTile(final int tileCoordinate, final Piece pieceOnTile){
		super(tileCoordinate);
		this.pieceOnTile = pieceOnTile;
		
	}
	@Override
	public boolean isTileOccupied() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public Piece getPiece() {
		// TODO Auto-generated method stub
		return pieceOnTile;
	}
}
