package mx.poo.itao.objetos;
import mx.poo.itao.objetos.Android;
import mx.poo.itao.objetos.Linux;
import mx.poo.itao.objetos.MacOs;
import mx.poo.itao.objetos.SistemaOperativo;
import mx.poo.itao.objetos.Usuario;
import mx.poo.itao.objetos.Windows;
import mx.poo.itao.objetos.Ios;
import mx.poo.itao.objetos.Documentos;
import java.util.Scanner;
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
public class SistemaOperativo {
	private String nombreSO;
    private String tipoUso;               // Ej: Profesional, educativo, entretenimiento
    private String orientacionDispositivo; // Ej: Móvil, escritorio, ambos
    private String soporteTecnico;         // Ej: Oficial, comunidad, limitado
    private String disponibilidad;         // Ej: Global, restringida, beta

    public void mostrarInfoSO() {
        System.out.println("🖥️ Sistema Operativo: " + nombreSO);
        System.out.println("Tipo de uso: " + tipoUso);
        System.out.println("Orientado a: " + orientacionDispositivo);
        System.out.println("Soporte técnico: " + soporteTecnico);
        System.out.println("Disponibilidad: " + disponibilidad);
    }

} 