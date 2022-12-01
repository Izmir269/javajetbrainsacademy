package Comparator;

import java.util.Comparator;

public class MessageContentComparator implements Comparator<Message> {
    @Override
    public int compare(Message message1, Message message2) {
        // on va définir comment faire la comparaison. Ici on veut le faire en se basant sur la taille du message
        int firstLength = message1.getContent().length();
        int secondLength = message2.getContent().length();
        return Integer.compare(firstLength, secondLength);
    }
}
class MessageDateComparator implements Comparator<MessageWithMultipleFields> {

    @Override
    public int compare(MessageWithMultipleFields message1, MessageWithMultipleFields message2) {
        return message1.getCreated().compareTo(message2.getCreated());
    }
}

class MessageAuthorComparator implements Comparator<MessageWithMultipleFields> {

    @Override
    public int compare(MessageWithMultipleFields message1, MessageWithMultipleFields message2) {
        return message1.getFrom().compareTo(message2.getFrom());
    }
}
