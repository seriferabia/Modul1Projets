package prWeek6.ex1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallHotAirBalloon = new SmallHotAirBalloon();
        System.out.println("----Small Hot Air Balloon----");
        smallHotAirBalloon.liftUp();
        smallHotAirBalloon.land();
        BigHotAirBalloon bigHotAirBalloon = new BigHotAirBalloon();
        System.out.println("----Big Hot Air Balloon----");
        bigHotAirBalloon.liftUp();
        bigHotAirBalloon.land();
        System.out.println("----Small----");
        HotAirBalloon small = smallHotAirBalloon;
        small.liftUp();
        small.land();
        System.out.println("----Big----");
        HotAirBalloon big = bigHotAirBalloon;
        big.liftUp();
        big.land();

    }
}
