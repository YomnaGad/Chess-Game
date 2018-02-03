package com.chess.engine.board;

import java.util.HashMap;
import java.util.Map;

import com.chess.engine.pieces.Piece;
import com.google.common.collect.ImmutableMap;

public abstract class Tile {

	protected final int tileCoordinate;
	private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();
	protected Tile(int tileCoordinate){
		this.tileCoordinate = tileCoordinate;
	}
	
	private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
		// TODO Auto-generated method stub
		final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
		for(int i = 0; i< 64 ; i++){
			emptyTileMap.put(i, new EmptyTile(i));
		}
		return ImmutableMap.copyOf(emptyTileMap); 
	}
	// factory method design patterns
	public static Tile createTile(final int tileCoordinate, final Piece piece){
		return piece!=null ? new OccupiedTile(tileCoordinate, piece): EMPTY_TILES_CACHE.get(tileCoordinate);
	}
	public abstract boolean isTileOccupied();
	
	public abstract Piece getPiece();
	
	
}
