public enum Student {
    Angel(false),
    Marin(false),  
    Miglena(false),
    Dobromira(false),
    Zhechka(false),  
    Rositsa(false),
    Todor(false),
    Mihail(false),  
    Nikolai(false),
    Sava(true),
    Goran(true);

    private final boolean isPhD;
    
    private Student(final boolean isPhD) {
        this.isPhD = isPhD;
    }

    public boolean isPhD() {
        return isPhD;
    }

    public boolean isMcS() {
        return this == Todor || this == Mihail || this == Nikolai;
    }

    public boolean isBsC() {
        return this == Angel || this == Marin || this == Miglena || this == Dobromira ||
               this == Zhechka || this == Rositsa;
    }
}
