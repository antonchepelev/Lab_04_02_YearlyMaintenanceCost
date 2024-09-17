public class Main {
    public static void main(String[] args) {
        //maintenance costs for every season

        double summerCost = 305.76;

        double fallCost = 474.14;

        double winterCost = 634.58;

        double springCost = 566.32;

        double totalCost = summerCost + fallCost + winterCost + springCost;

        System.out.println("These are the maintenance cost for the following months" +

                System.lineSeparator()+  //newline regardless of which system user is using

                "summer: "+summerCost+

                System.lineSeparator()+

                "fall: "+fallCost+

                System.lineSeparator()+

                "winter: "+winterCost+

                System.lineSeparator()+

                "spring: "+springCost+

                System.lineSeparator()+

                "The total yearly maintenance cost is: "+totalCost);
    }
}