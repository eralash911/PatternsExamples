package AbstractFActory.Website;

import AbstractFActory.ProjectManager;

public class ProjectM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website manage");
    }
}
