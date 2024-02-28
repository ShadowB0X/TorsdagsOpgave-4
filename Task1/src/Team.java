public class Team {
    private String teamName;
    private int rank;
    private String name;
Team(String teamName, int rank, String name){
    this.teamName = teamName;
    this.rank = rank;
    this.name = name;
}

public void setRank(int rank){
    this.name = name;
}


    @Override
    public String toString() {
        return "Hold: " + teamName + " Rank: " + rank + " navn: " + name;
    }
}
