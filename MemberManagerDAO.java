package dao;

import java.util.List;

import model.AdminVO;
import model.BookVO;
import model.MemberVO;

public interface MemberManagerDAO {
	
	public void m_createMember(MemberVO member);	//ȸ������
	
	public void m_updateMemberPassword(String m_password, String m_tel);	//ȸ�� ��� ����
	public void m_updateMemberEmail(String m_email, String m_tel);
	public void m_updateMemberAddr(String m_addr, String m_tel);
	
	public void m_deleteMember(String m_password);	//���� ����
	
	public boolean m_selectMemberLogin(MemberVO member);
	
	public List<BookVO> selectAllMemberBook();
	
	public int loginMemberNumCheck();
	public int loginUser();
	public void m_rent(int b_m_num, int b_num);
	//������ �α���
	public boolean a_selectAdminLogin(AdminVO member);
	
	public void m_return(int b_m_num, int num);
//	public void m_search(BookVO book);
//	public void m_rent(BookVO book);
//	public void m_return(BookVO book);
//	public void m_extendDate(BookVO book);
//	
}
