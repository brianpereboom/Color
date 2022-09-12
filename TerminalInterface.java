package Color;
public class TerminalInterface {
    public static void main(String[] args) {
        try {
            switch (args[0]) {
                case "RGB": {
                    double[] hsv = ColorConverter.toHSV(Double.valueOf(args[1]), Double.valueOf(args[2]), Double.valueOf(args[3]));
                    System.out.println("HSV " + String.format("%.1f", hsv[0]) + " " + String.format("%.3f", hsv[1]) + " " + String.format("%.3f", hsv[2]));
                    break;
                }
                case "HSV": {
                    double[] rgb = ColorConverter.toRGB(Double.valueOf(args[1]), Double.valueOf(args[2]), Double.valueOf(args[3]));
                    System.out.println("RGB " + String.format("%.0f", rgb[0]) + " " + String.format("%.0f", rgb[1]) + " " + String.format("%.0f", rgb[2]));
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
