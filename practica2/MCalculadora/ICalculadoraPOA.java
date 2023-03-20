package MCalculadora;


/**
* MCalculadora/ICalculadoraPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculadora.idl
* lunes 20 de marzo de 2023 20H36' CET
*/

public abstract class ICalculadoraPOA extends org.omg.PortableServer.Servant
 implements MCalculadora.ICalculadoraOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("sumar", new java.lang.Integer (0));
    _methods.put ("restar", new java.lang.Integer (1));
    _methods.put ("multiplicar", new java.lang.Integer (2));
    _methods.put ("dividir", new java.lang.Integer (3));
    _methods.put ("exponencial", new java.lang.Integer (4));
    _methods.put ("raiz", new java.lang.Integer (5));
    _methods.put ("modulo", new java.lang.Integer (6));
    _methods.put ("factorial", new java.lang.Integer (7));
    _methods.put ("potencia", new java.lang.Integer (8));
    _methods.put ("logaritmo", new java.lang.Integer (9));
    _methods.put ("logaritmoBase10", new java.lang.Integer (10));
    _methods.put ("seno", new java.lang.Integer (11));
    _methods.put ("coseno", new java.lang.Integer (12));
    _methods.put ("tangente", new java.lang.Integer (13));
    _methods.put ("secante", new java.lang.Integer (14));
    _methods.put ("cosecante", new java.lang.Integer (15));
    _methods.put ("cotangente", new java.lang.Integer (16));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // MCalculadora/ICalculadora/sumar
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         int $result = (int)0;
         $result = this.sumar (Ops);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // MCalculadora/ICalculadora/restar
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         int $result = (int)0;
         $result = this.restar (Ops);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // MCalculadora/ICalculadora/multiplicar
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         int $result = (int)0;
         $result = this.multiplicar (Ops);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // MCalculadora/ICalculadora/dividir
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         int $result = (int)0;
         $result = this.dividir (Ops);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 4:  // MCalculadora/ICalculadora/exponencial
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.exponencial (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 5:  // MCalculadora/ICalculadora/raiz
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.raiz (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 6:  // MCalculadora/ICalculadora/modulo
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.modulo (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 7:  // MCalculadora/ICalculadora/factorial
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.factorial (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 8:  // MCalculadora/ICalculadora/potencia
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.potencia (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 9:  // MCalculadora/ICalculadora/logaritmo
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.logaritmo (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 10:  // MCalculadora/ICalculadora/logaritmoBase10
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.logaritmoBase10 (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 11:  // MCalculadora/ICalculadora/seno
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.seno (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 12:  // MCalculadora/ICalculadora/coseno
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.coseno (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 13:  // MCalculadora/ICalculadora/tangente
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.tangente (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 14:  // MCalculadora/ICalculadora/secante
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.secante (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 15:  // MCalculadora/ICalculadora/cosecante
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.cosecante (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 16:  // MCalculadora/ICalculadora/cotangente
       {
         MCalculadora.Operadores Ops = MCalculadora.OperadoresHelper.read (in);
         double $result = (double)0;
         $result = this.cotangente (Ops);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:MCalculadora/ICalculadora:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ICalculadora _this() 
  {
    return ICalculadoraHelper.narrow(
    super._this_object());
  }

  public ICalculadora _this(org.omg.CORBA.ORB orb) 
  {
    return ICalculadoraHelper.narrow(
    super._this_object(orb));
  }


} // class ICalculadoraPOA