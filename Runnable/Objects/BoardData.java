package Objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BoardData {

    private boolean valid;
    private ArrayList<File> dirs = new ArrayList<>();
    private File[][] txts = new File[6][5];
    private int[][] pts = new int[6][5];
    private String[] categories = new String[6];
    private QuestionData[][] questionData = new QuestionData[6][5];



    public BoardData(ArrayList<File> dirs) {
        this.valid = checkValidity(dirs);
    }

    public String[] getCategories() {
        return categories;
    }

    public QuestionData getQuestion(int col, int row) {
        return questionData[col][row];
    }

    public boolean isValid() {
        return valid;
    }

    public void setUp() {
        for (int x=0; x < 6; x++) { categories[x] = dirs.get(x).getName(); }
        for (int col=0; col < 6; col++) {
            for (int row=0; row < 5; row++) {
                Scanner in = null;
                try { in = new Scanner(txts[col][row]); }
                catch (FileNotFoundException e) { e.printStackTrace(); }

                questionData[col][row] = new QuestionData(in.nextLine(), in.nextLine(), categories[col], pts[col][row]);
                in.close();
            }
        }
    }


    //Checks to make sure all questionData exist for the game
    public boolean checkValidity(ArrayList<File> d){
        if(!validLength(d)) {return false;}
        if(!validCategories()){return false;}
        return true;
    }

    public boolean validLength(ArrayList<File> d) {
        //Randomizes the categories, or breaks if there are too few categories
        if (d.size() < 6) {
            print("Error, insufficient categories! Please either:");
            print("--> Choose another question bank.");
            print("--> Add categories to the chosen directory, before re-running the program.");
            print("");
            print("Ending program...");
            return false;
        } else {
            Collections.shuffle(d);
            for (int x = 0; x < 6; x++) { dirs.add(d.get(x)); }
            return true;
        }
    }

    public boolean validCategories() {
        boolean setup = true;
        for(int x=0; x < 6; x++) {
            File file = dirs.get(x);
            print(file.getName() + ":");
            boolean a = validCategory(file, x);

            if (a) { print("No issues!"); }
            else { print(file.getName() + " has an issue! See above for details."); }
            print("");

            setup = (setup && a);
        }

        print("");
        return setup;
    }


    //Checks to make sure that the category sub-folder is valid
    public boolean validCategory(File file, int col) {
        boolean safe = true;

        //Check to make sure the folder isn't empty
        File[] f = file.listFiles();
        if (f == null) {
            print(file.getName() + " is empty!");
            return false;
        }

        //Make a list of filenames
        ArrayList<File> files = new ArrayList<>(Arrays.asList(f));
        ArrayList<String> filenames = new ArrayList<>();
        for (File x : files) {filenames.add(x.getName());}

        //Check to make sure key folders exist in the filenames, and they have questionData
        for (int x=0; x<5; x++) {
            int i = filenames.indexOf(String.valueOf(100+(x*100)));
            if (i != -1) {
                safe = (validTerminal(files.get(i), col, x) && safe);
            }
            else {
                print(file.getName() + " does not contain a folder for " + x + " point questions!");
                safe = false;
            }
        }

        return safe;
    }

    //Checks to make sure terminal folders contain questionData
    public boolean validTerminal(File file, int col, int row){
        ArrayList files = cleanedTerminal(file);
        if (files.size() != 0) {
            txts[col][row] = (File) files.get(rand(0, files.size()-1));
            pts[col][row] = Integer.parseInt(file.getName());
            return true;
        } else {
            print("There are no " + file.getName() + " point questionData!");
            return false;
        }
    }


    public ArrayList<File> cleanedTerminal(File file){
        File[] f = file.listFiles();
        if (f == null) { return new ArrayList<>(); }
        ArrayList<File> files = new ArrayList<>(Arrays.asList(f));
        ArrayList<String> filenames = new ArrayList<>();
        for (File x : files) {filenames.add(x.getName());}
        int x = filenames.indexOf("desktop.ini");
        if (x != -1) {files.remove(x);}
        return files;
    }

    public static int rand(int min, int max){
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static void print(Object s){
        System.out.println( s );
    }

}
