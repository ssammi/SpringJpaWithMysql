package com.sam.db.springdb.user;

import javax.persistence.*;

@Entity
@Table(name = "user", catalog = "Mytest")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private String salary;
    @Column(name = "dept")
    private String dept;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public User setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public String getDept() {
        return dept;
    }

    public User setDept(String dept) {
        this.dept = dept;
        return this;
    }
}
