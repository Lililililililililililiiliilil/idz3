import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Boundary AUS_boundary = new Boundary(ContinentsCoords.getAUS_coord());
        Boundary SA_boundary = new Boundary(ContinentsCoords.getSA_coord());
        Boundary NA1_boundary = new Boundary(ContinentsCoords.getNA1_coord());
        Boundary NA2_boundary = new Boundary(ContinentsCoords.getNA2_coord());
        Boundary EU_boundary = new Boundary(ContinentsCoords.getEU_coord());
        Boundary AFR_boundary = new Boundary(ContinentsCoords.getAFR_coord());
        Boundary AS1_boundary = new Boundary(ContinentsCoords.getAS1_coord());
        Boundary AS2_boundary = new Boundary(ContinentsCoords.getAS2_coord());
        Boundary ANT_boundary = new Boundary(ContinentsCoords.getANT_coord());


        ArrayList<Meteorite> meteorites = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("data_meteorite.txt"));
        String temp;
        int i = 0;
        Meteorite mt = new Meteorite();
        while ((temp = reader.readLine()) != null) {
            if (i % 10 == 0) {
                mt.setName(temp);
            }
            if (i % 10 == 1) {
                mt.setId(Integer.parseInt(temp));
            }
            if (i % 10 == 2) {
                mt.setType(temp);
            }
            if (i % 10 == 3) {
                mt.setMclass(temp);
            }
            if (i % 10 == 4) {
                mt.setWeight(Double.parseDouble(temp));
            }
            if (i % 10 == 5) {
                mt.setIsFall(temp);
            }
            if (i % 10 == 6) {
                mt.setYear(Integer.parseInt(temp));
            }
            if (i % 10 == 7) {
                mt.setLatitude(Double.parseDouble(temp));
            }
            if (i % 10 == 8) {
                mt.setLongitude(Double.parseDouble(temp));
            }
            if (i % 10 == 9) {
                mt.setCoordinates(temp);
                meteorites.add(new Meteorite(mt));


            }
            i += 1;
        }


        ArrayList<Meteorite> AUS = new ArrayList<>();
        ArrayList<Meteorite> EU = new ArrayList<>();
        ArrayList<Meteorite> AFR = new ArrayList<>();
        ArrayList<Meteorite> NA = new ArrayList<>();
        ArrayList<Meteorite> SA = new ArrayList<>();
        ArrayList<Meteorite> AS = new ArrayList<>();
        ArrayList<Meteorite> ANT = new ArrayList<>();
        ArrayList<Meteorite> OC = new ArrayList<>();


        for (Meteorite meteor : meteorites) {
            if (AUS_boundary.contains(meteor.getNew_coord())) {
                AUS.add(meteor);
            } else if (SA_boundary.contains(meteor.getNew_coord())) {
                SA.add(meteor);
            } else if (NA1_boundary.contains(meteor.getNew_coord()) || NA2_boundary.contains(meteor.getNew_coord())) {
                NA.add(meteor);
            } else if (EU_boundary.contains(meteor.getNew_coord())) {
                EU.add(meteor);
            } else if (AFR_boundary.contains(meteor.getNew_coord())) {
                AFR.add(meteor);
            } else if (AS1_boundary.contains(meteor.getNew_coord()) || AS2_boundary.contains(meteor.getNew_coord())) {
                AS.add(meteor);
            } else if (ANT_boundary.contains(meteor.getNew_coord())) {
                ANT.add(meteor);
            } else {
                OC.add(meteor);
            }
        }

        long fallen = AUS.stream().filter(x -> x.isFall.equals("Fell")).count();

        System.out.println(fallen);
        System.out.println(AUS.size());
        System.out.println(AUS);

        OptionalDouble avg = AUS.stream().mapToDouble(x -> x.weight).average();

        System.out.println(avg);

        OptionalDouble min_weight = AUS.stream().mapToDouble(x -> x.weight).min();
        OptionalDouble max_weight = AUS.stream().mapToDouble(x -> x.weight).max();
        String min_weight_name = AUS.stream().filter(x -> x.weight.equals(min_weight.getAsDouble())).collect(Collectors.toCollection(ArrayList::new)).get(0).getName();
        System.out.println(min_weight);
        System.out.println(max_weight);
        System.out.println(min_weight_name);
    }
}


