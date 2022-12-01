package Comparator;

import java.util.ArrayList;
import java.util.List;

public class Message {

    private final String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }

    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Hello"));
        messages.add(new Message("humans!"));
        messages.add(new Message("We"));
        messages.add(new Message("came"));
        messages.add(new Message("with"));
        messages.add(new Message("peace!"));
        // trier en lui passant notre comparateur
        messages.sort(new MessageContentComparator());
        messages.forEach(System.out::println);
    }
}
