import java.util.ArrayList;

public class Game {
    private ArrayList<Team> teams;
    private String result;
    private ArrayList<Team> results;
    public Integer term;

    public Game(Integer term) {
        this.term = term;
        this.teams = new ArrayList<>();
        this.results = new ArrayList<>();
    }

    public Integer getTerm() {
        return term;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public ArrayList<Team> getTeams() {
        return this.teams;
    }

    public boolean hasTeams() {
        return teams.size() > 0;
    }
}




