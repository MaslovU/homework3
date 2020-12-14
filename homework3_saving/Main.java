package homework3.homework3_saving;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder logs = new StringBuilder();
        FileWriter forLogs;

        GameProgress player1 = new GameProgress(10, 15, 5, 50.3);
        logs.append("\n player1 is created");
        GameProgress player2 = new GameProgress(7, 12, 6, 41.7);
        logs.append("\n player2 is created");
        GameProgress player3 = new GameProgress(10, 17, 10, 11);
        logs.append("\n player3 is created");

        String filename1 = "src/main/java/homework3/homework3_setting/Games/savegames/save1.dat";
        String filename2 = "src/main/java/homework3/homework3_setting/Games/savegames/save2.dat";
        String filename3 = "src/main/java/homework3/homework3_setting/Games/savegames/save3.dat";
        List<String> srcFiles = Arrays.asList(filename1, filename2, filename3);

        GameProgress.saveGame(filename1, player1);
        logs.append("\n progress for player1 is saved");
        GameProgress.saveGame(filename2, player2);
        logs.append("\n progress for player2 is saved");
        GameProgress.saveGame(filename3, player3);
        logs.append("\n progress for player3 is saved");

        GameProgress.zipGame(srcFiles);
        logs.append("\n data for all players is archived");

        if (
                new File(filename1).delete() &&
                        new File(filename2).delete() &&
                        new File(filename3).delete()) {
            System.out.println("Success");
        } else {
            System.out.println("Cannot delete this files. Try again");
        }

        forLogs = new FileWriter("src/main/java/homework3/homework3_setting/Games/temp.txt", true);
        String stringLogs = logs.toString();
        forLogs.write(stringLogs);
        forLogs.flush();
    }
}
