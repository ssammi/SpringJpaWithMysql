package com.sam.db.springdb.user;


import javax.persistence.*;

@Entity
@Table(name = "user_contact", catalog = "Mytest")
public class UserContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "phoneNo")
    private String phoneNo;

    //have to set cascade here, cuz everytime we update user contact table then it will update user table as well
    @OneToOne(cascade = CascadeType.ALL)
    //better to use referencedColumnName for debug, keep everything on track
    //this joins 2 tables
    @JoinColumn(name = "id", referencedColumnName = "id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserContact(){
    }

    public Long getId() {
        return id;
    }

    public UserContact setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public UserContact setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
}
