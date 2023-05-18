package cn.lingjiatong.ds_study.capter01.sort;

import lombok.Data;
import lombok.ToString;

/**
 * @author Ling, Jiatong
 * Date: 2023/5/18 11:03
 */
@Data
@ToString
public class Student implements Comparable<Student> {

    private String username;

    private Integer age;

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
