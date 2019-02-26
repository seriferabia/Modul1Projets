package prWeek7.ex8;

import java.util.Optional;

public class NumeralIterator {

    public String addTimes(Integer times, String character) {
        String result = "";
        for (int time = 0; time < times; time++) {
            result += character;
        }
        return result;
    }

    public Optional<String> addTimes(Integer times, String oneChar, String fiveChar, String tenChar) {
        if (times == 0) {
            return Optional.of("");
        }
        if (times.toString().matches("[123]")) {
            return Optional.of(addTimes(times, oneChar));
        }
        if (times == 4) {
            return Optional.of(oneChar + fiveChar);
        }
        if (times.toString().matches("[5678]")) {
            return Optional.of(fiveChar + addTimes(times - 5, oneChar));
        }
        if (times == 9) {
            return Optional.of(oneChar + tenChar);
        }
        return Optional.empty();
    }
}

