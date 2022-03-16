package AbstractFActory.Website;

import AbstractFActory.Developer;
import AbstractFActory.ProjectManager;
import AbstractFActory.ProjectTeamFactory;
import AbstractFActory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDev() {
        return new PhpDeveloper();
    }

    @Override
    public Tester tester() {
        return new ManTester();
    }

    @Override
    public ProjectManager pm() {
        return new ProjectM();
    }
}
