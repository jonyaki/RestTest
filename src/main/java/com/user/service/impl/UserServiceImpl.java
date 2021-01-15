package com.user.service.impl;

import com.user.model.User;
import com.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {



    public List<User> getAllUser(){
        List<User> usersHarcodeado;
        User user= new User();
        usersHarcodeado = new ArrayList<User>();
        user.setId(1L);
        user.setNombre("dio");
        user.setApellido("brando");
        usersHarcodeado.add(user);
        user.setId(2L);
        user.setNombre("ozzy");
        user.setApellido("osbourne");
        usersHarcodeado.add(user);
        return usersHarcodeado;
    }

    public void getAllUserHardCodeado(){


    }

}
