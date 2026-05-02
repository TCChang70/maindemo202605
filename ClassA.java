public class VersionedItem {
    private String name;
    private int version;

    public VersionedItem(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getInfo() {
        return name + " - v" + version;
    }
}