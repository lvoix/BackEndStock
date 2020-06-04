package com.backend.stock.demo;

import com.backend.stock.demo.repository.RoleRepository;
import com.backend.stock.demo.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.backend.stock.demo.entity.user;
import com.backend.stock.demo.entity.role;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

      ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
     /*   RoleRepository roleRepository = ctx.getBean(RoleRepository.class);

        role roleuser = new role("ROLE_USER");
        role roleadmin = new role("ROLE_ADMIN");

        roleRepository.save(roleuser);
        roleRepository.save(roleadmin);

        UserRepository  userRepository = ctx.getBean(UserRepository.class);
         user user1 = new user("user", "user", true);
         user1.setRoles(Arrays.asList(roleuser));
         userRepository.save(user1);

        user user2 = new user("admin", "admin", true);
        user2.setRoles(Arrays.asList(roleuser, roleadmin));
        userRepository.save(user2);*/


    }

}
