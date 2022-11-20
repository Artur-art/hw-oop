public class Main {
   public static void main(String[] args){
       Person artur = new Person("Artur",1993,"California"," Java programmer");
       artur.hello();
       Person billy = new Person ("",1992,"San Francisco", " QA engineer");
       billy.hello();
       Person paola = new Person("Paola",1990,"Ottava", " ui/ux designer");
       paola.hello();
       Person vladimir = new Person("Vladimir",1980,"Berlin"," product owner");
       vladimir.hello();


   }
}
