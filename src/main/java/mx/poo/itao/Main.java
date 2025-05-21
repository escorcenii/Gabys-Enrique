package mx.poo.itao;
import mx.poo.itao.objetos.*;
import java.util.Scanner;
public class Main {
		 public static void main(String[] args) {
			    Documentos documento = new Documentos();
		        documento.llamarDocumentos ();
		        Scanner sc = new Scanner(System.in); 
		        Usuario usuario = new Usuario();
		        usuario.llamarUsuario();
		        SistemaOperativo soRecomendado = null;
		        if (usuario.isUsaDispositivoMovil()&& usuario.getEcosistemaPreferido().equalsIgnoreCase("Apple")&& usuario.getPresupuesto().equalsIgnoreCase("Alto")&& usuario.isRequiereSeguridadAlta()) {
		            Ios ios = new Ios();
		            ios.llamarIos();
		            soRecomendado = ios;
		        } else if (usuario.isUsaDispositivoMovil() && usuario.getEcosistemaPreferido().equalsIgnoreCase("Google") && usuario.getPresupuesto().equalsIgnoreCase("Bajo")) {
		            Android android = new Android();
		            android.llamarAndroid();
		            soRecomendado = android;
		        } else if (!usuario.isUsaDispositivoMovil()&& usuario.getNivelConocimiento().equalsIgnoreCase("Alto")&& usuario.getPresupuesto().equalsIgnoreCase("Bajo")) {
		            Linux linux = new Linux();
		            linux.llamarlinux();
		            soRecomendado = linux;
		        } else if (!usuario.isUsaDispositivoMovil()&& usuario.getEcosistemaPreferido().equalsIgnoreCase("Apple")&& usuario.getPresupuesto().equalsIgnoreCase("Alto")) {
		            MacOs mac = new MacOs();
		            mac.llamarMacOs();
		            soRecomendado = mac;
		        } else if (!usuario.isUsaDispositivoMovil()&& (usuario.getPresupuesto().equalsIgnoreCase("Medio") || usuario.getPresupuesto().equalsIgnoreCase("Alto"))&& usuario.getNivelConocimiento().equalsIgnoreCase("Medio")) {
		            Windows win = new Windows();
		            win.llamarWindows();
		            soRecomendado = win;
		        } else {
		            Linux linux = new Linux();
		            linux.llamarlinux();
		            soRecomendado = linux;
		        }
		        System.out.println("----- Datos del Usuario -----");
		        usuario.mostrarInfo();
		        System.out.println("\n----- Sistema Operativo Recomendado -----");
		        soRecomendado.mostrarInfoSO();
		        sc.close();
		    }
		}