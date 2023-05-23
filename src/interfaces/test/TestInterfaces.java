package interfaces.test;

import interfaces.data_access.IDataAccess;
import interfaces.data_access.impl.MySqlImpl;
import interfaces.data_access.impl.OracleImpl;

public class TestInterfaces {
    public static void main(String[] args) {
        IDataAccess dataAccess = new MySqlImpl();

        dataAccess.list();

        dataAccess = new OracleImpl();
        print(dataAccess);
    }

    public static void print(IDataAccess dataAccess){
        dataAccess.list();
    }
}
