package com.sam.db.springdb.resource;


import com.sam.db.springdb.repository.UserContactRepository;
import com.sam.db.springdb.user.User;
import com.sam.db.springdb.user.UserContact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usercontact")
public class UserContactController {

    private UserContactRepository userContactRepository;
//no need to add @AutoWired here, latest spring will do auto wire
    public UserContactController(UserContactRepository userContactRepository) {
        this.userContactRepository = userContactRepository;
    }

    @GetMapping(value = "/all")
    public List<UserContact> findall(){
        return userContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UserContact> updateUserContact(@PathVariable("name") final String name){
        User user = new User();
        UserContact userContact = new UserContact();
        user.setSalary("2000")
                .setDept("AU")
                .setName(name);

        userContact.setPhoneNo("123456")
                    .setUser(user);

        userContactRepository.save(userContact);
        return userContactRepository.findAll();


    }
}
