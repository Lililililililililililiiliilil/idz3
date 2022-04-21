import java.util.Arrays;
import java.util.List;

public class ContinentsCoords {
    public static List<Point> AUS_coord = Arrays.asList(new Point(-11.88, 110), new Point(-10.27, 140), new Point(-10, 145), new Point(-30, 161.25), new Point(-52.5, 142.5), new Point(-31.88, 110));

    public static List<Point> SA_coord = Arrays.asList(new Point(1.25, -105), new Point(1.25, -82.5), new Point(15, -75), new Point(15, -30), new Point(-60, -30), new Point(-60, -105));

    public static List<Point> NA1_coord = Arrays.asList(new Point(90.0, -168.75), new Point(90.0, -10.0), new Point(78.13, -10.0), new Point(57.5, -37.5), new Point(15.0, -30.0), new Point(15.0, -75.0), new Point(1.25, -82.5), new Point(1.25, -105.0), new Point(51.0, -180.0), new Point(60.0, -180.0), new Point(60.0, -168.75));
    public static List<Point> NA2_coord = Arrays.asList(new Point(51.0, 166.6), new Point(51.0, 180.0), new Point(60.0, 180.0));

    public static List<Point> EU_coord = Arrays.asList(new Point(90.0, -10.0), new Point(90.0, 77.5), new Point(42.5, 48.8), new Point(42.5, 30.0), new Point(40.79, 28.81), new Point(41.0, 29.0), new Point(40.55, 27.31), new Point(40.4, 26.75), new Point(40.05, 26.36), new Point(39.17, 25.19), new Point(35.46, 27.91), new Point(33.0, 27.5), new Point(38.0, 10.0), new Point(35.42, -10.0), new Point(28.25, -13.0), new Point(15.0, -30.0), new Point(57.5, -37.5), new Point(78.13, -10.0));

    public static List<Point> AFR_coord = Arrays.asList(new Point(15.0, -30.0), new Point(28.25, -13.0), new Point(35.42, -10.0), new Point(38.0, 10.0), new Point(33.0, 27.5), new Point(31.74, 34.58), new Point(29.54, 34.92), new Point(27.78, 34.46), new Point(11.3, 44.3), new Point(12.5, 52.0), new Point(-60.0, 75.0), new Point(-60.0, -30.0));

    public static List<Point> AS1_coord = Arrays.asList(new Point(90.0, 77.5), new Point(42.5, 48.8), new Point(42.5, 30.0), new Point(40.79, 28.81), new Point(41.0, 29.0), new Point(40.55, 27.31), new Point(40.4, 26.75), new Point(40.05, 26.36), new Point(39.17, 25.19), new Point(35.46, 27.91), new Point(33.0, 27.5), new Point(31.74, 34.58), new Point(29.54, 34.92), new Point(27.78, 34.46), new Point(11.3, 44.3), new Point(12.5, 52.0), new Point(-60.0, 75.0), new Point(-60.0, 110.0), new Point(-31.88, 110.0), new Point(-11.88, 110.0), new Point(-10.27, 140.0), new Point(33.13, 140.0), new Point(51.0, 166.6), new Point(60.0, 180.0), new Point(90.0, 180.0));
    public static List<Point> AS2_coord = Arrays.asList(new Point(90.0, -180.0), new Point(90.0, -168.75), new Point(60.0, -168.75), new Point(60.0, -180.0));

    public static List<Point> ANT_coord = Arrays.asList(new Point(-60.0, -180.0), new Point(-60.0, 180.0), new Point(-90.0, 180.0), new Point(-90.0, -180.0));


    public static List<Point> getAUS_coord() {
        return AUS_coord;
    }

    public static List<Point> getAFR_coord() {
        return AFR_coord;
    }

    public static List<Point> getANT_coord() {
        return ANT_coord;
    }

    public static List<Point> getAS1_coord() {
        return AS1_coord;
    }

    public static List<Point> getAS2_coord() {
        return AS2_coord;
    }

    public static List<Point> getEU_coord() {
        return EU_coord;
    }

    public static List<Point> getNA1_coord() {
        return NA1_coord;
    }

    public static List<Point> getNA2_coord() {
        return NA2_coord;
    }

    public static List<Point> getSA_coord() {
        return SA_coord;
    }
}
