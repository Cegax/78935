using System;
using WSDL.mensajes;

namespace WDSL.operaciones
{
 public class Operaciones:Mensajes
 {
  public string Saludar(string nombre);
  {
   string msj="hola "+nombre+", te saluda Carlos";
   return msj;
  }
  public string Mostrar (int id)
  {
   return "x";
  }
 }
}
