package pruebas_junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.raul.database.PersonalData;
import com.raul.database.jdbc.DAO_ImplJDBC;

public class ConexionJUnit {

	private static DAO_ImplJDBC dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new DAO_ImplJDBC();
	}

	@Test
	public void testConnection() {
		if(dao.getClass()==null){
			fail("ERROR: database connection has failed");
		}
		System.out.println("Connection SUCCESS");
	}

	@Test
	public void testGetData() {
		PersonalData tony, bruce, elena;
		tony = dao.getInfo("tony", "1234");
		System.out.println(tony);
		bruce = dao.getInfo("bruce", "5555");
		System.out.println(bruce);
		elena = dao.getInfo("elena", "7777");
		System.out.println(elena);
		if(tony==null || bruce==null || elena==null){
			fail("NOT found");
		}
		System.out.println("Connection SUCCESS");
	}

}
