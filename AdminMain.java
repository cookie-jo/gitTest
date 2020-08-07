package admin.main;
import admin.controller.AdminManager;
import admin.dao.AdminManagerDAO;
import admin.dao.AdminManagerDAOImpl;
import admin.model.AdminVO;
import admin.view.AdminManagerView;
public class AdminMain {

	public static void main(String[] args) {
		AdminManagerDAO dao = new AdminManagerDAOImpl(); //�������̽� ��ü����
		AdminManager manager = new AdminManager(dao);  //��Ʈ�ѷ� ��ü����

		
		manager.launchApplication();
		
		

	}

}
