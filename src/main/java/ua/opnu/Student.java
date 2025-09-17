public class Student {
    String name;
    int year;
    String[] courses = new String[50];
    int courseCount = 0;

    Student(String name, int year) {
        this.name = name;
        if (year >= 1 && year <= 4) this.year = year;
        else this.year = 1;
    }

    void addCourse(String courseName) {
        if (courseName != null && courseName.length() > 0 && courseCount < courses.length) {
            courses[courseCount] = courseName;
            courseCount++;
        }
    }

    void dropAll() {
        courseCount = 0;
    }

    int getCourseCount() {
        return courseCount;
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    int getTuition() {
        return year * 20000;
    }
}
