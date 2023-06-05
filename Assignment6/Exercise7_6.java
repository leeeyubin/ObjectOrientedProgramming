import java.util.*;
class Location{
    private int longitude, latitude;
    public Location(int longitude, int latitude){
        this.longitude = longitude; this.latitude = latitude;
    }
    public int getLongitude(){
        return longitude;
    }
    public int getLatitude(){
        return latitude;
    }
}
public class Exercise7_6  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> hs = new HashMap<>(4);
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i = 0; i<4; i++) {
            System.out.print(">> ");
            String input = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(input, ",");
            String cityName = st.nextToken().trim();
            int longitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());
            hs.put(cityName, new Location(longitude, latitude));
        }
        System.out.println("------------------------");
        Set<String> key = hs.keySet();
        Iterator<String> it = key.iterator();
        while(it.hasNext()){
            String cityName = it.next();
            Location location = hs.get(cityName);
            System.out.print(cityName + " ");
            System.out.print(location.getLongitude() + " ");
            System.out.println(location.getLatitude());
        }
        System.out.println("------------------------");
        while(true){
            System.out.print("도시 이름 >> ");
            String search = scanner.nextLine();
            Location location = hs.get(search);
            if(search.equals("그만"))
                break;
            else if(location == null)
                System.out.println(search +"는 없습니다.");
            else
                System.out.println(search + " " + location.getLongitude() + " " + location.getLatitude());
        }
        scanner.close();
    }

}
