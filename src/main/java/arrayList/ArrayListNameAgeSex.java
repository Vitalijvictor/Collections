package arrayList;

import java.util.ArrayList;

public class ArrayListNameAgeSex {
    private String name;
    private Integer age;
    private String sex;

    public ArrayListNameAgeSex() {
    }

    public ArrayListNameAgeSex(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    @Override
    public String toString() {
        return "ArrayListNameAgeSex{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
    }
}
