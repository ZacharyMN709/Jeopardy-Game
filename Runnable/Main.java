import Objects.BoardData;
import Objects.TeamData;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean override = false;
        Scanner i = new Scanner(System.in);
        String loc;
        int teams;
        Path filePath;

        Path cur = Paths.get("");
        filePath = Paths.get(cur.toAbsolutePath().toString(), "Question Bank");
        loc = filePath.toString();
        System.out.println(loc);

        if (override) {
            teams = 6;
        } else {
            System.out.print("Please enter the number of teams: ");
            teams = i.nextInt();
            i.nextLine();
            System.out.println();
            System.out.println();
        }
        System.out.println("Choose a bank: ");
        File[] banks = new File(loc).listFiles();

        //Gets the different game set-ups and has the user choose one, and then set dirs to all the categories found
        ArrayList<File> dirs = enumerateDirectories(banks, true);
        if (override) { banks = dirs.get(1).listFiles(); }
        else {
            System.out.print("Please choose which question bank you would like to use: ");
            System.out.println("");
            banks = dirs.get(i.nextInt() - 1).listFiles();
            i.nextLine();
        }
        ArrayList<File> categories = enumerateDirectories(banks, false);

        // Sets up the board and passes the data to the Jeopardy Object
        BoardData boardData = new BoardData(categories);
        TeamData[] teamData = new TeamData[teams];
        if (!boardData.isValid()) {
            System.out.println("Something went wrong! Please check the logs to see what needs to be fixed.");
            System.out.println("Ending program...");
        }
        else {
            for(int x=0; x<teams; x++){
                if(override) {
                    teamData[x] = new TeamData("Team " + x, x);
                } else {
                    System.out.print("Enter team name: ");
                    String name = i.nextLine();
                    teamData[x] = new TeamData(name, x);
                }
            }

            System.out.println("Everything is good! Setting up your game...");
            boardData.setUp();
            new Jeopardy(boardData, teamData, override);
        }


    }


    public static ArrayList<File> enumerateDirectories(File[] files, boolean prt){
        ArrayList<File> dirs = new ArrayList<>();
        for (File file : files) { if (file.isDirectory()) {dirs.add(file);} }
        if (prt) {
            for (int x=0; x < dirs.size(); x++) { System.out.println((x+1) + ")  " + dirs.get(x).getName()); }
            System.out.println("");
        }
        return dirs;
    }
}
