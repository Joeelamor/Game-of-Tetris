import java.awt.*;

public class ShapeZ extends Shape {
    @Override
    public Shape rotateClockwise() {
        return null;
    }

    @Override
    public Shape rotateCounterClockwise() {
        return null;
    }

    public ShapeZ(int[][] shape) {
        super(shape);
    }

    public ShapeZ() {
        this.shape[0][0] = 4;
        this.shape[0][1] = 0;

        this.shape[1][0] = 5;
        this.shape[1][1] = 0;

        this.shape[2][0] = 5;
        this.shape[2][1] = 1;

        this.shape[3][0] = 6;
        this.shape[3][1] = 1;


        this.type = ShapeType.Z;
    }
}