package by.vorokhobko.chess.start;

import by.vorokhobko.chess.exceptions.ImposibleMoveException;
import by.vorokhobko.chess.models.Cell;
import by.vorokhobko.chess.models.Figure;

/**
 * Queen.
 *
 * Class Queen makes the class Figure wider in the implementation part 002, lesson test.
 * @author Evgeny Vorokhobko (vorokhobko2011@yandex.ru).
 * @since 15.05.2017.
 * @version 1.
 */
public class Queen extends Figure {
    /**
     * The class field.
     */
    private Cell[] distance;
    /**
     * Сreate name in the method Queen.
     * @param position - position.
     */
    public Queen(Cell position) {
        super(position);
    }
    /**
     * The method way, inherited from class Figure.
     * @param dist - dist.
     * @return tag.
     * @throws ImposibleMoveException tag.
     */
    public Cell[] way(Cell dist) throws ImposibleMoveException {
        int sourceX = getPosition().getX();
        int sourceY = getPosition().getY();
        int distX = dist.getX();
        int distY = dist.getY();
        if (Math.abs(distX - sourceX) == Math.abs(distY - sourceY) || distX == sourceX || distY == sourceY) {
            distance = moveFigure(dist);
        } else {
            throw new ImposibleMoveException("Queen not move that.");
        }
        return distance;
    }
    /**
     * The method a listing of all figures.
     * @param dist - dist.
     * @return tag.
     */
    public Figure clone(Cell dist) {
        return new Queen(dist);
    }
}