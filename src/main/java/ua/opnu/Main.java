package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Тимур", 2);
        s.addCourse("Математика");
        s.addCourse("Програмування");
        s.addCourse("Фізика");

        System.out.println(s.getName() + ": кількість дисциплін - " + s.getCourseCount());
        System.out.println(s.getName() + ": рік навчання - " + s.getYear());
        System.out.println(s.getName() + ": заплатив за навчання - " + s.getTuition());
    }
}
