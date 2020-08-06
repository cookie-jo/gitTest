package admin.view;
import java.util.List;
import java.util.Scanner;

import admin.model.BookVO;

public class AdminManagerView {
	  static Scanner scan = new Scanner(System.in);
	   
	  public static int adminScreen() {
	    int menu;
	    //������ ����ȭ��
	    System.out.print("[1] ���� ���� [2] ȸ�� ���� [3] �α׾ƿ�"); //�ȳ�
	    System.out.print("��ȣ�Է� : ");
	    menu = scan.nextInt();
	    //�޴� �Է¹ޱ�
	    return menu;
	  }
	  
	  //������ �޴� - ��������
	  public static int adminBook() {
		  int menu;
		    System.out.println("[1]��ü������Ȳ [2]���� ���� �߰� [3]���� �������� [4] ���� ����"); //�ȳ�
		    System.out.print("��ȣ�Է� : ");
		    menu = scan.nextInt();
		  return menu;
	  }	  
	  
	  public static BookVO inputBookInfo() {
		    BookVO book = new BookVO();
		    //��ĳ�ʷ� å ���� �Է¹޾�
		    //å��ü�� �����ϴ� �ڵ�
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
	  

	  
	  //������ �޴� - ȸ������
	  public static char adminMember() {
		  char menu;
		    System.out.println("[1]��ü������Ȳ [2]���� ���� �߰� [3]���� �������� [4] ���� ����"); //�ȳ�
		    System.out.print("��ȣ�Է� : ");
		    menu = scan.nextLine().charAt(0);
		  return menu;
	  }
	  
	  
	  //å ������ ����ϴ� �޼���
	  public static void printBookInfo(BookVO book) {
		  System.out.println(book);
	  }
	  
	 
}
