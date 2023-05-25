import java.util.ArrayList;

public class Rover {

    private int positionX;
    private int positionY;
    private Direction direction;
    private Planet planet;

    public Rover() {

    }

    public enum Direction {
        N, S, E, W
    }

    public void land(Planet planet, int positionX, int positionY, Direction direction) throws IllegalArgumentException {
        this.planet = planet;
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;

        if (positionX < 0 || positionY < 0) {
          throw new IllegalArgumentException("Cannot have negative position");
        }

        if (positionX > planet.getLengthX() || positionY > planet.getLengthY()){
          throw new IllegalArgumentException("Cannot have negative position");
        }
    }

    public boolean scanForRock() {
        ArrayList<Rock> rocks = planet.getRocks();

        for (int i = 0; i < rocks.size(); i++) {
          Rock rock = rocks.get(i);
          if (rock.getPositionX() == positionX && rock.getPositionY() == positionY) {
            return true;
          }
        }
        return false;
    }

    public void moveForward() {

        if (direction == Direction.N) {
          this.positionY += 1;
        }

        if (direction == Direction.W) {
          this.positionX -= 1;
        }

        if (direction == Direction.E) {
          this.positionX += 1;
        }

        if (direction == Direction.S) {
          this.positionY -= 1;
        }

        fixupPosition();
    }

    private void fixupPosition() {
      if (positionX > planet.getLengthX()) {
        positionX = 0;
      } else if (positionX == -1) {
        positionX = planet.getLengthX();
      }
      if (positionY > planet.getLengthY()) {
        positionY = 0;
      } else if (positionY == -1) {
        positionY = planet.getLengthY();
      }
    }

    public void moveBackward() {
        switch (direction) {
          case N:
            this.positionY -= 1;
            break;
          case S:
            this.positionY += 1;
            break;
          case E:
            this.positionX -= 1;
            break;
          case W:
            this.positionX += 1;
            break;
      }

      fixupPosition();
    }

    public void turnLeft() {
      switch (direction) {
        case N -> this.direction = Direction.W;
        case S -> this.direction = Direction.E;
        case E -> this.direction = Direction.N;
        case W -> this.direction = Direction.S;
      }
    }

    public void turnRight() {
      switch (direction) {
        case N -> this.direction = Direction.E;
        case S -> this.direction = Direction.W;
        case E -> this.direction = Direction.S;
        case W -> this.direction = Direction.N;
      }
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction getDirection() {
        return direction;
    }

    public Planet getPlanet() {
        return planet;
    }
}
