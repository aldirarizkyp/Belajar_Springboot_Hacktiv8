public class SwitchNew {
    public static void main(String[] args) {
        String day = "F";
        String result = switch(day)
        {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            case "" -> "Please insert valid day.";
            default -> "Looks like a Sunday.";
            
        };
        System.out.println(result);
    }
}
