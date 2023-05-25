import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest {

    @Test
    public void testCreatePlanet() {
        Planet planet = new Planet(5, 6);

        assertEquals(5, planet.getLengthX());
        assertEquals(6, planet.getLengthY());
    }

    @Test
    public void testCreateRockWithinLowerBounds() {
        Planet planet = new Planet(3, 4);
        planet.createRock(0, 0);
        Rock rock = planet.getRocks().get(0);

        assertEquals(0, rock.getPositionX());
        assertEquals(0, rock.getPositionY());
    }

    @Test
    public void testCreateRockWithinUpperBounds() {
        Planet planet = new Planet(3, 4);
        planet.createRock(3, 4);
        Rock rock = planet.getRocks().get(0);

        assertEquals(3, rock.getPositionX());
        assertEquals(4, rock.getPositionY());
    }

    @Test
    public void testCreateRockBelowBounds() {
        Planet planet = new Planet(3, 4);
        planet.createRock(-1, -1);
        Rock rock = planet.getRocks().get(0);

        assertEquals(3, rock.getPositionX());
        assertEquals(4, rock.getPositionY());
    }

    @Test
    public void testCreateRockAboveBounds() {
        Planet planet = new Planet(3, 4);
        planet.createRock(4, 5);
        Rock rock = planet.getRocks().get(0);

        assertEquals(0, rock.getPositionX());
        assertEquals(0, rock.getPositionY());
    }
}