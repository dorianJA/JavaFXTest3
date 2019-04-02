package sample;

public class Person {

    private String name;
    private String country;

    private Integer ballControl;
    private Integer hit;
    private Integer defense;
    private Integer playerNumber;
    private Integer games;
    private Integer goals;
    private boolean ready;



    public Integer getBallControl() {
        return ballControl;
    }

    public Integer getHit() {
        return hit;
    }

    public Integer getDefense() {
        return defense;
    }

    public String getCountry() {
        return country;
    }

    public void setBallControl(Integer ballControl) {
        this.ballControl = ballControl;
    }

    public Integer getGames() {
        return games;
    }

    public Integer getGoals() {
        return goals;
    }


    public Person(String name, Integer ballControl, Integer hit, Integer defense, String country, Integer playerNumber, Integer games, Integer goals){
        this.name = name;
        this.ballControl = ballControl;
        this.hit = hit;
        this.defense = defense;
        this.country = country;
        this.playerNumber = playerNumber;
        this.games = games;
        this.goals = goals;
        ready = false;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayerNumber() {
        return playerNumber;
    }

    public int avr(){
        return (ballControl+hit+defense)/3;
    }

    @Override
    public String toString() {
        return
                "'" + name + '\'' +
                ", avrSkill=" + avr()
                ;
    }
}
