package instanciade;

public class Writer extends Employee{

    private final WriteType writerType;
    public Writer(String name, double salary, WriteType writeType) {
        super(name, salary);
        this.writerType = writeType;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", writer type: "+this.writerType.getDescription();
    }

    public WriteType getWriterType() {
        return writerType;
    }
}
