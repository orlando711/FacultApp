package ar.com.facultapp.www.facultapp.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by orl71 on 6/4/2017.
 */
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}

// [END blog_user_class]
