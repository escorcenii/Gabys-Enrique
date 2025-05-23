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
public class Windows extends SistemaOperativo {
    private String arquitecturaCompatible;      // Ej: x86, x64
    private Boolean enfocadoGaming;             // Ideal para juegos
    private Boolean usoCorporativo;             // Bien adoptado en empresas
    private String frecuenciaActualizaciones;   // Ej: Alta, media, baja
    private String nivelCompatibilidadSoftware; // Compatibilidad con programas

    public void mostrarInfo() {
        System.out.println("🔹 Windows:");
        System.out.println("Arquitectura compatible: " + arquitecturaCompatible);
        System.out.println("Enfocado en gaming: " + enfocadoGaming);
        System.out.println("Uso corporativo: " + usoCorporativo);
        System.out.println("Actualizaciones: " + frecuenciaActualizaciones);
        System.out.println("Compatibilidad de software: " + nivelCompatibilidadSoftware);
    }
    public void llamarWindows ()
    {
    	setNombreSO("Windows");
        setTipoUso("General / Empresarial / Juegos");
        setOrientacionDispositivo("Escritorio");
        setSoporteTecnico("Oficial / Empresas");
        setDisponibilidad("Global");
        setArquitecturaCompatible("x64");
        setEnfocadoGaming(true);
        setUsoCorporativo(true);
        setFrecuenciaActualizaciones("Media");
        setNivelCompatibilidadSoftware("Muy alta");
    }
}
