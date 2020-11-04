package ProvaIntermedia.Novembre.Ingsw;

import com.sun.tools.javac.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyListUtil list= new MyListUtil();
        List<Integer> copia = null;
        copia.add(3);
        copia.add(1);
        copia.add(2);
        copia.add(5);  
   		
        System.out.println(list.Crescente(copia));
        
        System.out.println(list.Decrescente(copia));
    }
}
