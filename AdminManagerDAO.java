package admin.dao;
import java.util.List;

import admin.model.AdminVO;
import admin.model.BookVO;
import admin.model.MemberVO;

public interface AdminManagerDAO { //������ �������̽�
	public void insertNewBook(BookVO book); //å������ �ִ� ���
	public void updateNewBook(BookVO book); //å���� ���� ���
	public void deleteNewBook(BookVO book); //å �������
	public BookVO searchbookByNum(int num); //å �����Է½� �����ִ� ���
	public List<BookVO>selectAllBook(); //å ��� �����ִ� ���
	
	public void a_createMember(AdminVO admin); //������ ��������
	public int inputAdminLoginInfo(AdminVO admin); //������ �α���
	
	
}
