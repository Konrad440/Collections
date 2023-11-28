import java.util.TreeSet;

public class ArtistExerciser extends Artist {
    public static void main(String[] args) {
        Artist hotPlate = new Artist();

        TreeSet<String> instruments1 = new TreeSet<>();
        instruments1.add("Piano");
        instruments1.add("Clarinet");
        instruments1.add("Hurdy Gurdy");
        instruments1.add("Tuba");
        hotPlate.addMember("Tom", instruments1);

        TreeSet<String> instruments2 = new TreeSet<>();
        instruments2.add("Guitar");
        instruments2.add("Saxophone");
        instruments2.add("Bas Drum");
        hotPlate.addMember("Steve", instruments2);
        printMemberInstruments(hotPlate, "Tom");
        printMemberInstruments(hotPlate, "Steve");
    }
    private static void printMemberInstruments(Artist artist, String memberName) {
        System.out.println("HotPlate band member " + memberName + " plays: ");
        for (String instrument: artist.getMemberInstruments(memberName)) {
            System.out.println('\t' + instrument);
        }
    }
}
