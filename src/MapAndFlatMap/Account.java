package MapAndFlatMap;

public class Account {
    private long id;
    private boolean isLocked;
    private User owner;

    public Account(long id, boolean isLocked, User owner) {
        this.id = id;
        this.isLocked = isLocked;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
