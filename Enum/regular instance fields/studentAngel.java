interface Student {
    boolean isPhDAndMcSAndBsC();
}

enum StudentEnum implements Student {
    Angel(true),
    Marin(true),  
    Miglena(true),
    Dobromira(true),
    Zhechka(true),  
    Rositsa(true),
    Todor(false),
    Mihail(false),  
    Nikolai(false),
    Sava(true),
    Goran(true);

    private final boolean isPhDAndMcSAndBsC;
    
    private StudentEnum(boolean isPhDAndMcSAndBsC) {
        this.isPhDAndMcSAndBsC = isPhDAndMcSAndBsC;
    }

    @Override
    public boolean isPhDAndMcSAndBsC() {
        return isPhDAndMcSAndBsC;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = StudentEnum.Angel;
        System.out.println("Is " + student + " pursuing a PhD, MsC, and BsC? " + student.isPhDAndMcSAndBsC());
    }
}
