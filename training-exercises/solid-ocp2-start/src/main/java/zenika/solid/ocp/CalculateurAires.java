package zenika.solid.ocp;

import java.util.List;

public class CalculateurAires {
    public double sommeAires(List<Figure> figures)
    {
        var area = 0d;
        for(Figure figure : figures) {
            if(figure instanceof Rectangle) {
                var rectangle = (Rectangle)figure;
                area += (rectangle.largeur * rectangle.longueur);
            } else if(figure instanceof Triangle) {
                var triangle = (Triangle)figure;
                area += (double)(triangle.base * triangle.hauteur) / 2;
            }
        }
        return area;
    }
}