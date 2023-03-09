import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

public class ManejoArchivos {
	String FileName;
	String Path;
	
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}

	
	public void LeerArchivos() 
	{
		try {
			for (String linea : Files.readAllLines(Paths.get(Path)))
			{
			System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}







	/*
	public void EscribirArchivos(String UnTexto ) 
	{
		try {
			Files.writeString(Paths.get(Path), UnTexto +"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Encoding() 
	{
		try {
		Path utfFile = Files.createTempFile("some", ".txt");

		Files.write(utfFile, "un texto \n con eñes ".getBytes()); // UTF 8

		Files.write(utfFile, (System.lineSeparator() +
		"y acentos á ").getBytes(),StandardOpenOption.APPEND);

		System.out.println(Files.readAllLines(utfFile) .size());

		for (String line: Files.readAllLines(utfFile) ) {
		System.out.println(line);
		}

		Path iso88591File = Files.createTempFile("some", ".txt");

		
			Files.write(iso88591File, "otro texto con eñes".getBytes(StandardCharsets.ISO_8859_1));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
*/

