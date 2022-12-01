public class MethodOverriting {

}
   // Ici on a une classe mère Bank avec une méthode getRateOfInterest
    // Cependant chacune de ses classes filles a sa propre implementation de cette méthode
// Donc on réecrit cette méthode avec la même signature dans les classes filles => OVERRIDING  METHOD
class Bank{
int getRateOfInterest(){return 0;}
 }
//Creating child classes.
class SBI extends Bank{
 int getRateOfInterest(){return 8;}
 }

        class ICICI extends Bank{
int getRateOfInterest(){return 7;}
 }

