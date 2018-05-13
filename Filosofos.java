package filosofos;

public class Filosofos {

   
    public static void main(String[] args) {
     Controlador c=new Controlador(5); // 5 FILOSOFOS
  Filosofo f[] =new Filosofo[5]; 
  
  for (int cont=0;cont<5;cont++) {
   f[cont]=new Filosofo(cont,c);
   f[cont].start();
  }
 
  //dejamos pasar un tiempo y terminamos los hilos
  try {
   Thread.sleep((int)(8000));
  } catch (Exception ex1) { System.out.println(ex1);}
  System.exit(0);               
    }
    }
