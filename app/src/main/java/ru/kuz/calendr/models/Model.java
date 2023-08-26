package ru.kuz.calendr.models;

public class Model {
    public String URL_image, label;

    // public Model model = new Model("url", "mouse");

    public Model(String URL_image, String label) {
        this.URL_image = URL_image;
        this.label = label;
    }

    // public Model model = new Model();
    public Model() {
    }
}
