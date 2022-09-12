package Color;
interface ColorConverter {

  public static double[] toRGB(double hue, double saturation, double value) {
    double h = hue / 60;
    double s = saturation;
    double v = 255 * value;

    double c = s * v;
    double m = v - c;
    double x = c * (1 - Math.abs((h % 2) - 1));

    double[] rgb = {m, m, m};

    if (h < 1) { rgb[0] += c; rgb[1] += x; }
    else if (h < 2) { rgb[0] += x; rgb[1] += c; }
    else if (h < 3) { rgb[1] += c; rgb[2] += x; }
    else if (h < 4) { rgb[1] += x; rgb[2] += c; }
    else if (h < 5) { rgb[0] += x; rgb[2] += c; }
    else if (h < 6) { rgb[0] += c; rgb[2] += x; }

    return rgb;

  }
  public static double[] toHSV(double red, double green, double blue) {

    double r = red / 255;
    double g = green / 255;
    double b = blue / 255;

    double min = Math.min(Math.min(r, g), b);

    double[] hsv = {60, 0, Math.max(Math.max(r, g), b)};

    hsv[1] = (hsv[2] == 0) ? 0 : 1 - min / hsv[2];

    hsv[0] = 60 * (
        (hsv[2] == min) ? Double.NaN :
        (hsv[2] == r) ? (g - b) / (hsv[2] - min) + ((g < b) ? 6 : 0) :
        (hsv[2] == g) ? (b - r) / (hsv[2] - min) + 2:
        (r - g) / (hsv[2] - min) + 4
    );
    
    return hsv;
  }
}