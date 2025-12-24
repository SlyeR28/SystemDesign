package StructureDesign.Mediator.ChatRoom;

public interface Imediator {
     void sendMessageToAll(String from , String message);
     void sendMessageToPrivate(String from , String to , String message);
     void  registerColleague(Icollegaue colleague);
}
