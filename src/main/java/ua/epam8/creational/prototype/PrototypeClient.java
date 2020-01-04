package ua.epam8.creational.prototype;

public class PrototypeClient {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        MachineImage linuxVM = new MachineImage("Linux", "Symantec");
        MachineImage windowsVM = new MachineImage("Windows", "MacAfee");

        MachineImage webServer = linuxVM.clone();
        webServer.install(" + Web Server S/W");

        MachineImage webAppServer = webServer.clone();
        webAppServer.install(" + App Server S/W");

        MachineImage dbServer = linuxVM.clone();
        dbServer.install(" + Database Server S/W");

        MachineImage testMachine = windowsVM.clone();
        System.out.println("Конфигурация Веб-Сервера: ");
        webServer.printSw();
        System.out.println("Конфигурация Сервера приложений: ");
        webAppServer.printSw();
        System.out.println("Конфигурация Сервера БД");
        dbServer.printSw();
        System.out.println("Конфигурация Тестовой машины: ");
        testMachine.printSw();
    }
}
