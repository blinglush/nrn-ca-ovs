package com.nrnca.service;

import com.nrnca.dao.CandidateDao;
import com.nrnca.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by shrestar on 2015-07-20.
 */
@Service("candidateService")
@Transactional
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateDao candidateDao;

    @Override
    public void saveCandidate(Candidate candidate) {
        candidateDao.saveCandidate(candidate);

    }

    @Override
    public void deleteCandidate(Candidate candidate) {

    }

    @Override
    public void editCandidate(Candidate candidate) {

    }

    @Override
    public List<Candidate> listAllCandidate() {
        return null;
    }

    @Override
    public List<Candidate> listAllActiveCandidate() {
        return null;
    }
}
