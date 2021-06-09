package net.greet;

public enum Languages {
    Afrikaans("Halo, "),
    English("Hello, "),
    Xhosa("Molo, ");

    String language;
     Languages(String language) {
         this.language = language;

    }
    public String getLanguage() {
        return language;
    }
}