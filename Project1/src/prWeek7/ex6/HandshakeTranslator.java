package prWeek7.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandshakeTranslator {
    private List<Handshake> handshakes = Handshakes.getHandshakes();

    public List<String> translateIntoMoves(Integer number) {
        List<String> moves = new ArrayList<>();
        List<Integer> digits = Stream.of(number.toString().split("")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());
        for (Integer digit : digits) {
              if(getSecretHandshake(digit).isPresent()){
                  moves.add(getSecretHandshake(digit).get());
              }
        }
        return moves;
    }
    private Optional<String> getSecretHandshake(Integer digit){
        for (Handshake handshake : handshakes) {
            if(handshake.isRightHandshake(digit)){
                return Optional.of(handshake.getHandshake());
            }
        }
        return Optional.empty();
    }

}
