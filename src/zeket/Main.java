package zeket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ЗЕКЕТТИ ӨЛЧӨӨЧҮ ПРОГРАММА

        Scanner scanner=new Scanner(System.in);
        System.out.println("Сиздин түшүмүңүз сугат жерби? (ооба) же (жок) деп жазыңыз");
        String harvest=scanner.nextLine();
        System.out.println("Коюңуздун саны:");
        int sheeps= scanner.nextInt();
        System.out.println("Эчкиңиздин саны:");
        int goats= scanner.nextInt();
        System.out.println("Уйларыңыздын саны:");
        int cows= scanner.nextInt();
        System.out.println("Төөлөрүңүздүн саны:");
        int camels= scanner.nextInt();
        System.out.println("Обороттогу акчаңызды сом менен жазыңыз:");
        int money= scanner.nextInt();
        System.out.println("Алтындарыңыздын салмагын грамм менен жазыңыз:");
        int gold= scanner.nextInt();
        System.out.println("Күмүштөрүңүздүн салмагын грамм менен жазыңыз:");
        int silver= scanner.nextInt();




        int sheepsGoats=sheeps+goats;
        int num1=sheepsGoats/100;
        int mostSheepsGoats= (int) Math.floor(num1);

        if (sheepsGoats>39 && sheepsGoats<120){
            System.out.println(1+" кой бересиз");
        } else if (sheepsGoats>119 && sheepsGoats<200){
            System.out.println(2+" кой бересиз");
        }else if (sheepsGoats>199 && sheepsGoats<400){
            System.out.println(3+" кой бересиз");
        } else if (sheepsGoats<39) {
            System.out.println("Кой жана эчкиден зекет бербейсиз");

        } else {
            System.out.println(mostSheepsGoats+" кой бересиз");
        }

        int num2=cows/40;
        int mostCows=(int) Math.floor(num2);
        if (cows<30){
            System.out.println("Уйдан зекет бербейсиз");
        } else if (cows>29 && cows<40) {
            System.out.println(1+ " даана 1 жаштагы торпок бересиз");
        } else if (cows>39 && cows<60) {
            System.out.println(1+ " даана 2 жаштагы кунаажын бересиз");
        } else if (cows>59 && cows<70) {
            System.out.println(2 + " даана 2 жашка чыккан кунаажын бересиз");
        } else if (cows>69 && cows<80) {
            System.out.println("3 жашка чыккан бир уй менен 2 жашка чыккан бир кунаажын бересиз");
        } else{
            System.out.println(mostCows + "даана 3 жашка чыккан уй бересиз");
        }

        int num3=camels/50;
        int mostCamels=(int) Math.floor(num3);
        if (camels<5){
            System.out.println("Төөдөн зекет бербейсиз");
        } else if (camels>4 && camels<10) {
            System.out.println("1 даана кой зекет бересиз");
        } else if (camels>9 && camels<15) {
            System.out.println("2 даана кой зекет бересиз");
        } else if (camels>14 && camels<20) {
            System.out.println("3 даана кой зекет бересиз");
        } else if (camels>19 && camels<25) {
            System.out.println("4 даана кой зекет бересиз");
        } else if (camels>24 && camels<35) {
            System.out.println("2 жашка чыккан 1 даана төө  бересиз");
        } else if (camels>34 && camels<46) {
            System.out.println("3 жашка чыккан 1 даана төө бересиз");
        } else if (camels>45 && camels<60) {
            System.out.println("4 жашка чыккан 1 даана төө бересиз");
        } else if (camels>59 && camels<76) {
            System.out.println("5 жашка чыккан 1 даана төө бересиз");
        } else if (camels>75 && camels<91) {
            System.out.println("3 жашка чыккан 2 төө бересиз");
        } else if (camels>90 && camels<120) {
            System.out.println("4 жашка чыккан 2 төө бересиз");
        } else {
            System.out.println(mostCamels+ "даана 4 жашка чыккан төө бересиз");
        }

        int zekat=money+gold*4500+silver*57;

        if (zekat<190000){
            System.out.println();
        }else {
            System.out.println(zekat/40 + " сом зекет бересиз. Ошондой эле   ");

        }

        switch (harvest){
            case "ооба":
                System.out.println("Түшүмдүн ондон бирин үшүр кылып бересиз");
                break;
            case "жок":
                System.out.println("Түшүмдүн жыйырмадан бирин үшүр кылып бересиз");
                break;
            default:
                System.out.println("Көрсөтмөдөгүдөй кылып жазыңыз. Компьютер түшүнгөн жок.");

        }
    }

}
