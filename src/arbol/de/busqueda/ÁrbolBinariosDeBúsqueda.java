/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.de.busqueda;

import java.util.Random;

/**
 *
 * @author AleMor
 */
public class ÁrbolBinariosDeBúsqueda {

    /**
     * @param args the command line arguments
     */
    class Nodo
      {
        int info;
        Nodo izq, der;
      }
      Nodo raiz;

      public ÁrbolBinariosDeBúsqueda() {
          raiz=null;
      }
      
      public void insertar (int info)
      {
          Nodo nuevo;
          nuevo = new Nodo ();
          nuevo.info = info;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null)
              raiz = nuevo;
          else
          {
              Nodo anterior = null, reco;
              reco = raiz;
              while (reco != null)
              {
                  anterior = reco;
                  if (info < reco.info)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (info < anterior.info)
                  anterior.izq = nuevo;
              else
                  anterior.der = nuevo;
          }
      }


      private void imprimirPre (Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.info + "\n ");
              imprimirPre (reco.izq);
              imprimirPre (reco.der);
          }
      }

      public void imprimirPre ()
      {
          imprimirPre (raiz);
          System.out.println();
      }

      private void imprimirEntre (Nodo reco)
      {
          if (reco != null)
          {    
              imprimirEntre (reco.izq);
              System.out.print(reco.info + "\n ");
              imprimirEntre (reco.der);
          }
      }

      public void imprimirEntre ()
      {
          imprimirEntre (raiz);
          System.out.println();
      }


      private void imprimirPost (Nodo reco)
      {
          if (reco != null)
          {
              imprimirPost (reco.izq);
              imprimirPost (reco.der);
              System.out.print(reco.info + "\n");
          }
      }


      public void imprimirPost ()
      {
          imprimirPost (raiz);
          System.out.println();
      }

    public static void main(String[] args) {
        // TODO code application logic here
         ÁrbolBinariosDeBúsqueda abo = new ÁrbolBinariosDeBúsqueda ();
          /*abo.insertar (100);
          abo.insertar (50);
          abo.insertar (25);
          abo.insertar (75);
          abo.insertar (150);*/
          for(int r=0; r<=999999; r++){
                    Random aleatorio = new Random();
                     int cadena=aleatorio.nextInt();
                     abo.insertar(cadena);
          }
                     
          System.out.println ("Impresion preorden: ");
          abo.imprimirPre ();
          System.out.println ("Impresion entreorden: ");
          abo.imprimirEntre ();
          System.out.println ("Impresion postorden: ");
          abo.imprimirPost ();        
      }
        
    }
    

