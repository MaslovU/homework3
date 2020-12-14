package homework3.homework3_loading;

import homework3.homework3_saving.GameProgress;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder logs = new StringBuilder();
        FileWriter forLogs;

        String pathToZip = "src/main/java/homework3/homework3_setting/Games/savegames/saveZip.zip";
        String pathToUnZip = "src/main/java/homework3/homework3_loading/unzip";
        String pathSave1 = "src/main/java/homework3/homework3_loading/unzipsave1.dat";

        FileHandler.openZip(pathToZip, pathToUnZip);
        logs.append("\n data for all players is unarchived");

        GameProgress player1 = FileHandler.openProgress(pathSave1);
        logs.append("\n reading data for player1");

        System.out.println(player1);

        forLogs = new FileWriter("src/main/java/homework3/homework3_setting/Games/temp.txt", true);
        String stringLogs = logs.toString();
        forLogs.write(stringLogs);
        forLogs.flush();
    }
}
