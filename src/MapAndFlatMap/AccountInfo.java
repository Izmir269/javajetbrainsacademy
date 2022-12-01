package MapAndFlatMap;

public class AccountInfo {
    private long id;
    private String ownerFullName;

    public AccountInfo(long id, String ownerFullName) {
        this.id = id;
        this.ownerFullName = ownerFullName;
    }
    public AccountInfo() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }
}
