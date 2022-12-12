package com.annsl.dao;

import com.annsl.domain.Adopt;

import java.util.List;

public interface AdoptDao {

    int addAdopt(Adopt adopt);
    int deleteById(Integer id);
    Adopt getById(Integer id);
    List<Adopt> getAll();
    int update(Adopt adopt);

}
