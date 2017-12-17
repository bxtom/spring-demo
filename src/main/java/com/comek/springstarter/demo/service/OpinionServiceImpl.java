package com.comek.springstarter.demo.service;

import com.comek.springstarter.demo.interfaces.OpinionService;
import com.comek.springstarter.demo.model.Opinion;
import com.comek.springstarter.demo.repository.OpinionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionServiceImpl implements OpinionService {
    @Autowired
    private OpinionsRepository opinionsRepository;

    @Override
    public List<Opinion> getAllOpinions() {
        return opinionsRepository.findAll();
    }

    @Override
    public void saveOpinion(Opinion opinion) {
        opinionsRepository.save(opinion);
    }
}
