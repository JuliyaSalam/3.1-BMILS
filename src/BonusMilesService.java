public class BonusMilesService {
    public int calculate(int cost) {
        int priceBonus = 20;
        int bonusMiles;
        bonusMiles = cost / priceBonus;
        return bonusMiles;
    }
}
