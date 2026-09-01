package com.uam.paejavafxeventos.dao;

import javafx.collections.ObservableList;

import java.util.Optional;

/**
 * Contrato comun para el acceso a datos de la practica.
 *
 * @param <T>  tipo de la entidad (Producto, LoteCafe, Artesania...)
 * @param <ID> tipo del identificador de la entidad
 */
public interface Dao<T, ID> {

    /**
     * Devuelve la lista viva de entidades, apta para enlazarla directamente
     * a un TableView con {@code tabla.setItems(dao.listar())}.
     */
    ObservableList<T> listar();

    Optional<T> buscarPorId(ID id);

    void guardar(T entidad);

    /**
     * @return {@code true} si existia una entidad con ese id y fue reemplazada
     */
    boolean actualizar(ID id, T entidad);

    /**
     * @return {@code true} si existia una entidad con ese id y fue eliminada
     */
    boolean eliminar(ID id);
}
