package view;

import java.util.Scanner;

import model.MemberVO;

public class MemberManagerView {

	int m_num_cnt=1;
	static Scanner scan = new Scanner(System.in);

	public static int getMenu() { 
		int menu;
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("�ƢƢƢ�                                        ������ �������� ���Ű��� ȯ�� �մϴ�!                                               �ƢƢƢ�");
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		
	    System.out.println("	[1]�α���, [2]ȸ��/������ ����, [3]����");
	    System.out.print("	�Է� :  ");
	    menu = scan.nextInt();
	    return menu;
		}
	
	
	public static int mOrALogin() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("	[1]ȸ�� �α��� [2]������ �α���");
		System.out.print("	�Է� :  ");
		int  login = scan.nextInt();
		return login;
	}
	
	public static int mOrARegister() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("	[1]ȸ�� ���� [2]������ ����");
		System.out.print("	�Է� :  ");
		int  login = scan.nextInt();
		return login;
	
	}
	
	public static MemberVO inputMemberLoginInfo() {
		   // inputMemberInfo()�� �Լ�����
		      MemberVO member = new MemberVO();
		      // MemberVO �ڷ����·� member ��������
		      System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");

		       System.out.print("	ID : ");
		       member.setM_id(scan.next());
		       System.out.print("	Password : ");
		       member.setM_password(scan.next());
		       System.out.println();
		       return member;
		       // ���� ���� member�� ����ְڴ�
		     }
	
	public static MemberVO inputMemberInfo() {
		//int m_num_cnt=1;
		MemberVO member = new MemberVO();
		
		//member.setM_num(m_num_cnt);
		//m_num_cnt++;
		 System.out.print("	ID�� �Է��ϼ��� : ");
		    member.setM_id(scan.next());
		    System.out.print("	��й�ȣ�� �Է��ϼ��� : ");
		    member.setM_password(scan.next());
		    System.out.print("	�̸��� �Է��ϼ��� : ");
		    member.setM_name(scan.next());
		    System.out.print("	�̸����� �Է��ϼ��� : ");
		    member.setM_email(scan.next());
		    System.out.print("	�ּҸ� �Է��ϼ��� : ");
		    member.setM_addr(scan.next());
		    System.out.print("	��ȭ��ȣ�� �Է��ϼ��� : ");
		    member.setM_tel(scan.next());
		    System.out.print("	��������� �Է��ϼ��� : ");
		    member.setM_birthday(scan.next());
	    return member;
	    
	    
	  }
	
	public static int inputMemberGreet() {
		   // 000 ȸ���� ȯ���մϴ�.
		//[1] å �˻�  [2] ������Ȳ [3] �� ���� [4] �α׾ƿ� ���� 
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.println("	");
	    System.out.println("	[1] å �˻�  [2] ������Ȳ [3] �� ���� [4] �α׾ƿ� ���� ");
	    System.out.print("	�Է� :  ");
		    int next = scan.nextInt();
		    return next;
		     }
	
	//[3]������
	//[1] ��������[2]��������
	public static int inputMemberPage() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	[1] ��������	[2]�������� ");
	    System.out.print("	�Է� :  ");
		    int next = scan.nextInt();
		    return next;
		     }
	
	public static int updateMemberPage() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
		System.out.print("	[1]��й�ȣ �ٲٱ� [2]�̸��� �ٲٱ� [3]�ּ� �ٲٱ�");
	    System.out.print("	�Է� :  ");
	    int next = scan.nextInt();
	    return next;
	     }
	public static String updateMemberPasswordTel() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	ȸ�� Ȯ���� ���� ��ȭ��ȣ�� �Է����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	public static String updateMemberPasswordNewPass() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	��й�ȣ�� �Է����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	
	public static String updateMemberEmail() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	���ο� �̸����� �Է����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	public static String updateMemberEmailPass() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	�̸����� ���� ������ ���� ��й�ȣ�� �Է����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	
	public static String updateMemberAddr() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	���ο� �ּҸ� �Է����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	public static String updateMemberAddrPass() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.print("	�ּҸ� �ٲٰ������ ��й�ȣ�� �Է����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	
	public static int deleteMember() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.println("	������ �����Ͻðڽ��ϱ�? ");
	    System.out.println("	[1]��	[2]���� ���");
	    System.out.print("	�Է� :  ");
	    int next = scan.nextInt();
	    return next;
	     }

	public static String deleteMemberPass() {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
	    System.out.println("	��й�ȣ�� �Է��Ͻø� !!������ ����!! �˴ϴ�. ");
	    System.out.print("	��й�ȣ �Է� : ");
	    String next = scan.next();
	    return next;
	     }
	
	public static int searchBook() {
		 System.out.print("	å ��ȣ : ");
	    int next = scan.nextInt();
	    return next;
	     }
	
	public static int rentBook() {
		System.out.println("	[1]���� ��û	 [2]�ٸ� å ���� ");
		System.out.print("	�Է� : ");
		int next = scan.nextInt();
	    return next;
	     }
	
	public static int pickOrSearch() {
		System.out.println("	[1]�뿩�� å����  [2]�������� �˻�  [3]��ü��Ϻ���  [4]�ڷΰ���  ");
	    System.out.print("	�Է� : ");
	    int next = scan.nextInt();
	    return next;
	     }
	
	public static int rentOrAnother() {
		System.out.println("	[1]���� ��û	[2]�ٸ� å ����");
		 System.out.print("	�Է� : ");
	    int next = scan.nextInt();
	    return next;
	     }
	public static int rentAgainorMainMenu() {
		System.out.println("	[1]å �� ����	[2]���� �޴�");
		 System.out.print("	�Է� : ");
	    int next = scan.nextInt();
	    return next;
	     }
	
	public static int adminCodeScan() {
		System.out.println("	������ �ڵ带 �Է��ϼ��� : ");
	    int next = scan.nextInt();
	    return next;
	     }
	public static int returnOrBack() {
	    System.out.print("[1]�ݳ� �� å ����  [2]����");
	    int next = scan.nextInt();
	    return next;
	     }
	public static int returnBookNum() {
	    System.out.print("�ݳ��� å ��ȣ�� �Է��ϼ���: ");
	    int next = scan.nextInt();
	    return next;
	     }
	
	public static int addBookScore() {
	    System.out.print("������ �����ּ���(1~5): ");
	    int next = scan.nextInt();
	    return next;
	     }
	public static String addBookReview() {
	    System.out.print("�������� �����ּ���: ");
	    String next = scan.next();
	    return next;
	     }
	
	
}
