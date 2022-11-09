package person;

/**
 * Person деген parent класс тузунуз анын полялары:
 *     private String fullName;
 *     private char gender;
 *     private String email;
 * жана бир timetable(); еген методу болсун
 *
 * Person классыны мурастаган(extends) эки класс тузунуз алар -
 * class Staff,  полялары:
 *      private String school;
 *      private double salary;
 *      private Student[] students;
 *
 * class Student, полялары:
 *     private String program;
 *     private int year;
 *     private double fee;
 *
 * Бул класстардын обьектерин тузуп поляларын толтуруп
 * идеанызды кошуп идеальный код жазыныз (приложение тузунуз)!
 */
public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff("Beksultan", 'M', "beksultanfromPeaksoft@gmail.com", "Peaksoft", 100000,
                new Student[]{new Student("Muhammed", 'm', "muhammed@gmail.com","java", 2, 1200)});

        System.out.println(staff);





    }
//    public Staff[] getStaffs(){
//        return new Staff[]{
//                new Staff(
//                        "Mukhammed Asantegin",
//                        "Grazhdanskyi119",
//                        'M',
//                        "Peaksoft House",
//                        5000.0d
//                ),
//                new Staff(
//                        "Rahim Bazarbai uulu",
//                        "Alamudun1",
//                        'M',
//                        "Peaksoft Kids",
//                        10000.0d
//
//                ),
//                new Staff(
//                        "Maksat Akyl",
//                        "Moscow",
//                        'M',
//                        "Peaksoft Moscow",
//                        15000.0d
//                ),
//                new Staff(
//                        "Aijamal Asangazieva",
//                        "Manas29",
//                        'F',
//                        "Sebat",
//                        20000.0d
//                )
//        };
//    }
//
//    public static Student[] getStudents(){
//        return new Student[]{
//                new Student(
//                        "Nuradil Alymbekov",
//                        "Nur44",
//                        'M',
//                        "c++",
//                        1,
//                        100000
//                ),
//                new Student(
//                        "Syimyk Zhumabekov",
//                        "Syi55",
//                        'M',
//                        "c++",
//                        2,
//                        110000
//                ),
//                new Student(
//                        "Sanjar Abdumomunov",
//                        "San11",
//                        'M',
//                        "python",
//                        3,
//                        200000
//                ),
//                new Student(
//                        "Baiysh Orozaliev",
//                        "Bai110",
//                        'M',
//                        "Java",
//                        4,
//                        150000.0
//                ),
//                new Student(
//                        "Kanykei Askarbekova",
//                        "Kanykei111",
//                        'F',
//                        "Java",
//                        5,
//                        250000.0
//                ),
//                new Student(
//                        "Samira Nurmatova",
//                        "Samira53",
//                        'F',
//                        "JS",
//                        6,
//                        180000.0
//                ),
//                new Student(
//                        "Saltanat Nematilla kyzy",
//                        "Saltanat33",
//                        'F',
//                        "Java",
//                        7,
//                        190000.0
//                ),
//                new Student(
//                        "Aidana Ibaragimova",
//                        "Aidana22",
//                        'F',
//                        "JS",
//                        8,
//                        140000.0
//                ),
//                new Student(
//                        "Ainazik Amangeldeva",
//                        "Ainazik55",
//                        'F',
//                        "python",
//                        8,
//                        165000.0d
//                ),
//                new Student(
//                        "Nabi Masaliev",
//                        "Nabi89",
//                        'M',
//                        "Java",
//                        10,
//                        90000.0d
//                )
//        };
//    }

}
