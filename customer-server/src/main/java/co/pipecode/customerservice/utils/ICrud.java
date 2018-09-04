package co.pipecode.customerservice.utils;

import java.util.List;

public interface ICrud<T, ID> {

	T create(T domain);

	T update(T domain);

	T delete(ID id);

	List<T> findAll();

	T findById(ID id);

}
