public abstract class Leader {
    private String leaderName;
    private int leaderAge;
    private int yearsInPower;
    private String country;



    abstract String giveSpeech();

    public String printDetails() {
        return ("This leader is named " + getLeaderName() + ", they are " + getLeaderAge() + " years old." + "\n" + getLeaderName() + " has ruled over " +getCountry() + " for " + getYearsInPower() + " years");
    }

    // Constructor
    public Leader(String leaderName, int leaderAge, int yearsInPower, String country){
        this.leaderName = leaderName;
        this.leaderAge = leaderAge;
        this.yearsInPower = yearsInPower;
        this.country = country;
    }


    // Gets
    public String getLeaderName() {
        return leaderName;
    }

    public int getLeaderAge() {
        return leaderAge;
    }

    public int getYearsInPower() {
        return yearsInPower;
    }

    public String getCountry() {
        return country;
    }



}
