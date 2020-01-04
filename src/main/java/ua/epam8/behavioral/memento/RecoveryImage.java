package ua.epam8.behavioral.memento;

public class RecoveryImage {
    private String image;

    RecoveryImage(String image) {
        this.image = image;
    }

    String getSystemImage() {
        return image;
    }
}
