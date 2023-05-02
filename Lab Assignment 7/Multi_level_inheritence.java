
class Plate {
    double length = 0;
    double bredth = 0;

    Plate(double l, double b) {
        length = l;
        bredth = b;
        System.out.println("This is constructor which takes two parameters as input :- length and bredth\n");
    };
}

class Box extends Plate {
    double height = 0;

    Box(double h, double l, double b) {
        super(l, b);
        height = h;
        System.out.println("This is a constructor which takes three parameters as input :- length, bredth , height\n");
    }
}

class WoodBox extends Box {
    double thick = 0;

    WoodBox(double l, double b, double h, double t) {
        super(l, b, h);
        System.out.println(
                "This is a constructor which takes four parameters as input :- length, bredth , height, thick\n");
    }
}

public class Multi_level_inheritence {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 8, 6, 2);

    }
}
