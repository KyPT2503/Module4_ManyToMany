package library_manager.service;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAll();

    E findById(long id);

    E update(long id, E e);

    boolean remove(long id);

    E save(E e);
}
