package interfaces.data_access.impl;

import interfaces.data_access.IDataAccess;

public class OracleImpl implements IDataAccess {
    @Override
    public void insert() {
        System.out.println("Insert since Oracle");
    }

    @Override
    public void list() {
        System.out.println("List since Oracle");
    }

    @Override
    public void update() {
        System.out.println("Update since Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Delete since Oracle");
    }
}
