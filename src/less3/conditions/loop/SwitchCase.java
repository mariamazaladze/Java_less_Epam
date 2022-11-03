package less3.conditions.loop;

public class SwitchCase {





        public static int defineLevel(String role) {
            return switch (role) {
                case "guest" -> 0;
                case "client" -> 1;
                case "moderator" -> 2;
                case "admin" -> 3;
                default -> {
                    System.out.println("non-authentic role = " + role);
                    yield -1;
                }
            };
        }

    public static void main(String[] arg) {
        int value = 1;
        switch (value) {
            case 1 -> System.out.println("1, 2, 3 or 4");
            case 777 ->  System.out.println("Range: " + value);
            case 0 ->  System.out.println("0");
            default -> System.out.println("Default");
        }

        String day = new String("SAT");
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU": System.out.println("Time to work");
                break;
            case "FRI": System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN": System.out.println("Weekend!");
                break;
            default: System.out.println("Invalid day?");
        }

    }


}
