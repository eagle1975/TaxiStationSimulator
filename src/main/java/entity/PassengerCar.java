package entity;

public class PassengerCar extends PassangerImpl {

    private String body;

    public PassengerCar(int id, CarModel model, String type, int productionYear, String color, int price, int registrationNumber, int numberOfPassengers, String body) {
        super(id, model, type, productionYear, color, price, registrationNumber, numberOfPassengers);

        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "id=" + getId() +
                ", carModel=" + getCarModel() +
                ", type='" + getType() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", registrationNumber=" + getRegistrationNumber() +
                ", numberOfPassengers=" + getNumberOfPassengers() +
                ", body='" + body + '\'' +
                '}';
    }
}
