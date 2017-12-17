package com.comek.springstarter.demo.interfaces;

import com.comek.springstarter.demo.model.Opinion;

import java.util.List;

public interface OpinionService {
    List<Opinion> getAllOpinions();

    void saveOpinion(Opinion opinion);
}
