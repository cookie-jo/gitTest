package main;

import controller.BookManager;
import dao.BookManagerDAO;
import dao.BookManagerDAOImpl;

public class BookMain {

	public static void main(String[] args) {
	BookManagerDAO dao = new BookManagerDAOImpl();
//	ArrayList<BookVO> b_all = dao.b_selectAllBooks(); //��ü ���� ��� â
//	BookManagerView.printBookList(b_all);
//	
//	ArrayList<BookVO> b_RecBooks = dao.b_selectRecBooks();  //��õ���� ���� â
//	BookManagerView.printBestBookList(b_RecBooks);
//	
//	ArrayList<BookVO> b_Book = dao.b_selectBook(); // å�� ���� ���â
//	BookManagerView.printSelectedBook(b_Book);
//	
//	ArrayList<BookVO> b_selTitle = dao.b_selectTitle(); //�������� �˻� ���â
//	System.out.println(b_selTitle);
//	dao.b_updateReview();
	
//	BookManagerView.printRentReq();
//	BookManagerView.printInsertTitle();
	BookManager manager = new BookManager(dao);
	manager.launchBookSelect();
	
	

	
	
	}
	
	
}
