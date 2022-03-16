package AbstractFActory;

public interface ProjectTeamFactory {
    Developer getDev();
    Tester tester();
    ProjectManager pm();
}
