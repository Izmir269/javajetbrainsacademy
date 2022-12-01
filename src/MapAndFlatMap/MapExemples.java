package MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapExemples {
    public static void main(String[] args) {
        List<Double> numbers = List.of(6.28, 5.42, 84.0, 26.0);

        // Divisons chaque élément par 2
        List<Double> famousNumbers = numbers.stream()
                .map(number -> number / 2) // divide each number in the stream by 2
                .collect(Collectors.toList()); // collect transformed numbers to a new list

        // Map est souvent utilisé pour avoir un stream de propriétés à partir d'un stream d'objets
        // Dans l'exemple ci-dessous on a des objets Job ayant comme propriétés title, description, salary
        // Obtenir une liste des jobs
        List<Job> jobs = List.of(
                new Job("Développeur javascript", "developement frontend", 2000),
                new Job("Développeur Java", "developement backend", 2200),
                new Job("Développeur fullstack", "developement transverse", 2500)
        );
        List<String> jobsTitles = jobs.stream()
                .map(Job::getTitle)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(jobsTitles);

        // Liste d'objets à partir d'une liste d'autres objets
        // We would like to get a list of AccountInfo objects from a list of Account objects.
        User Izmir = new User(1, "Izmir", "Zoubert");
        User Richard = new User(2, "Richard", "Abdou");

        List<Account> accounts = List.of(
                new Account(1, false, Izmir),
                new Account(2, false, Richard)
        );
        List<AccountInfo> infoList = accounts.stream()
                .map(acc -> {
                    AccountInfo info = new AccountInfo();
                    info.setId(acc.getId());
                    String ownerFirstName = acc.getOwner().getFirstName();
                    String ownerLastName = acc.getOwner().getLastName();
                    info.setOwnerFullName(ownerFirstName + " " + ownerLastName);
                    return info;
                }).collect(Collectors.toList());
        for (AccountInfo accountInfo : infoList) {
            System.out.println(accountInfo.getId());
            System.out.println(accountInfo.getOwnerFullName());
        }
    }
}

