package homework3.homework3_loading;

import homework3.homework3_saving.GameProgress;

public class Main {
    public static void main(String[] args) {
        String pathToZip = "src/main/java/homework3/homework3_setting/Games/savegames/saveZip.zip";
        String pathToUnZip = "src/main/java/homework3/homework3_loading/unzip";
        String pathSave1 = "src/main/java/homework3/homework3_loading/unzipsave1.dat";

        FileHandler.openZip(pathToZip, pathToUnZip);

        GameProgress player1 = FileHandler.openProgress(pathSave1);

        System.out.println(player1);
    }
}
