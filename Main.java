/**
 * Created by shrijana on 3/8/2017.
 */
        public class Main {

                public static void main(String[] args) {

                    Player PlayerNumber = new Player(" Messi ", "Argentina");
                    Team tour = new Team(" Messi ", "Blue", PlayerNumber);

                    Tournament T = new Tournament(tour);
                    T.getWholeTeam().Goal(6  );
                    T.getWholeTeam().Place();


    }
}
