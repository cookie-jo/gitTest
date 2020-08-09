package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dao.AdminManagerDAO;
import dao.AdminManagerDAOImpl;
import dao.BookManagerDAO;
import dao.MemberManagerDAO;
import dao.MemberManagerDAOImpl;
import model.BookVO;
import view.BookManagerView;
import view.MemberManagerView;

public class BookManager {
	BookManagerDAO bdao;
	Scanner scan = new Scanner(System.in);
	
	public BookManager(BookManagerDAO dao) {
		this.bdao = dao;		
	}
	
	
	
	public BookManager() {
		super();
	
	}



	MemberManagerDAO dao = new MemberManagerDAOImpl();
	AdminManagerDAO adao = new AdminManagerDAOImpl();
	AdminManager adminMan = new AdminManager(adao);
	MemberManagerView view = new MemberManagerView();
	
	
	public void launchBookSelect() {		 
selectBook :while (true) {			
			int num = BookManagerView.printBestBookList(); // ��õ���� ����ϰ� �޴� ���� �� num ����

//			[1] ��õ���� ���� [2] �������� �˻� [3] ��ü ��� ���� [4] �ڷ� ����
//			switch (num) {
////			[1]��õ ���� ���� 
//			case 1: 				
//				int num1 = MemberManagerView.rentOrAnother(); // 1�� ��� 				  
//					if (num1 == 1) { // [1] ���� ��û
//						
//						// ���� ��û ��� �ڸ� 
//						
//						int booknumber = view.searchBook();
//						int loginMemberNums2 = dao.loginMemberNumCheck();
//						
//						BookVO bookInfo = adao.searchbookByNum(booknumber);
//						//System.out.println(bookInfo); //�Է¹��� ��ȣ�� å ������ ���
//						
//						dao.m_rent(loginMemberNums2,booknumber);
//						System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
//						String pre = "";
//						//System.out.println("���� ��û �Ϸ�");
//						continue selectBook;
//					}else if (num1 == 2) { //[2] �ٸ� å ����
//						continue selectBook;
//					}else { // �ٸ� ��ȣ �Է½� 
//						System.out.println("��õ ���� ������� ���ư��ϴ�.");
//						System.out.println();
//						continue selectBook;
//					}
//				
//			//�������� �˻�
//			case 2:		
//				System.out.print("�˻��� �Է� >> ");
//				String title = scan.next();				
//				ArrayList<BookVO> b_selTitle = bdao.b_selectTitle(title);
//				System.out.println(b_selTitle);
//				
//				int num2 =BookManagerView.printSelectedBook();
//				if (num2 == 1) { // å ��ȣ ����
//					// ���� ��û ��� �ڸ� 
//					System.out.println("���� ��û �Ϸ�");
//					break;
//				}else if (num2 == 2) {
//					break;
//				}
//				
//				break;
//			//��ü ������� ����
//			case 3: 
//				int num3 = BookManagerView.printBookList();
//				if (num3 == 1) { //[1] �뿩�� å ����
//					BookManagerView.printSelectedBook(); // å 1�� ��� 
//					
//					// ���� ��û ��� �ڸ� 
//					
//					System.out.println("���� ��û �Ϸ�");
//					continue selectBook;
//				}else if (num3 == 2 ) { //[2] ��õ ���� ������� �̵� 
//					
//					continue selectBook;
//				}else {
//					System.out.println("��õ ���� ������� �̵��մϴ�. ");
//					continue selectBook;
//				}
//				
//			// �ڷ� ���� (��� ȸ�� �α��� �� ȭ�� ) 
//			case 4: 
//				
//				//���θ޴���
//				continue selectBook; // ȸ�� ����â�� �� �ɾ��ּ��� . 
//
//			default:
//				System.out.println();
//				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
//				System.out.println();
//				break;
			}
		}
	}

