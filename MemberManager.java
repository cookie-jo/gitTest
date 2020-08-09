package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.AdminManagerDAO;
import dao.AdminManagerDAOImpl;
import dao.BookManagerDAO;
import dao.BookManagerDAOImpl;
import dao.MemberManagerDAO;
import model.AdminVO;
import model.BookVO;
import model.MemberVO;
import view.AdminManagerView;
import view.BookManagerView;
import view.MemberManagerView;

public class MemberManager {
	MemberManagerDAO dao;
	BookManagerDAO bdao = new BookManagerDAOImpl();
	AdminManagerDAO adao = new AdminManagerDAOImpl();
	AdminManager adminMan = new AdminManager(adao);
	BookManager bManager = new BookManager();

	
	public MemberManager(MemberManagerDAO dao) {
		this.dao = dao;
	}

//	public BookManager(BookManagerDAO bdao) {
//		this.bdao = bdao;
//	}

//	public AdminManager adao(AdminManagerDAO adao) {
//		this.adao = adao;
//	}

	MemberManagerView view = new MemberManagerView();
	BookManagerView bView = new BookManagerView();
	AdminManagerView aView = new AdminManagerView();

	int adminCode = 5292;
	
	Scanner sc = new Scanner(System.in);
	
	
//-------------------------------------------------------------------------	
	public void launchApplication() {
		// ����Ʈ �������� ���Ű��� ȯ���մϴ�.
		while (true) {
			int menu1 = MemberManagerView.getMenu();
			switch (menu1) {

//------------------------------------------------------------------------------
			case 1: // �α���

				int mOrALogin = view.mOrALogin(); // ȸ�� �Ǵ� ������ �α���
				switch (mOrALogin) {
				case 1:// ȸ�� �α��� 
					while (true) {
						MemberVO member = MemberManagerView.inputMemberLoginInfo();
						dao.m_selectMemberLogin(member);
						boolean loginCheck = dao.m_selectMemberLogin(member);
						if (loginCheck == true) {
							System.out.println();
							System.out.println("	�� �� ȸ�� �α��� ���� �� ��");
							System.out.println();
							break;
						} else {
							System.out.println();
							System.out.println("	��ȸ�� �α��� ���Т�");
							System.out.println("	���̵�� ��й�ȣ�� �ٽ� �Է����ּ���.");
							System.out.println();
						}
					}
					// [1] å �˻� [2] ������Ȳ [3] �� ���� [4] �α׾ƿ� ����
					while (true) {
						
						int memberGreet = view.inputMemberGreet();
						
						switch (memberGreet) {
						
						//[1]å�˻�
						case 1:
							
							List<BookVO> b_Recbooks = bdao.b_selectRecBooks();		
							System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
							System.out.println("                                                   ��õ ���� ���");
							System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
							AdminManagerView.printBookList(b_Recbooks);
						
							//bManager.launchBookSelect();
							
							//[1]�뿩�� å���� [2]�������� �˻� [3]��ü��Ϻ��� [4]�ڷΰ���
							//while
							while(true) {
							int pickOrSearch = view.pickOrSearch();
							switch(pickOrSearch) {
							case 1://[1]�뿩�� å����
								int booknumber = view.searchBook();
								int loginMemberNums2 = dao.loginMemberNumCheck();
								
								
								//�����û
								BookVO bookInfo = adao.searchbookByNum(booknumber);
								System.out.println(bookInfo); //�Է¹��� ��ȣ�� å ������ ���
								//����
								int rentOrAnother = view.rentOrAnother(); //[1]���� ��û [2]�ٸ� å ����
								
								switch(rentOrAnother) {
									case 1: //[1]�뿩�� å����-[1]���� ��û
										dao.m_rent(loginMemberNums2,booknumber);
										System.out.println("	������ �Ϸ� �Ǿ����ϴ�.");
										String pre = "";
										
										int rentAgainorMainMenu = view.rentAgainorMainMenu();
										
										switch(rentAgainorMainMenu) {
										case 1://[1]å �� ����
											continue; 
											
											
										case 2:
											break;
											//[2]���� �޴�
										}
							break;//12:53 break
									case 2: //[1]�뿩�� å���� -[2]�ٸ� å ����
										break;
										
								}
							break;//12:53 break
							
							//[1]å�˻�-[2]�������� �˻�
							case 2:
								//String searchTitle = 
								
								System.out.print("	�˻��� �Է� : ");
								String title = aView.scanBookName();
								BookVO book1 = adao.searchbookByName(title);
							
								int loginMemberNums3 = dao.loginMemberNumCheck();
								
								BookVO bookInfo2 = adao.searchbookByName(title);
								System.out.println(bookInfo2); //�Է¹��� ��ȣ�� å ������ ���
								
								int bookInfo2num = bookInfo2.getB_num();
								int rentOrAnother2 = view.rentOrAnother(); //[1]���� ��û [2]�ٸ� å ����
								
								switch(rentOrAnother2) {
									case 1: //[1]�뿩�� å����-[1]���� ��û
										dao.m_rent(loginMemberNums3,bookInfo2num);
										System.out.println("	������ �Ϸ� �Ǿ����ϴ�.");
										String pre = "";
										
										int rentAgainorMainMenu = view.rentAgainorMainMenu();
										
										switch(rentAgainorMainMenu) {
										case 1://[1]å �� ����
											continue; //problem 4:11
											
											
										case 2:
											break;
											//[2]���� �޴�	problem 4:11
										}
							break;//1:58break
									case 2: //[1]�뿩�� å���� -[2]�ٸ� å ����
										break;
										
								}
								break;
								
								
							//[1]å�˻�-[3]��ü��Ϻ���
							case 3:
								//adao.selectAllBook();
								List<BookVO> list2 = adao.selectAllBook();
								AdminManagerView.printBookList(list2);
								
								int booknumber3 = view.searchBook();
								int loginMemberNums4 = dao.loginMemberNumCheck();
								
								BookVO bookInfo3 = adao.searchbookByNum(booknumber3);
								System.out.println(bookInfo3); //�Է¹��� ��ȣ�� å ������ ���
								//����
								int rentOrAnother3 = view.rentOrAnother(); //[1]���� ��û [2]�ٸ� å ����
								
								switch(rentOrAnother3) {
									case 1: //[1]�뿩�� å����-[1]���� ��û
										dao.m_rent(loginMemberNums4,booknumber3);
										System.out.println("	������ �Ϸ� �Ǿ����ϴ�.");
										String pre = "";
										
										int rentAgainorMainMenu = view.rentAgainorMainMenu();
										
										switch(rentAgainorMainMenu) {
										case 1://[1]å �� ����
											continue; 
											
											
										case 2:
											continue;
											//[2]���� �޴�
										}
							
									case 2: //[1]�뿩�� å���� -[2]�ٸ� å ����
										continue;//�α��� â���� ��
										
								}
								
								
								break; //2:42
							
							
								
							//[1]å�˻�-[4]�ڷΰ���
							case 4:
								
								//continue;
								break; //4:10 break
									
							}//_switch
							break;
						//continue; 4:11
						}//_while
						continue;
							//break; 2:47
							
							//int b_num = bview.
							
						
						
						case 2://[2] ������Ȳ
							List<BookVO> list3 = dao.selectAllMemberBook();
							AdminManagerView.printBookList(list3);
							
							//1]�ݳ� �� å ����  [2]����
							int returnOrBack = view.returnOrBack();
							
							switch(returnOrBack) {
							
							case 1://1]�ݳ� �� å ���� 
								int returnBookNum = view.returnBookNum();
								int loginMemberNums5 = dao.loginMemberNumCheck();
								
								int addBookScore = view.addBookScore();
								String addBookReview = view.addBookReview();
								
								bdao.b_updateReview(addBookScore, addBookReview, returnBookNum);
								
								dao.m_return(loginMemberNums5,returnBookNum);
								System.out.println("	�ݳ��� �Ϸ� �Ǿ����ϴ�.");
								System.out.println("	���並 �����ּż� �����մϴ�!");
								String pre = "";
								/////////////
								break;
							case 2://[2]����
								System.exit(1);
							}
							
							break;
							
							
							
							
							
							
						case 3:// ������
								// [1] ��������[2]��������
							int inputMemberPage = view.inputMemberPage();
							switch (inputMemberPage) {
							case 1:// [1] ��������
								int updateMemberPage = view.updateMemberPage();
								// [1]��й�ȣ �ٲٱ� [2]�̸��� �ٲٱ� [3]�ּ� �ٲٱ�
								switch (updateMemberPage) {
								case 1:// [1]��й�ȣ �ٲٱ�
									String m_tel = view.updateMemberPasswordTel();
									String m_password = view.updateMemberPasswordNewPass();
									dao.m_updateMemberPassword(m_password, m_tel);
									break;
								case 2:// [2]�̸��� �ٲٱ�
									String m_password2 = view.updateMemberEmailPass();
									String m_email = view.updateMemberEmail();
									dao.m_updateMemberEmail(m_email, m_password2);
									break;
								case 3:// [3]�ּ� �ٲٱ�
									String m_password3 = view.updateMemberAddrPass();
									String m_addr = view.updateMemberAddr();
									dao.m_updateMemberAddr(m_addr, m_password3);
									break;
								}
								break;
							case 2:// [2]��������
									// ������ �����Ͻðڽ��ϱ�? [1]�� [2]���� ���
								int delete = view.deleteMember();
								switch (delete) {
								case 1:// ��й�ȣ�� �Է��Ͻø� ������ �����˴ϴ�:
									String delPass = view.deleteMemberPass();
									dao.m_deleteMember(delPass);
									break;
								case 2://2]���� ���
									continue;
								}
								break;
							}
						break;
						case 4://[4] �α׾ƿ� ����
							System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
							System.out.println("�ƢƢƢ�                                        ������ �������� �̿����ּż� �����մϴ�.                                             �ƢƢƢ�");
							System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
							System.exit(1);
							break;
						}
						
						break;
					}//���� �޴�
				break;
//-----------------------------------------------------------------------------	
				
				case 2://������ �α���
					while (true) {
						AdminVO member = AdminManagerView.adminLogin();
						dao.a_selectAdminLogin(member);
						boolean loginCheck = dao.a_selectAdminLogin(member);
						if (loginCheck == true) {
							System.out.println("	������ �α��� ����");
							
							adminMan.launchAdminMenu();
							
							break;
						} else {
							System.out.println("	������ �α��� ����.");
							System.out.println("	���̵�� ��й�ȣ�� �ٽ� �Է����ּ���.");
							continue;
						}
					
					}
					
				}
				
				break;
				
//------------------------------------------------------------------------------
				
			case 2: // ȸ������
				int register = view.mOrARegister(); // [1]ȸ�� ���� [2]������ ����
				switch (register) {
				case 1:// [1]ȸ�� ����
					MemberVO member2 = MemberManagerView.inputMemberInfo();
					//System.out.println(member2);
					dao.m_createMember(member2);
					break;
				case 2: //[2]������ ����
					while(true) {
					AdminVO admin3 =AdminManagerView.adminMemberinfo();
					int adminCodeScan = view.adminCodeScan();
					if (adminCodeScan == adminCode) {
						adao.a_createMember(admin3);
						System.out.println("	������ ������ �Ϸ�Ǿ����ϴ�.");
						break;
					}else {
						System.out.println("	������ �ڵ尡 Ʋ�Ƚ��ϴ�.");
						continue;
					}
					}
					break;
				}

				break;
			case 3: // ����
				System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
				System.out.println("�ƢƢƢ�                                        5���� �������� �̿����ּż� �����մϴ�.                                             �ƢƢƢ�");
				System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢƢ�");
				System.exit(1);
				break;
//			
//			case 4: // ã�ƿ��ô� ��
////				MemberVO member = MemberManagerView.inputMemberInfo();
////				dao.m_createMember(member);
////				// member�� ��� ������ m_createMember�������� ���� �ְڴ� 
//				break;
				
				}
			
			continue;
			
		} // ���� �޴�

//		while(true) {
//			char menu2 = MemberManagerView.
//		

}

}
