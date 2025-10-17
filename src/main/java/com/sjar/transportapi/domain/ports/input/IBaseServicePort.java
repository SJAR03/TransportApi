package com.sjar.transportapi.domain.ports.input;

import java.util.List;

public interface IBaseServicePort<T, ID> {
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
    T getById(ID id);
    List<T> getAll();
}
