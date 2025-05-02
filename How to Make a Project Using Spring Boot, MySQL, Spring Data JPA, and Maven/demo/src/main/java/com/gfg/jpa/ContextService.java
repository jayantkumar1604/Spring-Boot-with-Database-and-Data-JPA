package com.gfg.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("contextService")
public class ContextService {

    @Autowired
    private ContextRepository contestRepository;

    public void test() {
        // Save a new contest
        Context geekContest = new Context();
        geekContest.setContestName("PremierLeague");
        geekContest.setContestDescription("Inviting Geeks To submit articles in plenty");

        contestRepository.save(geekContest);

        // Find a contest by ID
        Optional<Context> result = contestRepository.findById(1L);
        result.ifPresent(contest -> System.out.println(contest));

        // Find contest by contest name
        List<Context> contests = contestRepository.findByContestName("PremierLeague");
        contests.forEach(contest -> System.out.println(contest));

        // List all contests
        Iterable<Context> iterator = contestRepository.findAll();
        iterator.forEach(contest -> System.out.println(contest));

        // Count number of contest
        long countOfContest = contestRepository.count();
        System.out.println("Number of contest held: " + countOfContest);
    }
}