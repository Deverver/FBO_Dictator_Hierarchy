import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DictatorSimulator {
    public static void main(String[] args) {

        //region Creates and shuffles a List ArrayList of Leader Objects
        List<Leader> leadersList = new ArrayList<>();
        leadersList.add(new MilitaryDictator("Viktor Ivanov", 63, 18, "Zarovia", "General of the Armed Forces"));
        leadersList.add(new MilitaryDictator("Thabo Kalu", 58, 12, "Malkara", "Field Marshal"));
        leadersList.add(new MilitaryDictator("Santiago Cortez", 67, 15, "Nueva Isla", "Admiral of the Fleet"));
        leadersList.add(new MilitaryDictator("Eshaya Bakari", 52, 7, "Tambura", "Colonel"));
        leadersList.add(new MilitaryDictator("Yoshiro Takeda", 70, 25, "Aoshima", "Supreme Commander"));

        leadersList.add(new PoliticalDictator("Raul Vargas", 60, 20, "Rio Nacion", "National Unity Front", "President"));
        leadersList.add(new PoliticalDictator("Isabella Mancini", 55, 10, "San Felice", "People's Progressive Alliance", "Premier"));
        leadersList.add(new PoliticalDictator("Lin Guang", 74, 30, "Harboria", "Revolutionary Workers' Party", "Chairman"));
        leadersList.add(new PoliticalDictator("Faisal Durrani", 50, 8, "Azamar", "National Stability Coalition", "Prime Leader"));
        leadersList.add(new PoliticalDictator("Elena Kravchuk", 63, 17, "Galeska", "Unity and Order Party", "Supreme Chancellor"));
        Collections.shuffle(leadersList);
        //endregion

        for (Leader leader : leadersList) {
            String leaderPolicy = "Legal smear campaigns!";
            if (leader instanceof MilitaryDictator) {
                leaderPolicy = "Military doctrine 2.0!";
            }
            PowerActions leaderAction = (PowerActions) leader;


            System.out.println(leader.printDetails());
            System.out.println(" ");
            System.out.println(leaderAction.holdParade());
            System.out.println(leader.giveSpeech());
            System.out.println(leaderAction.implementPolicy(leaderPolicy));
            System.out.println(leaderAction.repressOpposition());
            System.out.print("----------------------------------------------------------------------------------------------------------------------");
        }


    }// main End
}// Main End