public class MilitaryDictator extends Leader implements PowerActions {
    private String militaryRank;

    public MilitaryDictator(String leaderName, int leaderAge, int yearsInPower, String country, String militaryRank) {
        super(leaderName, leaderAge, yearsInPower, country);
        this.militaryRank = militaryRank;
    }


    @Override
    public String printDetails() {
        return ("\nThis is " + getLeaderName() + ", age " + getLeaderAge() + ", they are considered a military dictator" + "\n" + getLeaderName() + " has a rank of: " + getMilitaryRank() + ". they have led " + getCountry() + " with an iron fist for " + getYearsInPower() + " years.");
    }


    @Override
    String giveSpeech() {
        return (getLeaderName() + " is giving a speech about the military dominance of " + getCountry() + "!");
    }

    @Override
    public String implementPolicy(String policy) {
        return (getMilitaryRank() + " " + getLeaderName() + " is implementing a military policy: " + policy);
    }

    @Override
    public String repressOpposition() {
        return (getLeaderName() + " is repressing the opposition with a display of military might!");
    }

    @Override
    public String holdParade() {
        return ("Dictator " + getMilitaryRank() + " " + getLeaderName() + " is holding a parade!");
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }
}
