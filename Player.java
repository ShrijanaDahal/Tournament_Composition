/**
 * Created by shrijana on 3/8/2017.
 */
public class Player {
    private String name;
    private String belongingPlace;

    public Player(String name, String belongingPlace){
        this.name = name;
        this.belongingPlace = belongingPlace;
    }

    public String getName() {

        return name;
    }

    public String getBelongingPlace() {
        return belongingPlace;
    }
}
