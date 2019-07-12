package entity.EnumCar;

public enum TypeCar {

        SLAVUTA("Slavuta"),
        TAVRIYA_NOVA("Tavriya_Nova"),
        VECTRA("Vectra"),
        ASTRA("Astra"),
        INSIGNIA("Insignia"),
        X3("X3"),
        X5("X5"),
        AVEO("Aveo"),
        OCTAVIA("Octavia"),
        MASKOTT("Maskott"),
        BENS("Bens"),
        DAILY("Daily"),
        OMNIEXPRESS("Omniexpress"),
        INTERLAZ_10LE("InterLAZ-10LE");


    private String type;

    TypeCar(String s) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


