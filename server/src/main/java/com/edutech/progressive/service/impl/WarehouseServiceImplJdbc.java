package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.edutech.progressive.dao.WarehouseDAO;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplJdbc implements WarehouseDAO, WarehouseService {

    private WarehouseDAO warehouseDAO;

    public WarehouseServiceImplJdbc(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
      return null;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
       return null;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
        return -1;
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
       return null;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
     
    }

    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException {
       
    }

    @Override
    public List<Warehouse> getAllWarehouse() throws SQLException {
        return null;
    }

    
}