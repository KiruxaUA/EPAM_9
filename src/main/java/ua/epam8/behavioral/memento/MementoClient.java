package ua.epam8.behavioral.memento;

public class MementoClient {
    public static void main(String[] args) {
        OS os = new OS("Windows 10");
        os.install("Antivirus");

        RecoveryTool recoveryTool = new RecoveryTool();
        recoveryTool.addImage(os.saveImage());

        os.install("Tomcat Server");
        recoveryTool.addImage(os.saveImage());
        os.install("MySql");

        os.restoreImage(recoveryTool.getLastGoodImage());
        recoveryTool.deleteLastImage();

        os.restoreImage(recoveryTool.getLastGoodImage());
    }
}
