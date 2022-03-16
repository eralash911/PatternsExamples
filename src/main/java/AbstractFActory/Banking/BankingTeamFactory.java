package AbstractFActory.Banking;

import AbstractFActory.Developer;
import AbstractFActory.ProjectManager;
import AbstractFActory.ProjectTeamFactory;
import AbstractFActory.Tester;
import AbstractFActory.Website.ProjectM;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDev() {
        return new JavaDev();
    }

    @Override
    public Tester tester() {
        return new Qa();
    }

    @Override
    public ProjectManager pm() {
        return new ProjectM();
    }
}
