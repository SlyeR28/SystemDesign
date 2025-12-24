package StructureDesign.Mediator.ChatRoom;


public class WithoutMediator {
    public static void main(String[] args) {
//        User user1 = new User("Neha");
//        User user2 = new User("Sneha");
//        User user3 = new User("Suhani");
//        user1.addUser(user2);
//        user1.addUser(user3);
//        user2.muteUser("Neha");
//        user1.sendAll("Hello EveryOne");


        Mediator chatRoom = new Mediator();

        Users user1 = new Users("Rohan", chatRoom);
        Users user2 = new Users("Neha", chatRoom);
        Users user3 = new Users("Mohan", chatRoom);

        // Rohan mutes Mohan
        chatRoom.mute("Rohan", "Mohan");

        // broadcast from Rohan
        user1.sendMessage("Hello Everyone!");

        // private from Mohan to Neha
        user3.sendMessagePrivate("Neha", "Hey Neha!");

    }
}