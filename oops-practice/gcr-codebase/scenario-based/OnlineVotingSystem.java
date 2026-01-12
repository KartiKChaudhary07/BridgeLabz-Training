import java.util.*;

abstract class ElectionService {
    abstract void registerVoter(Voter v);
    abstract void addCandidate(Candidate c);
    abstract void castVote(int voterId, int candidateId) throws DuplicateVoteException;
    abstract void showResult();
}

class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String msg) {
        super(msg);
    }
}

class Voter {
    int id;
    String name;
    boolean hasVoted = false;

    Voter(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Candidate {
    int id;
    String name;
    int votes = 0;

    Candidate(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Election extends ElectionService {
    Map<Integer, Voter> voters = new HashMap<>();
    Map<Integer, Candidate> candidates = new HashMap<>();

    void registerVoter(Voter v) {
        voters.put(v.id, v);
        System.out.println("Voter Registered: " + v.name);
    }

    void addCandidate(Candidate c) {
        candidates.put(c.id, c);
        System.out.println("Candidate Added: " + c.name);
    }

    void castVote(int voterId, int candidateId) throws DuplicateVoteException {
        Voter v = voters.get(voterId);
        if (v.hasVoted)
            throw new DuplicateVoteException("Voter has already voted!");

        Candidate c = candidates.get(candidateId);
        c.votes++;
        v.hasVoted = true;
        System.out.println(v.name + " voted for " + c.name);
    }

    void showResult() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidates.values()) {
            System.out.println(c.name + " -> " + c.votes + " votes");
        }
    }
}

public class OnlineVotingSystem {
    public static void main(String[] args) {
        try {
            Election election = new Election();

            Voter v1 = new Voter(1, "Kartik");
            Voter v2 = new Voter(2, "Rahul");

            Candidate c1 = new Candidate(101, "Amit");
            Candidate c2 = new Candidate(102, "Neha");

            election.registerVoter(v1);
            election.registerVoter(v2);

            election.addCandidate(c1);
            election.addCandidate(c2);

            election.castVote(1, 101);
            election.castVote(2, 102);

            // election.castVote(1, 102); // will throw DuplicateVoteException

            election.showResult();

        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }
    }
}
