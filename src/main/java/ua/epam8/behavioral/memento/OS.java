package ua.epam8.behavioral.memento;

public class OS {
    private StringBuilder installedSw;

    public OS(String os) {
        installedSw = new StringBuilder(os);
    }

    public void install(String sw) {
        installedSw.append(" + " + sw);
        System.out.println(installedSw);
    }

    public RecoveryImage saveImage() {
        System.out.println("--Saved OS Image--");
        return new RecoveryImage(installedSw.toString());
    }

    public void restoreImage(RecoveryImage m) {
        installedSw = new StringBuilder(m.getSystemImage());
        System.out.println("--Restored OS Image--");
        System.out.println(installedSw);
    }
}
