package ProvaIntermedia.Novembre.Ingsw;

import com.sun.tools.javac.util.List;

public class MyListUtil {
	public static List<Integer> Crescente(List<Integer> list) {
		boolean ok;
		List<Integer> copia = null;
		for(int i=0 ; i<list.length(); i++ ) {
			ok=false; 
			for(int j=1; j< (list.length()-1) ; j++ ){
				if(list.get(j-1) < list.get(j)){
					int temp = list.get(j-1);
					int temp2=temp;
					temp2 = list.get(j);
					temp2 = temp;
					copia.add(temp);
					ok=true;
				}
			}
			if(!ok) {
				
				break;
			}
		}
		return copia;
	}
	
	public static List<Integer> Decrescente( List<Integer> list) {
		boolean ok;
		List<Integer> copia = null;
		for(int i=0 ; i<list.length(); i++ ) {
			ok=false;
			for(int j=1; j< (list.length()-1) ; j++ ){
				if(list.get(j-1) > list.get(j)){
					int temp = list.get(j-1);
					int temp2=temp;
					temp2 = list.get(j);
					temp2 = temp;
					copia.add(temp);
					ok=true;
				}
			}
			if(!ok) {
				
				break;
			}
		}
		return copia;
	}
}
