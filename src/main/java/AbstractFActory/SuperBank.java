package AbstractFActory;

import AbstractFActory.Banking.BankingTeamFactory;

public class SuperBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDev();
        Tester tester = projectTeamFactory.tester();
        ProjectManager projectManager = projectTeamFactory.pm();

        System.out.println("Creating bank systen");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
