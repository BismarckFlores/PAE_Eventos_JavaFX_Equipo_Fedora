package com.uam.paejavafxeventos.dao;

import com.uam.paejavafxeventos.interfaces.Dao;
import com.uam.paejavafxeventos.model.CoffeeLot;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Optional;

public class CoffeLotDao implements Dao<CoffeeLot, String> {
    private final ObservableList<CoffeeLot> lots = FXCollections.observableArrayList(
            new CoffeeLot("L-001", "Juana Martínez", 12.5),
            new CoffeeLot("L-002", "Pedro Gutiérrez", 8.0),
            new CoffeeLot("L-003", "María Zeledón", 20.0),
            new CoffeeLot("L-004", "Santos Peralta", 15.75)
    );

    @Override
    public ObservableList<CoffeeLot> findAll() {
        return lots;
    }

    @Override
    public Optional<CoffeeLot> findById(String code) {
        return lots.stream()
                .filter(lot -> lot.getCode().equalsIgnoreCase(code))
                .findFirst();
    }

    @Override
    public void save(CoffeeLot lot) {
        lots.add(lot)
    }

    @Override
    public boolean update(String code, CoffeeLot lot) {
        int idx = indexOf(code);

        if (idx < 0) {
            return false;
        }

        lots.set(idx, lot);
        return true;
    }

    @Override
    public boolean delete(String code) {
        int index = indexOf(code);

        if (index < 0) {
            return false;
        }

        lots.remove(index);
        return true;
    }

    private int indexOf(String code) {
        for (int i = 0; i < lots.size(); i++) {
            if (lots.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }
}
