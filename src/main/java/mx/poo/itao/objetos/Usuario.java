package mx.poo.itao.objetos;
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
    public class Usuario {
    private String nombre;
    private boolean usaDispositivoMovil;
    private String nivelConocimiento;
    private boolean requiereSeguridadAlta;
    private String presupuesto;
    private String ecosistemaPreferido;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dispositivo Móvil: " + usaDispositivoMovil);
        System.out.println("Nivel de conocimiento: " + nivelConocimiento);
        System.out.println("Seguridad alta requerida: " + requiereSeguridadAlta);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Ecosistema preferido: " + ecosistemaPreferido);
    }
    public void llamarUsuario()
    {
    	Scanner sc = new Scanner(System.in); 

       

        System.out.println("¿Cuál es tu nombre?");
        setNombre(sc.nextLine());
        System.out.println("¿Usas dispositivo móvil? (1. Sí / 2. No)");
        setUsaDispositivoMovil(sc.nextInt() == 1);
        sc.nextLine(); 
        System.out.println("¿Cuál es tu nivel de conocimiento técnico? (Bajo / Medio / Alto)");
        setNivelConocimiento(sc.nextLine());
        System.out.println("¿Requieres alta seguridad? (1. Sí / 2. No)");
        setRequiereSeguridadAlta(sc.nextInt() == 1);
        sc.nextLine(); 
        System.out.println("¿Cuál es tu presupuesto? (Bajo / Medio / Alto)");
        setPresupuesto(sc.nextLine());
        System.out.println("¿Prefieres algún ecosistema? (Apple / Google / Libre / Ninguno)");
        setEcosistemaPreferido(sc.nextLine());
        System.out.println("\n🔎 Analizando tu perfil...\n");
    }
    }
