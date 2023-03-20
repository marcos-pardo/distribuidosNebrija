import MCalculadora.*;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import java.io.*;
import java.util.*;

public class CalcClient {
    static ICalculadora c = null;

    public static void main(String[] args) {
        try {
            
            // Se crea e inicializa el ORB
            ORB orb = ORB.init(args, null);

            // Se obtienen la raíz del contexto de nombres de CORBA
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

            // Se recomienda el uso de NamingCOntextExt en lugar de NamingContext, ya que 
            // es parte de la interoperabilidad en el servicio de nombres
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Asignamos el nombre del servicio que estamos buscando para que sea
            // resuelto por el servicio de nombres
            String nombreServicio = "Calculadora";
            c = ICalculadoraHelper.narrow(ncRef.resolve_str(nombreServicio));

            // Llamada a los procedimientos remotos
            Operadores ops = new Operadores();
            ops.a = 10;
            ops.b = 10;
            System.out.println("Suma: " + c.sumar(ops));
            System.out.println("Resta: " + c.restar(ops));
            System.out.println("Multiplicación: " + c.multiplicar(ops));
            System.out.println("División: " + c.dividir(ops));
            System.out.println("Exponencial: " + c.exponencial(ops));
            System.out.println("Raíz: " + c.raiz(ops));
            System.out.println("Módulo: " + c.modulo(ops));
            System.out.println("Factorial: " + c.factorial(ops));
            System.out.println("Potencia: " + c.potencia(ops));
            System.out.println("Logaritmo: " + c.logaritmo(ops));
            System.out.println("Logaritmo Base 10: " + c.logaritmoBase10(ops));
            System.out.println("Seno: " + c.seno(ops));
            System.out.println("Coseno: " + c.coseno(ops));
            System.out.println("Tangente: " + c.tangente(ops));
            System.out.println("Cosecante: " + c.cosecante(ops));
            System.out.println("Secante: " + c.secante(ops));
            System.out.println("Cotangente: " + c.cotangente(ops));
            

            



        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}