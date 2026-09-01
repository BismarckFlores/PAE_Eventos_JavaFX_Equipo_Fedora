package com.uam.paejavafxeventos.interfaces;

import javafx.collections.ObservableList;

import java.util.Optional;

/**
 * Common data access contract for the practice.
 *
 * @param <T>  entity type (Product, CoffeeLot, Craft...)
 * @param <ID> type of the entity identifier
 */
public interface Dao<T, ID> {

    /**
     * Returns the live list of entities, ready to be bound directly to a
     * TableView with {@code table.setItems(dao.findAll())}.
     */
    ObservableList<T> findAll();

    Optional<T> findById(ID id);

    void save(T entity);

    /**
     * @return {@code true} if an entity with that id existed and was replaced
     */
    boolean update(ID id, T entity);

    /**
     * @return {@code true} if an entity with that id existed and was removed
     */
    boolean delete(ID id);
}
