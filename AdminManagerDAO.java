package dao;
import java.util.List;

import model.BookVO;
import model.MemberVO;
import model.AdminVO;

public interface AdminManagerDAO { //������ �������̽�
	public void insertNewBook(BookVO book); //å������ �ִ� ���
	public void updateNewBook(BookVO book); //å���� ���� ���
	public void deleteNewBook(BookVO book); //å �������
	public BookVO searchbookByNum(int num); //å �����Է½� �����ִ� ���
	public BookVO searchbookByName(String name);
	public List<BookVO>selectAllBook(); //å ��� �����ִ� ���
	//public void launchAdminMenu();
	
	public void a_createMember(AdminVO admin); //������ ��������
	public int inputAdminLoginInfo(AdminVO admin); //������ �α���
	
	public List<MemberVO>selectAllMember(); //ȸ��������ȸ
	
	public List<BookVO> selectAllMemberBook(int memNum);
	
}

//
//��ȣ /    ����      / �۰�   / ī�װ� / ���ǻ�    / ������Ȳ    / �ݳ����� 
//3 / ��� ���� / ���� /  ������ / �����ǻ� /  ������ / 2020.08.13
//87 / ������ ���� / ������ / �ָ�� /�����ǻ� / ������ / 2020.08.13

//å�� �ݳ� �Ǿ����ϴ�. 
//[1] ���� �Է�  [2] ���ư���