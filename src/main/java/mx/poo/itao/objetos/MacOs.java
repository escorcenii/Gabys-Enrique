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
public class MacOs extends SistemaOperativo {
    private String tipoDispositivo;
    private String interfazGestos;
    private String nivelSeguridad;
    private String personalizacion;
    private String tipoLicencia;

    public void mostrarInfo() {
        System.out.println("🔹 Ubuntu Touch:");
        System.out.println("Dispositivo: " + tipoDispositivo);
        System.out.println("Interfaz por gestos: " + interfazGestos);
        System.out.println("Seguridad: " + nivelSeguridad);
        System.out.println("Personalización: " + personalizacion);
        System.out.println("Licencia: " + tipoLicencia);
    }
    public void llamarMacOs ()
    {
    	 MacOs mac = new MacOs();
         setNombreSO("MacOS");
         setTipoUso("Profesional / Creativo");
         setOrientacionDispositivo("Escritorio");
         setSoporteTecnico("Oficial");
         setDisponibilidad("Global");
         setTipoDispositivo("MacBooks / iMacs");
         setInterfazGestos("Avanzada");
         setNivelSeguridad("Alta");
         setPersonalizacion("Media");
         setTipoLicencia("Privativa");

    }
}