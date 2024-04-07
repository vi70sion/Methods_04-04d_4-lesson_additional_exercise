import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Parašykite programą, kuri prašo vartotojo įvesti savo vardą
//        ir tada pasveikina juos pagal įvestą vardą. Ši programa turėtų
//        būti sukūrusi void tipo funkciją, kuri priima vartotojo įvestį
//        kaip argumentą ir išveda pasveikinimą į konsolę.
        hello();

//        2. Parašykite programą, kuri priima du skaičius iš vartotojo ir
//        tada atspausdina jų sumą ir skirtumą. Naudojant void tipo funkciją,
//        kuri priima du parametrus - skaičius, ir išveda jų sumą ir skirtumą.
        sumAndDivision();

//        3. (BONUS) Parašykite programą, kuri prašo vartotojo įvesti tekstą
//        ir tada atspausdina įvestą tekstą atvirkštine tvarka. Ši programa
//        turėtų turėti void tipo funkciją, kuri priima įvestį kaip argumentą
//        ir atspausdina tekstą atvirkštine tvarka.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Iveskite teksta: ");
        String text = scanner.nextLine();
        printRevers(text);

    }
    public static void hello(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Iveskite varda: ");
        String text = scanner.nextLine();
        System.out.println("Sveiki, " + text + "!");
    }
    public static void sumAndDivision(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Iveskite pirma skaiciu: ");
        int number1 = scanner.nextInt();
        System.out.printf("Iveskite antra skaiciu: ");
        int number2 = scanner.nextInt();
        System.out.println("Suma: " + (number1+number2));
        System.out.println("Skirtumas: " + (number1-number2));
    }
    public static void printRevers(String text){
        String reversed = "";
        for(int i = text.length()-1; i >= 0 ; i--) {
            reversed += text.charAt(i);
        }
        System.out.println("Ivestas tekstas atvirkstine tvarka: " + reversed);
    }
}