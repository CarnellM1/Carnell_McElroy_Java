package com.company.Contollers;

import com.company.Models.ChatterPost;
import com.company.Models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;
@RestController
public class Controller {
    private List<User> userList;

    public Controller() {
        User luis = new User("Luis");
        User sue = new User("Sue");
        User timothy = new User("Timothy");
        User george = new User("George");
        User arturo = new User("Arturo");
        User mariella = new User("Mariella");
        User paolo = new User("Paolo");
        User tri = new User("Tri");
        User jane = new User("Jane");
        User carol = new User("Carol");
        User carl = new User("Carl");

        luis.setChatterPosts(Arrays.asList(new ChatterPost("Hey! This is my first post!"), new ChatterPost("Anybody want to be friends?")));
        sue.setChatterPosts(Arrays.asList(new ChatterPost("I'm bored"), new ChatterPost("Who wants to hang?")));
        timothy.setChatterPosts(Arrays.asList(new ChatterPost("My life is awesome!"), new ChatterPost("Click here to buy my vegan shakes!")));
        george.setChatterPosts(Arrays.asList(new ChatterPost("I like pigs."), new ChatterPost("I love lamp.")));
        arturo.setChatterPosts(Arrays.asList(new ChatterPost("My cat is so cute"), new ChatterPost("My kitten is purr-fect.")));
        mariella.setChatterPosts(Arrays.asList(new ChatterPost("I'll never post again")));
        paolo.setChatterPosts(Arrays.asList(new ChatterPost("Have you ever heard of the band Nirvana?"), new ChatterPost("Pearl Jam 4 Life")));
        tri.setChatterPosts(Arrays.asList(new ChatterPost("You definitely grew up in the 90s if you get these 10 references."), new ChatterPost("I don't get this generation? Everyone expects a participation trophy.")));
        jane.setChatterPosts(Arrays.asList(new ChatterPost("I just wrecked my dad's car. He's going to kill me!"), new ChatterPost("Grounded.... for 5 months :( ")));
        carol.setChatterPosts(Arrays.asList(new ChatterPost("Does anyone have some imodium?")));
        carl.setChatterPosts(Arrays.asList(new ChatterPost("My roommate is awful!!!!"), new ChatterPost("Anyone know a room for rent in Hyde Park?")));

        userList = Arrays.asList(luis, sue, timothy, george, arturo, mariella, paolo, tri, jane, carol, carl);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> allUsers()
    {
        return userList;
    }

    @RequestMapping(value = "/users/{username}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public User userByUsername (@PathVariable String username )
    {
        // Create User
        User foundUser = null;

        // Newly Created user's name equals Username in URI
        foundUser.setName(username);

        // Loops through list of users to see if the new username
        // equals a name in the list.
        // if new user's name equals a name in the list
        // returns the user with that name in the list
        for(User users : userList)
        {
            if (users.getName().equals(foundUser.getName()))
            {
                foundUser = users;
            }

        }
        return foundUser;
        }
    @RequestMapping(value = "/users/chatterposts/{username}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    private List<ChatterPost> ChatterPosts(@PathVariable String username)
    {
        // Create User
        User foundUser = null;

        // Newly Created user's name equals Username in URI
        foundUser.setName(username);

        // Loops through list of users to see if the new username
        // equals a name in the list.
        // if new user's name equals a name in the list
        // returns the user with that name in the list
        for(User users : userList)
        {
            if (users.getName().equals(foundUser.getName()))
            {
                foundUser = users;
            }

        }
        return foundUser.getChatterPosts();
    };
}
