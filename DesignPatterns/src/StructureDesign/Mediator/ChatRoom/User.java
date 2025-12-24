package StructureDesign.Mediator.ChatRoom;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private List<User> users;
    private List<String> mutedUsers;
    public User(String name) {
        this.name = name;
        users = new ArrayList<>();
        mutedUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void muteUser(String userToMute){
        mutedUsers.add(userToMute);
    }

    //send message to all
    public void sendAll(String message){
        System.out.println("[" +name + " broadcasts ] :" + message);
        for (User user : users) {

            if(!user.isMuted(name)){
                user.receive(name , message);
            }
        }
    }

    public void receive(String from, String msg) {
        System.out.println("    " + name + " got from " + from + ": " + msg);
    }




    // check is user is muted
    public boolean isMuted(String userToMute){
        for(String mutedUser : mutedUsers){
            if(userToMute.equals(mutedUser)){
                return true;
            }
        }
        return false;
    }

}


