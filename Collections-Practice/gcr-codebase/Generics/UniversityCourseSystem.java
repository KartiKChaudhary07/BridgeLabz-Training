import java.util.*;

// Abstract base
abstract class CourseType {
    abstract String evaluation();
}

// Course types
class ExamCourse extends CourseType {
    String evaluation() { return "Exam Based"; }
}

class AssignmentCourse extends CourseType {
    String evaluation() { return "Assignment Based"; }
}

class ResearchCourse extends CourseType {
    String evaluation() { return "Research Based"; }
}

// Generic class with bounded type
class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();
    void add(T course) { courses.add(course); }
    List<T> getCourses() { return courses; }
}

// Wildcard display
class CourseUtil {
    static void display(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println(c.evaluation());
    }
}

// Main
public class UniversityCourseSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.add(new ExamCourse());

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.add(new ResearchCourse());

        CourseUtil.display(examCourses.getCourses());
        CourseUtil.display(researchCourses.getCourses());
    }
}
