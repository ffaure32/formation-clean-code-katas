package zenika.solid.ocp;

import java.util.List;

public class CalculateurPerimetres {
    public double sommePerimetres(List<Figure> figures)
    {
        var perimeter = 0d;
        for(Figure figure : figures) {
            if(figure instanceof Rectangle) {
                var rectangle = (Rectangle)figure;
                perimeter += (rectangle.largeur + rectangle.longueur) * 2;
            } else if(figure instanceof Triangle) {
                var triangle = (Triangle)figure;
                perimeter += (triangle.base + triangle.cote2 + triangle.cote3);
            }
        }
        return perimeter;
    }
}