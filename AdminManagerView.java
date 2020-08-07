package admin.view;
import java.util.List;
import java.util.Scanner;

import admin.model.AdminVO;
import admin.model.BookVO;
public class AdminManagerView {
	  static Scanner scan = new Scanner(System.in);
	   
	  
	  public static int adminScreen() {
	    int menu;
	    //������ ����ȭ��
	    System.out.println("[1]���� ���� [2]ȸ�� ���� [3]�α׾ƿ�");
	    System.out.print("��ȣ�Է� : ");
	    menu = scan.nextInt();
	    return menu;
	  }
	  
	  //������ �޴� - [1]��������
	  public static int adminBook() {
		  int menu;
		    System.out.println("[1]��ü������Ȳ [2]���� ���� �߰� [3]���� �������� [4]���� ���� [5]���� [6]�ڷΰ���");
		    System.out.print("��ȣ�Է� : ");
		    menu = scan.nextInt();
		  return menu;
	  }	  
	  
	  //[1]��ü������Ȳ
	  public static void printBookInfo(BookVO book) {
		  System.out.println(book);
	  }	  
	  
	  public static void printBookList(List<BookVO> list) {
		    for(BookVO vo : list) {
		      System.out.println(vo);
		    }
		  }
	  
	  //[2]���� ���� �߰�
	  public static BookVO inputBookInfo() {
		    BookVO book = new BookVO();
		    System.out.print("å��ȣ : ");
		    book.setB_num(scan.nextInt());
		    System.out.print("å ���� : ");
		    book.setB_title(scan.next());
		    System.out.print("�۰� : ");
		    book.setB_writer(scan.next());
		    System.out.print("å ī�װ� : ");
		    book.setB_category(scan.next());
		    System.out.print("���ǻ� : ");
		    book.setB_company(scan.next());
		    System.out.print("���� : ");
		    book.setB_score(scan.nextInt());
		    System.out.print("�� �� �� : ");
		    book.setB_review(scan.next());
		    System.out.print("��� ��Ȳ : ");
		    book.setB_inventory(scan.next());
		    return book;
		  }

	  //[3]�������� ���� // ������ ��ȣ �Է� - �������� ����. 
	  	public static int inputsearchBookByNum() {
			System.out.println("=====������������=====");
			Scanner scan = new Scanner(System.in);
			System.out.print("��ȣ : ");
			int num = scan.nextInt();
			// ��ȣ�� �ش��ϴ� ��������(VO)�� ��������� �κ�
			
			return num;
	  	}
	  	
	  	//[3-1]�������� ���� -���Է� book���� ����
		public static BookVO updateBookInfo() {
		    BookVO book = new BookVO();
		    System.out.print("å��ȣ : ");
		    book.setB_num(scan.nextInt());
		    System.out.print("å ���� : ");
		    book.setB_title(scan.next());
		    System.out.print("�۰� : ");
		    book.setB_writer(scan.next());
		    System.out.print("å ī�װ� : ");
		    book.setB_category(scan.next());
		    System.out.print("���ǻ� : ");
		    book.setB_company(scan.next());
		    System.out.print("���� : ");
		    book.setB_score(scan.nextInt());
		    System.out.print("�� �� �� : ");
		    book.setB_review(scan.next());
		    System.out.print("��� ��Ȳ : ");
		    book.setB_inventory(scan.next());
		    return book;
		}
	  
	  	//[4]�������� ����
		public static BookVO deleteBookInfo() {
			BookVO book = new BookVO();
			System.out.println("������ ������ȣ �Է�");
			book.setB_num(scan.nextInt());
		return book;
		}
		
		
	  //������ �޴� - [2]ȸ������
	  public static int adminMember() {
		  int menu;
		    System.out.println("[1]ȸ�� ���� ��ȸ [2]���� "); //�ȳ�
		    System.out.print("��ȣ�Է� : ");
		    menu = scan.nextInt();
		  return menu;
	  }
	  
	  
	  //�����ڸ޴� - [3]����
	  public static void adminExit() {
		  int menu;
		  System.out.println("�α׾ƿ��Ǿ����ϴ�.");
		  System.exit(0);
	  }
	    
	  //������ ����, �α��� ���.
	  
	  //������ ȸ������ - 
	  public static AdminVO adminMemberinfo() {
		    AdminVO admin = new AdminVO(); //������ ��ü����
		    System.out.print("���̵� �Է� : ");
		    admin.setA_id(scan.next());
		    System.out.print("��й�ȣ �Է�: ");
		    admin.setA_password(scan.next());
		    System.out.print("�̸� �Է� : ");
		    admin.setA_name(scan.next());
		    System.out.print("�̸��� �Է� : ");
		    admin.setA_email(scan.next());
		    return admin;
		}	  
		  
		  
	  //������ �α��� ��
	  public static AdminVO adminLogin() {
		  AdminVO vo = new AdminVO();
		  System.out.println("id >> ");
		  vo.setA_id(scan.next());
		  System.out.println("Password >> ");
		  vo.setA_password(scan.next());
		return vo;
	  }


}
