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
public class Linux extends SistemaOperativo {
	 private String tipoDispositivo;
	    private String nivelPersonalizacion;
	    private String tipoLicencia;
	    private String usoRecomendado;
	    private String soporteComunidad;

	    public void mostrarInfo() {
	        System.out.println("🔹 Linux:");
	        System.out.println("Dispositivo: " + tipoDispositivo);
	        System.out.println("Personalización: " + nivelPersonalizacion);
	        System.out.println("Licencia: " + tipoLicencia);
	        System.out.println("Uso recomendado: " + usoRecomendado);
	        System.out.println("Soporte comunidad: " + soporteComunidad);
	    }
	    public void llamarlinux() {
	       
	        setNombreSO("Linux"); // Assumes SistemaOperativo has setNombreSO
	        setTipoUso("General / Estudio / Alternativo"); // Assumes SistemaOperativo has setTipoUso
	        setOrientacionDispositivo("Ambos"); // Assumes SistemaOperativo has setOrientacionDispositivo
	        setSoporteTecnico("Comunidad"); // Assumes SistemaOperativo has setSoporteTecnico
	        setDisponibilidad("Global"); // Assumes SistemaOperativo has setDisponibilidad
	        setTipoDispositivo("PC / Laptop");
	        setNivelPersonalizacion("Alta");
	        setTipoLicencia("Libre");
	        setUsoRecomendado("Alternativa a Windows");
	        setSoporteComunidad("Extensa");
	        System.out.println("❗ No se encontró una coincidencia exacta. Se recomienda Linux por su flexibilidad.");
	    }
	}