package prWeek7.groupEx;


public class NameToVortex {
    private VortexNumber vortexNumber = new VortexNumber();

    public Integer convertToVortex(String name) {
        Integer asciiCodeOfName = getAsciiCodeOf(name);
        return vortexNumber.calculateVortexNumber(asciiCodeOfName);
    }


    private Integer getAsciiCodeOf(String name) {
        String[] split = name.split("");
        int sum = 0;
        for (String letter : split) {
            int ascii = (int)letter.charAt(0);
            sum += ascii;
        }
        return sum;
    }
}
