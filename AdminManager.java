package controller;
import java.util.List;

import dao.AdminManagerDAO;
import dao.AdminManagerDAOImpl;
import model.AdminVO;
import model.BookVO;
import model.MemberVO;
import view.AdminManagerView;

public class AdminManager {
	AdminManagerDAO dao;

	public AdminManager(AdminManagerDAO dao) {
		this.dao = dao;
	}

BookVO bookV = new BookVO();
AdminManagerDAO adao = new AdminManagerDAOImpl();
AdminManagerView aView = new AdminManagerView();
//[1] ���� ���� [2] ȸ�� ���� [3] �α׾ƿ�	
//[1]��ü������Ȳ [2]���������߰� [3]������������ [4]���� ���� [5]����
	
	
	//������ ȸ������
	public void createNewAccount() {
		AdminVO vo = AdminManagerView.adminMemberinfo();
		dao.a_createMember(vo);
		System.out.println();
		System.out.println("	�� �� ������ ���� �Ϸ� �� ��");
		System.out.println();
	}
	
	
	
	//������ �α��α��
	public void loginAdmin() {
		int cnt = -1;
		AdminVO login = AdminManagerView.adminLogin();
		cnt = dao.inputAdminLoginInfo(login);
		if(cnt > 0 ) {
			System.out.println();
			System.out.println("	�� �� ������ �α��� ���� �� ��");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("	�� �� �α��� ���� �� ��");
			System.out.println();
		}
	}
	
	
	public void launchAdminMenu() {

		while (true) {
			int menu = AdminManagerView.adminScreen();
			switch (menu) {
			case 1: //[1]��������
				String pre=""; //�ڷΰ��� ��� ���� �ʱ�ȭ
				while(true) {
				int menu1 = AdminManagerView.adminBook();
				
				switch (menu1) {
				
				case 1: //[1]�������� - [1]��ü������Ȳ
					List<BookVO> list = dao.selectAllBook();
					AdminManagerView.printBookList(list);
					break;
					
				case 2: //[1]�������� - [2]���������߰�
					BookVO ibook = AdminManagerView.inputBookInfo();
					System.out.println(ibook);// �ڷᰡ �� ������ ����ؼ� Ȯ��.
					dao.insertNewBook(ibook); // �ڷḦ dao�� �־���.
					System.out.println("	���������� �߰��Ǿ����ϴ�.");
					break;

				case 3: //[1]�������� - [3]������������
					int num = AdminManagerView.inputsearchBookByNum(); // å��ȣ �Է½� ���
					BookVO vo = dao.searchbookByNum(num); // �����͸� �޾Ƽ� �ѱ�
					if (vo != null) {
						System.out.println(vo);
						BookVO ubook = AdminManagerView.updateBookInfo();
						dao.updateNewBook(ubook);
						System.out.println("	���������� �����Ǿ����ϴ�.");
					} else {
						System.out.println("	�˻�����");
					}
					break;

				case 4: //[1]�������� -[4]���� ����
					BookVO dbook = AdminManagerView.deleteBookInfo();
					dao.deleteNewBook(dbook);
					System.out.println("	������ �����Ǿ����ϴ�.");
					break;

				case 5: //[1]�������� - [5]����
					System.out.print("	���α׷��� ����Ǿ����ϴ�.");
					System.exit(0);
					break;
					
				case 6 : 
					pre="PRE";
					break;
					
				default://[1]�������� - [�߸��Ȱ��Է½� �޼������]
					System.out.println("	�߸��� ���Դϴ�.");
					break;
					
					}//_switch_case
				if(pre.equals("PRE")) break; //�ڷΰ��� ���. �����???? => while������ Ż�� �ٽ� �ٱ� while������ ���� ��.
				}//_while()
			
			  break;//case1�� Ż���ϸ� �ٽ� ū while������ �ݺ�
				
			case 2 : //[2]ȸ������
				
				List<MemberVO> list2 = adao.selectAllMember();
				AdminManagerView.printMemberList(list2);
				//_switch_case
				
				int adminMemberNumSelect = aView.adminMemberNumSelect();
				List<BookVO> memBookList = dao.selectAllMemberBook(adminMemberNumSelect);
				AdminManagerView.printBookList(memBookList);
				//aView.printBookList(memBookList.toStringDate());
				break;
			
				
				
			case 3 : //[3]�α׾ƿ�
				System.out.println("	����Ǿ����ϴ�.");
				System.exit(1);
				
				//aView.adminExit();
				//break;
			}//_switch_case

		}

	}
}
