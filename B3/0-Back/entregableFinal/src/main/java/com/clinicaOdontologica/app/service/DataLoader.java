package com.clinicaOdontologica.app.service;


import com.clinicaOdontologica.app.entities.AppUser;
import com.clinicaOdontologica.app.entities.AppUsuarioRoles;
import com.clinicaOdontologica.app.repository.UserRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    Logger logger = LogManager.getLogger(DataLoader.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("digital");
        String password2 = passwordEncoder.encode("admin");
        try {
            userRepository.save(new AppUser("Natalia", "nativaresi", "nataliavaresi@email.com", password, AppUsuarioRoles.ROLE_USER));
            logger.info("User created");
            userRepository.save(new AppUser("Admin", "admin" ,"admin@email.com", password2, AppUsuarioRoles.ROLE_ADMIN));
            logger.info("Admin created");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
