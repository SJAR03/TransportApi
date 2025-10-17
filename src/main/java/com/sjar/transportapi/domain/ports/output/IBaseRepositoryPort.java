package com.sjar.transportapi.domain.ports.output;

import java.util.List;
import java.util.Optional;

public interface IBaseRepositoryPort<T, ID> {
    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void delete(ID id);
}
