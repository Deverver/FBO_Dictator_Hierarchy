public class PoliticalDictator extends Leader implements PowerActions {
    private String partyName;
    private String partyRank;

    public PoliticalDictator(String leaderName, int leaderAge, int yearsInPower, String country, String partyName, String partyRank) {
        super(leaderName, leaderAge, yearsInPower, country);
        this.setPartyName(partyName);
        this.setPartyRank(partyRank);
    }

    @Override
    public String printDetails() {
        return ("\nThis is " + getPartyRank() + " " + getLeaderName() + ", age " + getLeaderAge() + ", they are considered a political dictator" + "\n" + getLeaderName() + " has been leading the " + getPartyName() + " of " + getCountry() + " for " + getYearsInPower() + " years.");
    }

    @Override
    String giveSpeech() {
        return (getLeaderName() + " gives a speech! they want the " + getPartyName() + " to create more wealth for the rich!");
    }

    @Override
    public String implementPolicy(String policy) {
        return (getLeaderName() + " of the " + getPartyName() + " is implementing a new policy: " + policy);
    }

    @Override
    public String repressOpposition() {
        return (getLeaderName() + " is repressing the opposition by political campaigns");
    }

    @Override
    public String holdParade() {
        return ("Dictator " + getPartyRank() + " " + getLeaderName() + " of the " + getPartyName() + " is holding a parade!");
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyRank() {
        return partyRank;
    }

    public void setPartyRank(String partyRank) {
        this.partyRank = partyRank;
    }
}

