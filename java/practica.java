public class practica{
    //la public class deber tener el mismo nombre que el archivo
    public static void main(String[] args){
      float name;
      String Cliente = "juan danilo";//los datos tipos string debe ir en mayusculoas 
      System.out.println("hola señor "+Cliente+" ¿puede decirme su edad? por favor");
      System.out.println("para que pueda pasar a la atracion");

    name = 1.75f;
    System.out.println("mi altura es de "+name);
//logica del programa

    if(name <= 1.65f){
        System.out.println(Cliente+"perdon pero no puede pasar por que no tiene 1.70 para pasar a la atracion");
    }
    else{
         System.out.println(Cliente+"ya puede pasar señor juan danilo");
    }
    
    }
}