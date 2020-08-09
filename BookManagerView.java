package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.BookManagerDAO;
import dao.BookManagerDAOImpl;
import model.BookVO;

public class BookManagerView {
	static Scanner scan = new Scanner(System.in);
	static BookManagerDAO dao = new BookManagerDAOImpl();

	// å ���ý� �ʱ�ȭ��
	public static int printBestBookList() {
		// ��õ ���� ��� ���
//		ArrayList<BookVO> b_Recbooks = new ArrayList<BookVO>(bdao.b_selectRecBooks());		
//		System.out.println("======��õ ���� ���=====");
//		System.out.println(b_Recbooks + "\n");
		System.out.print("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.print("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println();
		System.out.println("[1] ��õ���� ����" + "\t" + "[2] �������� �˻�" + "\t" + "[3] ��ü ��� ����" + "\t" + "[4] �ڷ� ����");
		System.out.print("�Է� :  ");
		int num = scan.nextInt();
		return num;
	}
	
	

	// å ��ȣ ����
	public static int printSelectBook() {
		// [1] �뿩�� å �����ؼ� ���� ��� â - ������ ���� ���		
		int num = scan.nextInt();
		return num;
	}
	// ������ å 1�� ��� �� ����
	public static int printSelectedBook() {  		
		ArrayList<BookVO> book = new ArrayList<BookVO>(dao.b_selectedBook());
		System.out.print("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.print("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println();
		System.out.println(book); // å 1�� ��� 
		System.out.println();
		System.out.println("[1] ���� ��û" + "\t" + "[2] �ٸ� å ����");
		int num = scan.nextInt();
		return num;
	}
	
	public static int printBookList() {
		// ��ü ���� ��� ���
		ArrayList<BookVO> book = new ArrayList<BookVO>(dao.b_selectAllBooks());
		for (BookVO vo : book) {
			System.out.println(vo);
		}
		System.out.println();
		System.out.println("[1] �뿩�� å ����" + "\t" + "[2] ��õ ���� ��� ����");
		int num = scan.nextInt();
		return num;
	}	
	
	// ���� �Ϸ� 
//	public static int printRentReq() {		
//		System.out.println();
//		System.out.println("\t" + "���� ������ �Ϸ�Ǿ����ϴ�.");
//		System.out.println();
//		System.out.println("[1] å �� ����" + "\t" + "[2] ���ư���");
//		int menuRentselec = scan.nextInt();
//		return menuRentselec;
//	}
	

	public static String printSearchTitle() { // �������� �˻�
		System.out.print("�˻��� ���� �Է�:  ");
		String book = scan.next();		
		return book;
	}
//	public static int resultSearch() {
//		System.out.println("[1] ���� ��û" + "\t" + "[2] �ٸ� å ����");
//		int num = scan.nextInt();
//		return num;
//	}
	

	
}
