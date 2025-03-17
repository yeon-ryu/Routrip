package com.web.curation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.curation.dao.BoardDao;
import com.web.curation.model.board.Board;
import com.web.curation.model.board.Comment;
import com.web.curation.model.board.Img;
import com.web.curation.model.board.Marker;

@Service
public class BoardService implements IBoardService{

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public int addBoard(Board board) throws Exception {
		return boardDao.addBoard(board);
	}

	@Override
	public List<Board> getBoardList() throws Exception {
		return boardDao.getBoardList();
	}

	@Override
	public List<Board> findBoardListByUid(int uid) throws Exception {
		return boardDao.findBoardListByUid(uid);
	}

	@Override
	public List<Board> findBoardListByKeyword(String keyword) throws Exception {
		return boardDao.findBoardListByKeyword(keyword);
	}

	@Override
	public List<Board> findBoardListByWriteDate(String startdate, String enddate) throws Exception {
		return boardDao.findBoardListByWriteDate(startdate, enddate);
	}

	@Override
	public Board findBoardByBoardId(int boardid) throws Exception {
		return boardDao.findBoardByBoardId(boardid);
	}

	@Override
	public int deleteBoard(int boardid) throws Exception {
		return boardDao.deleteBoard(boardid);
	}

	@Override
	public int updateBoard(Board board) {
		return boardDao.updateBoard(board);
	}

	@Override
	public int addFavorite(int uid, int boardid) throws Exception {
		return boardDao.addFavorite(uid, boardid);
	}

	@Override
	public int getFavoriteNum(int boardid) throws Exception {
		return boardDao.getFavoriteNum(boardid);
	}

	@Override
	public List<Integer> getFavoriteByBoard(int boardid) throws Exception {
		return boardDao.getFavoriteByBoard(boardid);
	}

	@Override
	public List<Integer> getFavoriteByUser(int uid) throws Exception {
		return boardDao.getFavoriteByUser(uid);
	}

	@Override
	public int deleteFavorite(int uid, int boardid) throws Exception {
		return boardDao.deleteFavorite(uid, boardid);
	}

	@Override
	public int addImg(Img img) throws Exception {
		return boardDao.addImg(img);
	}

	@Override
	public List<Img> findBoardImg(int boardid) throws Exception {
		return boardDao.findBoardImg(boardid);
	}

	@Override
	public int deleteImg(int imgid) throws Exception {
		return boardDao.deleteImg(imgid);
	}

	@Override
	public int addComment(Comment comment) throws Exception {
		return boardDao.addComment(comment);
	}

	@Override
	public List<Comment> findComment(int boardid) throws Exception {
		return boardDao.findComment(boardid);
	}

	@Override
	public int deleteComment(int commentid) throws Exception {
		return boardDao.deleteComment(commentid);
	}

	@Override
	public int updateFavoriteNum(int boardid, int favoriteNum) throws Exception {
		return boardDao.updateFavoriteNum(boardid, favoriteNum);
	}

	@Override
	public int addMarker(Marker marker) throws Exception {
		return boardDao.addMarker(marker);
	}

	@Override
	public List<Marker> findMarker(int boardid) throws Exception {
		return boardDao.findMarker(boardid);
	}

	@Override
	public int updateMarker(Marker marker) throws Exception {
		return boardDao.updateMarker(marker);
	}

	@Override
	public int deleteMarker(int markerid) throws Exception {
		return boardDao.deleteMarker(markerid);
	}

	@Override
	public Comment findCommentByCommentid(int commentid) throws Exception {
		return boardDao.findCommentByCommentid(commentid);
	}

	@Override
	public List<Board> findBoardByFollow(int following) throws Exception {
		return boardDao.findBoardByFollow(following);
	}

	@Override
	public int addScrap(int uid, int boardid) throws Exception {
		return boardDao.addScrap(uid, boardid);
	}

	@Override
	public List<Integer> getScrap(int uid) throws Exception {
		return boardDao.getScrap(uid);
	}

	@Override
	public int deleteScrap(int uid, int boardid) throws Exception {
		return boardDao.deleteScrap(uid, boardid);
	}

	@Override
	public List<Comment> findCommentByUid(int uid) throws Exception {
		return boardDao.findCommentByUid(uid);
	}

	@Override
	public List<Comment> findCommentByListener(int listener) throws Exception {
		return boardDao.findCommentByListener(listener);
	}

	@Override
	public List<Board> getBoardList5(String writedate) throws Exception {
		return boardDao.getBoardList5(writedate);
	}

	@Override
	public List<Board> findBoardBest() throws Exception {
		return boardDao.findBoardBest();
	}

	@Override
	public int deleteImgByBoardid(int boardid) throws Exception {
		return boardDao.deleteImgByBoardid(boardid);
	}

	@Override
	public int deleteMarkerByBoardid(int boardid) throws Exception {
		return boardDao.deleteMarkerByBoardid(boardid);
	}

	@Override
	public List<Board> getBoardListByLastWrite(String writedate) throws Exception {
		return boardDao.getBoardListByLastWrite(writedate);
	}

	@Override
	public String getScrapDate(int uid, int boardid) throws Exception {
		return boardDao.getScrapDate(uid, boardid);
	}
}
