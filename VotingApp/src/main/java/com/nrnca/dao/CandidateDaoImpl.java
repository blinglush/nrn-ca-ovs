package com.nrnca.dao;

import com.nrnca.model.Candidate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shrestar on 2015-07-20.
 */
@Repository("candidateDao")
public class CandidateDaoImpl extends AbstractDao implements CandidateDao {


    @Override
    public void saveCandidate(Candidate candidate) {
        persist(candidate);

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
