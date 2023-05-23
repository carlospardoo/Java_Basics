package interfaces.data_access.impl;

import interfaces.data_access.IDataAccess;

public class MySqlImpl implements IDataAccess {
    @Override
    public void insert() {
        System.out.println("Insert since MySQl");
    }

    @Override
    public void list() {
        System.out.println("List since MySQl");
    }

    @Override
    public void update() {
        System.out.println("Update since MySQl");
    }

    @Override
    public void delete() {
        System.out.println("Delete since MySQl");
    }
}
