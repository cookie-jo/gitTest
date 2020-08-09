package dao;

import java.util.ArrayList;

import model.BookVO;

public interface BookManagerDAO {
	public ArrayList<BookVO> b_selectRecBooks(); // ��õ ���� ���
	public ArrayList<BookVO> b_selectedBook();	// 1�� ���
	//public void launchBookSelect();
	public ArrayList<BookVO> b_selectAllBooks(); // ��ü å ��� ���
	public ArrayList<BookVO> b_selectTitle(String title);	// �������� �˻�
	public void b_updateReview(int b_score, String b_review, int b_num); //�� ��ü�� ��ĳ���ؼ� �޾ƿ;� ��.  // ������ ������Ʈ

}
