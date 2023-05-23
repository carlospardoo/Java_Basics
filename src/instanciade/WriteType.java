package instanciade;

public enum WriteType {
    CLASSIC("Escritura a mano"),
    MODERN("Escritura digital")
    ;

    private final String description;

    private WriteType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
