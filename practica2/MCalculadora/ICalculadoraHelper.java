package MCalculadora;


/**
* MCalculadora/ICalculadoraHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculadora.idl
* lunes 20 de marzo de 2023 20H36' CET
*/

abstract public class ICalculadoraHelper
{
  private static String  _id = "IDL:MCalculadora/ICalculadora:1.0";

  public static void insert (org.omg.CORBA.Any a, MCalculadora.ICalculadora that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MCalculadora.ICalculadora extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (MCalculadora.ICalculadoraHelper.id (), "ICalculadora");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MCalculadora.ICalculadora read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ICalculadoraStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MCalculadora.ICalculadora value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static MCalculadora.ICalculadora narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MCalculadora.ICalculadora)
      return (MCalculadora.ICalculadora)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MCalculadora._ICalculadoraStub stub = new MCalculadora._ICalculadoraStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static MCalculadora.ICalculadora unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof MCalculadora.ICalculadora)
      return (MCalculadora.ICalculadora)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      MCalculadora._ICalculadoraStub stub = new MCalculadora._ICalculadoraStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
