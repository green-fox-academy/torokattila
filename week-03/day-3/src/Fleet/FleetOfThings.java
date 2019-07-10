package Fleet;

public class FleetOfThings {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Thing firstThing = new Thing("Get milk");
        Thing secondThing = new Thing("Remove obstacles");
        Thing thirdThing = new Thing("Stand up");
        thirdThing.complete();
        Thing fourthThing = new Thing("Eat lunch");
        fourthThing.complete();


        fleet.add(firstThing);
        fleet.add(secondThing);
        fleet.add(thirdThing);
        fleet.add(fourthThing);

        System.out.println(fleet);


    }

}
