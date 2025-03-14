package codewars;

public class EquationSolver {

    public static int findIt(String s) {
        String[] parts = s.split("=");
        String leftSide = parts[0];
        String rightSideWithMod = parts[1];
        String rightSide = rightSideWithMod.split("\\(mod")[0].trim();
        int mod = Integer.parseInt(rightSideWithMod.split("\\(mod")[1].replace(")", "").trim());
        
        int coeffX = Integer.parseInt(leftSide.substring(0, leftSide.length() - 1));

        int reducedCoeffX = coeffX % mod;

        int rightValue = Integer.parseInt(rightSide);

        while (rightValue % reducedCoeffX != 0) {
            rightValue += mod;
            if (rightValue > 10000) {
                return -1;
            }
        }
        int xValue = rightValue / reducedCoeffX;
        return xValue;
    }
    public static void main(String[] args) {
        System.out.println(findIt("99X=1(mod 8)"));  // Вывод: 3
        System.out.println(findIt("145X=1(mod 10)")); // Вывод: -1
    }
}