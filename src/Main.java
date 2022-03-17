public class Main {
    public static void main(String[] args) {
        //Входные данные
        int priceTicket = 1500;
        int numberTicket = 2;
        int priceBonus = 20;
        //Логика программы
        int bonusMiles;
        bonusMiles = priceTicket * numberTicket / priceBonus;
        System.out.println("Количество начисленных миль за купленный билет составляет - " + bonusMiles + " миль");

    }
}
