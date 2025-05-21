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
public class Android extends SistemaOperativo {
	    private String tipoDispositivo;
	    private String nivelPersonalizacion;
	    private String nivelCompatibilidad;
	    private String requisitosTecnicos;
	    private String tipoLicencia;

	    public void mostrarInfo() {
	        System.out.println("🔹 Android:");
	        System.out.println("Dispositivo: " + tipoDispositivo);
	        System.out.println("Personalización: " + nivelPersonalizacion);
	        System.out.println("Compatibilidad: " + nivelCompatibilidad);
	        System.out.println("Requisitos técnicos: " + requisitosTecnicos);
	        System.out.println("Licencia: " + tipoLicencia);
	    }
	    public void llamarAndroid ()
	    {
	    	setNombreSO("Android");
            setTipoUso("General");
            setOrientacionDispositivo("Móvil");
            setSoporteTecnico("Comunidad / Oficial");
            setDisponibilidad("Global");
            setTipoDispositivo("Smartphones / Tablets");
            setNivelCompatibilidad("Alta");
            setNivelPersonalizacion("Alta");
            setRequisitosTecnicos("Bajos a medios");
            setTipoLicencia("Abierta / Privativa");
	    }
	}