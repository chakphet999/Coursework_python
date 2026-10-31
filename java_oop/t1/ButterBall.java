package t1;


public class ButterBall extends Sphere implements Comparable<Object3D>, Meltable {

    public ButterBall(String _name, double _radius) {
        super(_name, Material.Butter, _radius);
    }

    @Override
    public int compareTo(Object3D o) {
        double s1 = this.getSurface();
        double s2 = o.getSurface();

        if (s1 < s2) {
            return -1;
        } else if (s1 > s2) {
            return 1;
        } else {
            return this.getName().compareTo(o.getName());
        }
    }

    @Override
    public Object3D convertToOtherShape() {
        double volume = this.getVolume();
        double edge = Math.cbrt(volume);

        return new Cube(getName(), getMaterial(), edge);
    }
}
