import java.util.Scanner;

class Persona {
    private String nombre;
    private int dni;
    private int edad;
    private int dinero;

    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.dinero = 50;
    }

    //METODOS QUE SE USAN DENTRO DEL OBJETO
    public void saludo(){
        System.out.println("Bienvenido a Caixa Bank "+nombre);
    }
    public void meterdinero(int ingresardinero){
        dinero+=ingresardinero;
        System.out.println("Saldo actual: "+dinero);
    }
}

public class banco {
    public static void quehacer(){
        System.out.println("¿Que quieres hacer hoy?\n1. Ingresar dinero\n2. Retirar dinero\n3. Ver saldo");
    }

    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Persona mipersona = new Persona("Lem Quilca",76624534,20);
        Persona segundapersona = new Persona("Kinberly",40488420,18);

        mipersona.saludo();
        quehacer();

        int ingresardinero=sc.nextInt();
        mipersona.meterdinero(ingresardinero);
    }
}
