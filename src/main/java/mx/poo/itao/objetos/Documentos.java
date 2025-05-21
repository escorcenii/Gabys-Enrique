package mx.poo.itao.objetos;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
public class Documentos {
public void llamarDocumentos ()
{
	System.out.println("INGRESA UNA IDENTIFICACIÓN");
	JFileChooser fileChooser = new JFileChooser();
	fileChooser.setDialogTitle("Selecciona un archivo para subir");
	Integer resultado = fileChooser.showOpenDialog(null);
	
	if (resultado == JFileChooser.APPROVE_OPTION) {
		File archivoSeleccionado = fileChooser.getSelectedFile();
		System.out.println("Archivo seleccionado: " + archivoSeleccionado.getAbsolutePath());
		
		String rutaDestino = "src/documentos";
		File carpetaDestino = new File(rutaDestino);
		
		 if (!carpetaDestino.exists()) {
                carpetaDestino.mkdirs();
            }
		 
		 File archivoDestino = new File(carpetaDestino, archivoSeleccionado.getName());
		 
		 try {
			 Files.copy(archivoSeleccionado.toPath(), archivoDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);
             System.out.println("Archivo guardado exitosamente en: " + archivoDestino.getAbsolutePath());
		 }catch(IOException ex) {
			 System.out.println("Error al copiar el archivo: " + ex.getMessage());
		 }
	}else {
        System.out.println("No se seleccionó ningún archivo.");
    }
}
}