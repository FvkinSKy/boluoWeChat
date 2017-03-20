package entity;

/**
 * Created by a07 on 2017/2/13.
 */
public class Course {
    private Integer courseId;
    private String name;
    private Integer days;

    public Course(Integer courseId, String name, Integer days) {
        this.courseId = courseId;
        this.name = name;
        this.days = days;
    }

    public Course() {
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", days=" + days +
                '}';
    }
}
