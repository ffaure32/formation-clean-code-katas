package zenika.solid.srp;

import java.awt.*;

public class AWTRectanglePlotter implements Plotter {
    private final Rectangle rectangle;

    public AWTRectanglePlotter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw(Graphics graphics) {
        //top horizontal line
        graphics.drawLine(
                rectangle.getTopLeft().x, rectangle.getTopLeft().y,
                rectangle.getBottomRight().x, rectangle.getTopLeft().y
        );
        //bottom horizontal line
        graphics.drawLine(
                rectangle.getTopLeft().x, rectangle.getBottomRight().y,
                rectangle.getBottomRight().x, rectangle.getBottomRight().y
        );
        //left vertical line
        graphics.drawLine(
                rectangle.getTopLeft().x, rectangle.getTopLeft().y,
                rectangle.getTopLeft().x, rectangle.getTopLeft().y - rectangle.heigth()
        );
        //right vertical line
        graphics.drawLine(
                rectangle.getBottomRight().x, rectangle.getBottomRight().y - rectangle.heigth(),
                rectangle.getBottomRight().x, rectangle.getBottomRight().y
        );
    }

}