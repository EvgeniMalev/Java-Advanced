interface Student {
    boolean isPhD();
    boolean isMcS();
    boolean isBsC();
}

enum StudentEnum implements Student {
    Angel(false, false, true),
    Marin(false, false, true),  
    Miglena(false, false, true),
    Dobromira(false, false, true),
    Zhechka(false, false, true),  
    Rositsa(false, false, true),
    Todor(true, true, false),
    Mihail(true, true, false),  
    Nikolai(true, true, false),
    Sava(true, true, true),
    Goran(true, true, true);

    private final boolean isPhD;
    private final boolean isMcS;
    private final boolean isBsC;
    
    private StudentEnum(boolean isPhD, boolean isMcS, boolean isBsC) {
        this.isPhD = isPhD;
        this.isMcS = isMcS;
        this.isBsC = isBsC;
    }

    @Override
    public boolean isPhD() {
        return isPhD;
    }

    @Override
    public boolean isMcS() {
        return isMcS;
    }

    @Override
    public boolean isBsC() {
        return isBsC;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = StudentEnum.Angel;
        System.out.println("Is " + student + " pursuing a PhD? " + student.isPhD());
        System.out.println("Is " + student + " an McS student? " + student.isMcS());
        System.out.println("Is " + student + " a BsC student? " + student.isBsC());
    }
}
