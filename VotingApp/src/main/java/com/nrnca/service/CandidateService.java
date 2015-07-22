package com.nrnca.service;

import com.nrnca.model.Candidate;

import java.util.List;

/**
 * Created by shrestar on 2015-07-20.
 */
public interface CandidateService {

    public void saveCandidate(Candidate candidate);

    public void deleteCandidate(Candidate candidate);

    public void editCandidate(Candidate candidate);

    public List<Candidate> listAllCandidate();

    public List<Candidate> listAllActiveCandidate();
}
