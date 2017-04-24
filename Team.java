/**
 * Created by shrijana on 3/8/2017.
 */
public class Team {
    private String name;
    private String logo;
    private Player PlayerNumber;

    public Team(String name, String logo, Player PlayerNumber){
        this.name = name;
        this.logo = logo;
        this.PlayerNumber = PlayerNumber;
    }

    public void Goal(int noOfGoals) {
        System.out.println(" The player" + getName() + " scores " + noOfGoals + " number of goals.");
    }

    public void Place() {
        System.out.print("The player" + getName() + " belongs to Argentina.");
    }


    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public Player getPlayerNumber() {
        return PlayerNumber;
    }
}
