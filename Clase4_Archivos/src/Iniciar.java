import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Iniciar {

	public static void main(String[] args) {
	 String TipoOp="Multi";
	 String RutaArc ="C:\\Users\\Roque\\Desktop\\CURSO JAVA\\Ruta\\Numeros.txt";	
	LeerArchivos(RutaArc, TipoOp);
		
	}
	public static void LeerArchivos(String Path, String TipoOp) 
	{
		int Suma =0;
		int multi=1;
		String ArrayNum[]=new String[10];
		try 
		{
			for (String linea : Files.readAllLines(Paths.get(Path)))
			{
			 System.out.println("Los numeros en el archivo son =\n" + linea +"\n");
				ArrayNum = linea.split(",");
			}
			for(int i=0; i < ArrayNum.length;  i++)
			{
				if(TipoOp=="multi") {
				Suma += Integer.parseInt(ArrayNum[i]);
				}else {multi *= Integer.parseInt(ArrayNum[i]);};
			}
			if(TipoOp=="Suma") {
			System.out.println("La suma de estos numeros es: "+ Suma);
			}else {System.out.println("La multiplicación de estos numeros es: "+ multi);};
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
