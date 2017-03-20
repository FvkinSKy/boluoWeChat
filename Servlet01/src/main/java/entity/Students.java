package entity;

import java.util.Arrays;

/**
 * Created by a07 on 2017/2/13.
 */
public class Students {
    private String name;
    private Integer age;
    private String sex;
    private String[] interests;
    private Course course;

    public Students() {
    }

    public Students(String name, Integer age, String sex, String[] interests, Course course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.interests = interests;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", interests=" + Arrays.toString(interests) +
                ", course=" + course +
                '}';
    }
}
