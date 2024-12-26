package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService  {
List<Supplier> suppliersList;

    @Override
    public List<Supplier> getAllSuppliers() {
        return suppliersList;
    }

    @Override
    public int addSupplier(Supplier supplier) {
        suppliersList.add(supplier);
        return supplier.getSupplierId();
           
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
Collections.sort(suppliersList);  
return suppliersList;  
}

public void emptyArrayList(){
    suppliersList = new ArrayList<>();
}

}