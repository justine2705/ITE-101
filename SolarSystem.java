public class SolarSystem {
    public static void main(String[] args) {
        CelestialBody sun = new CelestialBody(0, 0, 1000);
        CelestialBody earth = new CelestialBody(100, 0, 1);

        double G = 6.6743e-11;

        for (int i = 0; i < 1000; i++) {
            double distance = Math.sqrt(Math.pow(sun.x - earth.x, 2) + Math.pow(sun.y - earth.y, 2));

            double force = G * sun.mass * earth.mass / (distance * distance);

            double acceleration = force / earth.mass;

            earth.vx += acceleration * (sun.x - earth.x) / distance;
            earth.vy += acceleration * (sun.y - earth.y) / distance;
            earth.x += earth.vx;
            earth.y += earth.vy;

            System.out.println("Earth's position: (" + earth.x + ", " + earth.y + ")");
        }
    }

    static class CelestialBody {
        double x, y, vx, vy, mass;

        CelestialBody(double x, double y, double mass) {
            this.x = x;
            this.y = y;
            this.mass = mass;
            this.vx = 0;
            this.vy = 1;
        }
    }
}
