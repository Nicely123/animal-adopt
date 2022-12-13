package com.annsl.service;

import com.annsl.domain.Denote;

import java.util.List;

public interface DenoteService {
    int addDenote(Denote denote);
    int deleteById(Integer id);
    Denote getById(Integer id);
    List<Denote> getAll();
    int update(Denote denote);
}
