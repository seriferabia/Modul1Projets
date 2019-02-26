package prWeek11.ex1;

import java.time.*;

public class Timetable {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.parse("2003-03-13");
        LocalTime startTime = LocalTime.parse("10:00:00");
        LocalDateTime start = LocalDateTime.of(startDate, startTime);

        System.out.println("Beginning of timetable: " + start);
        System.out.println("When did Mugatu wake up : " + startTime);
        System.out.println("What day of the week is this: " + start.getDayOfWeek());

        LocalTime timeToBePickedUp = startTime.plusMinutes(37).plusSeconds(21);
        System.out.println("What time is it when Mugatu is ready to be picked up: " + timeToBePickedUp);

        LocalTime timeToArriveAtAirport = timeToBePickedUp.plusHours(1).plusMinutes(30);
        System.out.println("What time do they arrive at the airport: " + timeToArriveAtAirport);

        LocalTime departureTime = LocalTime.parse("11:04");
        boolean hasMissedFlight = departureTime.isBefore(timeToArriveAtAirport);
        System.out.println("Did Mugatu miss his flight: " + hasMissedFlight);

        LocalTime timeOfNextFlight = LocalTime.parse("18:45");
        Duration waitingTime = Duration.between(timeToArriveAtAirport, timeOfNextFlight);
        long waitingHours = waitingTime.toHours();
        long waitingMinutes = waitingTime.minusHours(waitingHours).toMinutes();
        System.out.println("Mugatu has to wait " + waitingHours + " hours and " + waitingMinutes + " minutes");

        LocalDateTime dateTimeOfDepartureFromLondon = LocalDateTime.of(startDate, timeOfNextFlight);
        LocalDateTime dateAndTimeInLondonWhenHeLanded = dateTimeOfDepartureFromLondon.plusHours(11).plusMinutes(50);
        System.out.println("Time in London when he landed: " + dateAndTimeInLondonWhenHeLanded);
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime inLondon = dateAndTimeInLondonWhenHeLanded.atZone(london);
        ZonedDateTime dateTimeInTokyoWhenHeLanded = inLondon.withZoneSameInstant(tokyo);
        System.out.println("Time in Tokyo when he landed: " + dateTimeInTokyoWhenHeLanded);

        LocalDateTime wakingTimeInTokyo = dateTimeInTokyoWhenHeLanded.toLocalDateTime().plusHours(11);
        System.out.println("When did he wake up in Tokyo: " + wakingTimeInTokyo);

        LocalDateTime shootingStartingTime = wakingTimeInTokyo.plusMinutes(47);
        System.out.println("The advertisement shooting starts at: " + shootingStartingTime.toLocalTime());

        Duration totalDurationToGetReadyInLimousine = Duration.ofMinutes(47).minusSeconds(546);
        long travelTimeInMinutes = totalDurationToGetReadyInLimousine.toMinutes();
        long travelTimeInSeconds = totalDurationToGetReadyInLimousine.minusMinutes(travelTimeInMinutes).getSeconds();
        System.out.println("He has " + travelTimeInMinutes + " minutes and " + travelTimeInSeconds + " seconds to prepare in limousine");

        LocalDateTime shootingEndTime = shootingStartingTime.plusHours(7);
        System.out.println("Advertisement shooting ends at: " + shootingEndTime.toLocalTime());

        Duration durationAfterShooting = Duration.ofDays(3).plusHours(12);
        Duration durationOfFlightToLondon = Duration.ofHours(11).plusMinutes(50);
        LocalDateTime timeInTokyoWhenHeLandedInLondon = shootingEndTime.plus(durationAfterShooting).plus(durationOfFlightToLondon);
        System.out.println("What time is it in Tokyo when he landed in London: " + timeInTokyoWhenHeLandedInLondon);
        ZonedDateTime zonedDateTimeForTokyo = timeInTokyoWhenHeLandedInLondon.atZone(tokyo);
        ZonedDateTime timeInLondonWhenHeLandedInLondon = zonedDateTimeForTokyo.withZoneSameInstant(london);
        System.out.println("What time is it in London when he landed in London: " + timeInLondonWhenHeLandedInLondon.toLocalDateTime());

        Duration timeDurationForFans = Duration.ofSeconds(173 * 12);
        long hoursForFans = timeDurationForFans.toHours();
        long minutesForFans = timeDurationForFans.minusHours(hoursForFans).toMinutes();
        System.out.println("Mugatu spent " + hoursForFans + " hours and " + minutesForFans + " minutes for his fans");

        LocalDateTime timeWhenHeArrivedHisHotel = timeInLondonWhenHeLandedInLondon.toLocalDateTime().plusSeconds(173 * 12).plusHours(1);
        System.out.println("What time is it when he arrived to his hotel: " + timeWhenHeArrivedHisHotel);
        boolean isSaunaOpenAtThatTime = (timeWhenHeArrivedHisHotel.toLocalTime().isAfter(LocalTime.of(9,0))
                &&timeWhenHeArrivedHisHotel.toLocalTime().isBefore(LocalTime.of(14,0)))
                ||(timeWhenHeArrivedHisHotel.toLocalTime().isAfter(LocalTime.of(16,0))
                &&timeWhenHeArrivedHisHotel.toLocalTime().isBefore(LocalTime.of(20,0)));
        System.out.println("Can he manage to enter the sauna: "+ isSaunaOpenAtThatTime);
        DayOfWeek dayOfWeek = timeWhenHeArrivedHisHotel.getDayOfWeek();
        System.out.println("What day of the week is this: " + dayOfWeek);
        System.out.println("Is Mugatu lucky enough to get the special one-hour massage: "
                + (dayOfWeek.equals(DayOfWeek.THURSDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)));

        LocalDateTime oneWeekLater = timeWhenHeArrivedHisHotel.plusWeeks(1);
        LocalDateTime broadcastTimeInTokyo = LocalDateTime.of(oneWeekLater.toLocalDate(),LocalTime.of(18,30));
        ZonedDateTime broadcastTimeTokyo = broadcastTimeInTokyo.atZone(tokyo);
        LocalDateTime broadcastTimeInLondon = broadcastTimeTokyo.withZoneSameInstant(london).toLocalDateTime();
        System.out.println("Mugatu has to turn on the TV in London at: " +broadcastTimeInLondon.toLocalTime());
        LocalDateTime timeOfPhoneCallFromManager = broadcastTimeInLondon.plusSeconds(29).plusSeconds(15);
        System.out.println("Manager called Mugatu exactly at: "+timeOfPhoneCallFromManager.toLocalTime());
        System.out.println("What day of the week is this: " + timeOfPhoneCallFromManager.getDayOfWeek());

        Duration timeTable = Duration.between(start,timeOfPhoneCallFromManager);
        System.out.println("How many days have passed by since the beginning of the timetable: "+timeTable.toDays());

        long totalMinutesForGettingPaid = timeTable.minusSeconds(546).toMinutes();
        System.out.println("How much is Mugatu paid for this reportage: "+totalMinutesForGettingPaid*1.39);

    }
}
