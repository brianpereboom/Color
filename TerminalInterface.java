package Color;
public class TerminalInterface {
    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "RGB": {
                    double[] hsv = ColorConverter.toHSV(Double.valueOf(args[1]), Double.valueOf(args[2]), Double.valueOf(args[3]));
                    System.out.printf("HSV %.1f %.3f %.3f\n", hsv[0], hsv[1], hsv[2]);
                    break;
                }
                case "HSV": {
                    double[] rgb = ColorConverter.toRGB(Double.valueOf(args[1]), Double.valueOf(args[2]), Double.valueOf(args[3]));
                    System.out.printf("RGB %.0f %.0f %.0f\n", rgb[0], rgb[1], rgb[2]);
                    break;
                }
                default:
                    System.out.println("Invalid arguments.");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
            
    }
}
