package admin.controller;
import java.util.List;
import admin.dao.AdminManagerDAO;
import admin.model.BookVO;
import admin.view.AdminManagerView;

public class AdminManager {
	AdminManagerDAO dao;
	public AdminManager(AdminManagerDAO dao) {
		this.dao = dao;
	}

//[1]��ü������Ȳ [2]���������߰� [3]������������ [4]���� ����
public void launchApplication() {
	while(true) {
		int menu = AdminManagerView.adminBook();
		switch(menu) {
		case 2 : //���������߰�
			BookVO book = AdminManagerView.inputBookInfo();
			System.out.println(book);
			dao.insertNewBook(book);
		break;
		
		
			
			}
		}
	}
}
