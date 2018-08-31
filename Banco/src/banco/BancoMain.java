package banco;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BancoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Cliente> clientes = new LinkedList<>();
        char next = 's';
        String nombre;
        int dni;
        String motivo;
        int intmotivo;
            while(next == 's'){
                System.out.println("Ingrese el nombre del cliente");
                nombre = sc.next();
                System.out.println("Ingrese el DNI del cliente");
                dni = sc.nextInt();
                System.out.println("Ingrese el motivo:");
                System.out.println("1- Retiro");
                System.out.println("2- Deposito");
                System.out.println("3- Transferencia");
                intmotivo = sc.nextInt();
                switch (intmotivo){
                    case 1: motivo = "Retiro";
                    break;
                    case 2: motivo = "Deposito";
                    break;
                    case 3: motivo = "Transferencia";
                    break;
                    default: motivo = "Atención general";
                    break;
                }
                Cliente p = new Cliente(nombre, dni, motivo);
                clientes.add(p);
                System.out.println("Agregar otro cliente? s/n");
                next = sc.next().charAt(0);
                    while(next != 's' && next != 'n'){
                        System.out.println("Agregar otro cliente? s/n");
                        next = sc.next().charAt(0);
                    }
            }
        System.out.println("*********************************************");
        System.out.println("LISTA DE CLIENTES");
            while (!clientes.isEmpty()){
                System.out.println(clientes.poll());
            }
    }
}