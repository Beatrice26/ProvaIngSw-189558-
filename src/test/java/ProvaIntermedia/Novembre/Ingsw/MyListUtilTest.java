package ProvaIntermedia.Novembre.Ingsw;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.tools.javac.util.List;

public class MyListUtilTest {

	static MyListUtil mylist;
	
	@BeforeClass
	public static void prepare() {
		mylist = new MyListUtil();
	}
	
	@Test
	public static void CrescenteTest() {
		List<Integer> copia=null;
		copia.add(4);
		copia.add(3);
		copia.add(2);
		copia.add(5);
		assertEquals(Arrays.asList(2,3,4,5), mylist.Crescente(copia));
	}
	
	@Test
	public static void DecrescenteTest() {
		List<Integer> copia=null;
		copia.add(4);
		copia.add(3);
		copia.add(2);
		copia.add(5);
		assertEquals(Arrays.asList(5,4,3,2), mylist.Crescente(copia));
	}
	
}
