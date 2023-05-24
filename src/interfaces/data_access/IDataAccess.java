package interfaces.data_access;

public interface IDataAccess {

    //attributes are mandatory constants. public static final
    int MAX_REGISTRO = 10;

    //By default is public abstract
    void insert();

    void list();

    void update();

    void delete();

}
