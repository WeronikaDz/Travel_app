package com.travel_app.auth;

import com.travel_app.repository.MySqlApplicationUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserService {

    private final MySqlApplicationUserDao mySqlApplicationUserDao;

    @Autowired
    public ApplicationUserService(MySqlApplicationUserDao mySqlApplicationUserDao) {
        this.mySqlApplicationUserDao = mySqlApplicationUserDao;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return mySqlApplicationUserDao
                .selectApplicationUserByUsername(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException(String.format("Username %s not found", username))
                );
    }

}
