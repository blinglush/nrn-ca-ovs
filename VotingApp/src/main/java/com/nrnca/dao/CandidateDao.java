package com.nrnca.dao;

import com.nrnca.model.Candidate;
import com.nrnca.model.Contact;

import java.util.List;

/**
 * Created by shrestar on 2015-07-17.
 */
public interface CandidateDao {

    public void saveCandidate(Candidate candidate);

    public void deleteCandidate(Candidate candidate);

    public void editCandidate(Candidate candidate);

    public List<Candidate> listAllCandidate();

    public List<Candidate> listAllActiveCandidate();


}
