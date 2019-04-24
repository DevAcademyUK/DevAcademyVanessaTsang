package inheritance;

public class handleBars extends vehicle {

        public void steer(String dir) {
            System.out.println("I can turn " + dir +
                    " by turning my handles " + dir +
                    " and leaning");
        }
    }
