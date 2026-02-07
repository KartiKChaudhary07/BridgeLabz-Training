import java.util.*;

class Vessel {

    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    public Vessel() { }
    public Vessel(String vesselId,
                  String vesselName,
                  double averageSpeed,
                  String vesselType) {

        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }
    
    public String getVesselId() {
        return vesselId;
    }

    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}
class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String vesselId) {

        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(vesselId)) {
                return v;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();

        double maxSpeed = 0;
        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() > maxSpeed) {
                maxSpeed = v.getAverageSpeed();
            }
        }

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == maxSpeed) {
                result.add(v);
            }
        }

        return result;
    }
}

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] data = input.split(":");

            String id = data[0];
            String name = data[1];
            double speed = Double.parseDouble(data[2]);
            String type = data[3];

            Vessel v = new Vessel(id, name, speed, type);
            util.addVesselPerformance(v);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel found = util.getVesselById(searchId);

        if (found != null) {
            System.out.println(
                found.getVesselId() + " | " +
                found.getVesselName() + " | " +
                found.getVesselType() + " | " +
                found.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println(
                "Vessel Id " + searchId + " not found"
            );
        }

        System.out.println("High performance vessels are");

        List<Vessel> highList =
            util.getHighPerformanceVessels();

        for (Vessel v : highList) {
            System.out.println(
                v.getVesselId() + " | " +
                v.getVesselName() + " | " +
                v.getVesselType() + " | " +
                v.getAverageSpeed() + " knots"
            );
        }
    }
}
