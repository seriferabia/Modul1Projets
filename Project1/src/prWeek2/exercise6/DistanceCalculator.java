package prWeek2.exercise6;

public class DistanceCalculator {

    public Double calculateDistance(Coordinate coordinate1, Coordinate coordinate2){

        double radius = 6371.01;
        // convert to radian
        double lat1 = Math.toRadians(coordinate1.getLatitude());
        double lon1 = Math.toRadians(coordinate1.getLongitude());
        double lat2 = Math.toRadians(coordinate2.getLatitude());
        double lon2 = Math.toRadians(coordinate2.getLongitude());

        double formula1 = Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2);

        Double distance = radius*Math.acos(formula1);
        return distance;
    }
}
