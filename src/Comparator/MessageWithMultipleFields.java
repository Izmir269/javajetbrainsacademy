package Comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MessageWithMultipleFields {

    private final String from;
    private final String content;
    private final LocalDate created;
    private int likes;

    public MessageWithMultipleFields(String from, String content, int likes, String created) {
        this.from = from;
        this.content = content;
        this.likes = likes;
        this.created = LocalDate.parse(created);
    }

    // getters and setters


    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return created.toString() + " " + from + " wrote: " +
                content + " (" + likes + ")";
    }

    public static void main(String[] args) {
        List<MessageWithMultipleFields> messages = new ArrayList<>();

        messages.add(new MessageWithMultipleFields("Alien", "Hello humans!", 32, "2034-03-25"));
        messages.add(new MessageWithMultipleFields("Pirate", "All hands on deck!", -2, "2034-01-05"));
        messages.add(new MessageWithMultipleFields("User765214", "Bump!", 1, "2033-02-17"));
        messages.add(new MessageWithMultipleFields("Unregistered", "This message was marked as spam", -18, "2033-01-14"));

        // comparaison par date
        messages.sort(new MessageDateComparator());
        messages.forEach(System.out::println);

        // Par le nom des auteurs
        messages.sort(new MessageAuthorComparator());
        messages.forEach(System.out::println);


    }
}
