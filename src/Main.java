import World.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        World mir = new World();
        mir.addWiseacres(new Wiseacre("Хотабыч"));
        mir.addWiseacres(new Wiseacre("Дамблдор"));
        mir.addWiseacres(new Wiseacre("Подаван"));

        mir.addTowns(new Town("Новый город", "Моское дно"));
        mir.addTowns(new Town("Новая Атлантида", "Моское дно"));
        mir.addMines(new Mine("Пещера", Resources.STONE, 200, "Морское дно"));
        mir.addMines(new Mine("Лужа протоплазмы", Resources.PROTOPLASM, 57, "Морское дно"));
        mir.addMines(new Mine("Залежи клеточной массы", Resources.CELLMASS, 34, "Морское дно"));

        try {
            mir.go();
        } catch (ErrorInTheNumberOfWisearces e) {
            System.out.println(e.getMessage());
        }
    }
}
