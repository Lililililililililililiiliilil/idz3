public class Meteorite {
    public String name;
    public int id;
    public String type;
    public String Mclass;
    public Double weight;
    public String isFall;
    public int year;
    public double latitude;
    public double longitude;
    public String coordinates;
    public Point new_coord;

    public Meteorite(String name, int id, String type, String Mclass, Double weight, String isFall, int year, double latitude, double longitude, String coordinates, Point new_coord) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.Mclass = Mclass;
        this.weight = weight;
        this.isFall = isFall;
        this.year = year;
        this.latitude = latitude;
        this.longitude = longitude;
        this.coordinates = coordinates;
        this.new_coord = new_coord;
    }

    public Meteorite() {
        this.name = "";
        this.id = 0;
        this.type = "";
        this.Mclass = "";
        this.weight = 0.0;
        this.isFall = "";
        this.year = 0;
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.coordinates = "";
    }

    public Meteorite(Meteorite u) {
        this(u.getName(), u.getId(), u.getType(), u.getMclass(), u.getWeight(), u.getIsFall(), u.getYear(), u.getLatitude(), u.longitude, u.getCoordinates(), u.getNew_coord());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMclass(String mclass) {
        this.Mclass = mclass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setIsFall(String isFall) {
        this.isFall = isFall;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
        this.new_coord = new Point(latitude);
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
        this.new_coord.setY(longitude);
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public Double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public Point getNew_coord() {
        return new_coord;
    }

    public String getIsFall() {
        return isFall;
    }

    public String getMclass() {
        return Mclass;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override

    public String toString(){
        return this.name + ", " + this.weight;
    }

}

