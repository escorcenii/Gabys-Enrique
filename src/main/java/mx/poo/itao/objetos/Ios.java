package mx.poo.itao.objetos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class Ios extends SistemaOperativo {
	
	    private String tipoDispositivo;
	    private String nivelSeguridad;
	    private String nivelCompatibilidad;
	    private String personalizacion;
	    private String tipoLicencia;

	    public void mostrarInfo() {
	        System.out.println("🔹 iOS:");
	        System.out.println("Dispositivo: " + tipoDispositivo);
	        System.out.println("Seguridad: " + nivelSeguridad);
	        System.out.println("Compatibilidad: " + nivelCompatibilidad);
	        System.out.println("Personalización: " + personalizacion);
	        System.out.println("Licencia: " + tipoLicencia);
	    }
	    public void llamarIos()
	    {
            setNombreSO("iOS");
            setTipoUso("General");
            setOrientacionDispositivo("Móvil");
            setSoporteTecnico("Oficial");
            setDisponibilidad("Global");
            setTipoDispositivo("iPhone / iPad");
            setNivelCompatibilidad("Alta con dispositivos Apple");
            setNivelSeguridad("Muy Alta");
            setPersonalizacion("Limitada");
            setTipoLicencia("Privativa");
	    }
	}
