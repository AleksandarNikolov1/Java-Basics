package L01_First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P07_ProjectsCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int neededHoursPerProject = 3;
        String architectName = sc.nextLine();
        int projectsCount = Integer.parseInt(sc.nextLine());

        int neededHoursForAllProjects = projectsCount * neededHoursPerProject;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",
                architectName, neededHoursForAllProjects, projectsCount);
    }
}
