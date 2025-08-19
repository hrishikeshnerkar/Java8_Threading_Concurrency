public enum PizzaSize {
    SMALL("Small Size"), MEDIUM("Medium size"), LARGE("Large size");

    private String pizzaSizeText;

    PizzaSize(String pizzaSizeText){
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }

}
