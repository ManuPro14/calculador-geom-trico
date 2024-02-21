import java.util.Scanner;

public class calculador_geometico {
    public static void main(String[] args) {
        Scanner figuras = new Scanner(System.in);
        System.out.println("Ingresa que tipo de figura quieres calcular: " + "circulo, triangulo, cuadrado");
        String figura = figuras.nextLine();


        if(!figura.equals("circulo") && !figura.equals("triangulo") && !figura.equals("cuadrado")){
            System.out.println("La figura ingresada no es valida");
            System.out.println("Ingresa que tipo de figura quieres calcular: " + "circulo, triangulo, cuadrado");
            figura = figuras.nextLine();
        }


        if (figura.equals("circulo")) {
            System.out.println("Ingresa el radio del circulo: ");
            double radio = figuras.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;
            System.out.println("El area del circulo es: " + area);
            System.out.println("El perimetro del circulo es: " + perimetro);
        } else if (figura.equals("triangulo")) {
            System.out.println("Ingresa la base del triangulo: ");
            double base = figuras.nextDouble();
            System.out.println("Ingresa la altura del triangulo: ");
            double altura = figuras.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("El area del triangulo es: " + area);
        } else if (figura.equals("cuadrado")) {
            System.out.println("Ingresa el lado del cuadrado: ");
            double lado = figuras.nextDouble();
            double area = Math.pow(lado, 2);
            System.out.println("El area del cuadrado es: " + area);
        } else {
            System.out.println("La figura ingresada no es valida");
        }

        System.out.println("Desea calcular otra figura? si/no");
        Scanner respuesta = new Scanner(System.in);
        String respuestas = respuesta.nextLine();
        if(respuestas.equals("si")){
            //que repita el programa desde el inicio
            calculador_geometico.main(args);

        }else{
            System.out.println("Gracias por usar el programa");
        }



    }
}
