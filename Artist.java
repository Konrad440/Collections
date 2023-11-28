import java.util.*;

public class Artist {
    private String name;
    private SortedSet<String> memberNames;
    private Map<String,SortedSet<String>> memberInstruments;

    // default constructor
    public Artist(){
        memberNames = new TreeSet();
        memberInstruments = new TreeMap();
    }
    public Artist(String name,SortedSet<String> memberNames, Map<String,SortedSet<String>> memberInstruments) {
        super();
        setName(name);
        this.memberNames = memberNames;
        this.memberInstruments = memberInstruments;
    }

    public Artist(String name){
        super();
        this.setName(name);
    }
    public void addMember(String name, SortedSet<String> instruments){
        memberNames.add(name);
        memberInstruments.put(name, instruments);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<String> getMemberNames() {
        return memberNames;
    }

    public void setMemberNames(SortedSet<String> memberNames) {
        this.memberNames = memberNames;
    }

    public SortedSet<String> getMemberInstruments(String memberName) {
        return memberInstruments.get(memberName);
    }

    public void setMemberInstruments(Map<String, SortedSet<String>> memberInstruments) {
        this.memberInstruments = memberInstruments;
    }
}

