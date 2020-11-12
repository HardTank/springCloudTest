package com.tank.lamdatest;

import com.tank.lamdatest.modle.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author tanlx
 * @description
 * @date 2020/11/12 10:14
 */
public class LamdaTest {
    public static void main(String[] args) {
        List<Student> stuList = Stream.of(
                new Student("一", 1),
                new Student("二", 2),
                new Student("三", 3))
                .collect(Collectors.toList());
        System.out.println(stuList);
        List<Student> list = stuList.stream().filter(
                stu -> stu.getAge() > 3).collect(Collectors.toList());
        System.out.println(list);
        List<String> names = stuList.stream().map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);
        String str = stuList.stream()
                .map(Student::getName).collect(Collectors.joining(",","&","**"));
        System.out.println(str);
    }

}
