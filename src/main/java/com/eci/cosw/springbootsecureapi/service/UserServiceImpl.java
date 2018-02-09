package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        users.add( new User( "test@mail", "password", "Andres", "Perez" , "http://www.elcolombiano.com/documents/10157/0/580x375/0c5/580d365/none/11101/GWBC/image_content_26637562_20160805210529.jpg", "juan") );
    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( Long id )
    {
        
        return users.get( 0 );
    }

    @Override
    public User createUser( User user )
    {
        users.add(user);
        return user;
    }

    @Override
    public User findUserByEmail( String email ) throws UsersException
    {
        for(int i=0; i<users.size(); i++){
            if(email.equalsIgnoreCase(users.get(i).getEmail())){
                return users.get(i);
            }
        }
        throw new UsersException("No user found with the email address");
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        return users.get( 0 );
    }

}
