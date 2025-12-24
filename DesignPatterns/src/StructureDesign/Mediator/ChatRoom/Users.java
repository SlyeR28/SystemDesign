package StructureDesign.Mediator.ChatRoom;

public class Users extends Icollegaue{
    private String name;


    public Users(String name ,Imediator imediator) {
        super(imediator);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
         imediator.sendMessageToAll(name , message);
    }

    @Override
    public void sendMessagePrivate(String to, String message) {

    }

    @Override
    public void receiveMessage(String from, String message) {
        System.out.println("    " + name + " got from " + from + ": " + message);
    }
}
