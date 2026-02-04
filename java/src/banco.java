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
        this.dinero = 0;
    }

    //METODOS QUE SE USAN DENTRO DEL OBJETO
    public void saludo(){
        System.out.println("Bienvenido a Caixa Bank "+nombre);
    }
    public void meterdinero(int ingresardinero){
        dinero+=ingresardinero;
        System.out.println("Saldo actual: "+dinero+"€");
    }
    public void sacardinero(int sacardinero){
        if (dinero<sacardinero){
            System.out.println("Saldo insuficiente");
            
        } else {
            dinero-=sacardinero;
            System.out.println("Saldo actual: "+dinero+"€");
        }

    }
    public void saldoactual(){
        System.out.println("Nombre: "+nombre+"\nDNI:"+dni+"\nEdad: "+edad+"\nDinero actual: "+dinero+"€");
    }
}

public class banco {
    public static void quehacer(){
        System.out.println("¿Que quieres hacer hoy?\n1. Ingresar dinero\n2. Retirar dinero\n3. Ver información de cuenta");
    }

    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Persona mipersona = new Persona("Lem Quilca",76624534,20);
        Persona segundapersona = new Persona("Kinberly",40488420,18);

        mipersona.saludo();
        boolean salir=false;

        while (!salir){
            int respuesta=0;
            quehacer();
            int quehacer= sc.nextInt();
            switch (quehacer){
                case 1:
                    System.out.println("¿Cúanto dinero deseas ingresar?");
                    int ingresardinero=sc.nextInt();
                    mipersona.meterdinero(ingresardinero);
                    System.out.println("¿Quieres realizar otra operación?\n1.Si\n2.No");
                    respuesta=sc.nextInt();
                    if (respuesta!=2){
                        continue;
                    } else {
                        System.out.println("Tenga un buen día");
                        return;
                    }
                case 2:
                    System.out.println("¿Cúanto retirarás?");
                    int sacardinero=sc.nextInt();
                    mipersona.sacardinero(sacardinero);
                    System.out.println("¿Quieres realizar otra operación?\n1.Si\n2.No");
                    respuesta=sc.nextInt();
                    if (respuesta!=2){
                        continue;
                    } else {
                        System.out.println("Tenga un buen día");
                        return;
                    }
                case 3:
                    mipersona.saldoactual();
                    System.out.println("¿Quieres realizar otra operación?\n1.Si\n2.No");
                    respuesta=sc.nextInt();
                    if (respuesta!=2){
                        continue;
                    } else {
                        System.out.println("Tenga un buen día");
                        return;
                    }
            }
        }



    }
}
