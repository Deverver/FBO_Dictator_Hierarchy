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
        return ("\nThis is " + getPartyRank() + " " + getLeaderName() + ", age " + getLeaderAge() + ", they are considered a political dictator" + "\n" + getLeaderName() + " has been leading the " + getPartyName() + " 'party' of " + getCountry() + " for " + getYearsInPower() + " years.");
    }

    @Override
    String giveSpeech() {
        return (getLeaderName() + " wants the " + getPartyName() + " to create more wealth for the rich!");
    }

    @Override
    public String implementPolicy(String policy) {
        return ("");
    }

    @Override
    public String repressOpposition() {
        return ("");
    }

    @Override
    public String holdParade() {
        return ("");
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
