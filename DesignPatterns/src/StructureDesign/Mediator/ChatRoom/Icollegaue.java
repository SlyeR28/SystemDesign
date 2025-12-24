package StructureDesign.Mediator.ChatRoom;

public abstract class Icollegaue {
    protected  Imediator imediator;

    public Icollegaue(Imediator imediator) {
        this.imediator = imediator;
        imediator.registerColleague(this);
    }

    public abstract String getName();
    public abstract void sendMessage(String message);
    public abstract void sendMessagePrivate(String to, String message);

    public abstract void receiveMessage(String from  , String message);
}
