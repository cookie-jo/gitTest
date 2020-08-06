package admin.dao;
import java.util.List;
import admin.model.BookVO;

public interface AdminManagerDAO { //������ �������̽�
	public void insertNewBook(BookVO book); //å������ �ִ� ���
	public void updateNewBook(BookVO book); //å���� ���� ���
	public void deleteNewBook(BookVO book); //å �������
	public List<BookVO>selectAllBook(); //å ��� �����ִ� ���
	
	
}
