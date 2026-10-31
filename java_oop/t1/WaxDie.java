package t1;

public class WaxDie extends Cube implements Comparable<Object3D>, Meltable {
    public WaxDie(String _name, double _edge) {
        super(_name, Material.Wax, _edge);
    }

    @Override
    public int compareTo(Object3D o) {
        double v1 = this.getVolume();
        double v2 = o.getVolume();
        if (v1 < v2) {
            return -1;
        } else if (v1 > v2) {
            return 1;
        } else {
            return this.getName().compareTo(o.getName());
        }
    }

    @Override
    public Object3D convertToOtherShape() {
        double volume = this.getVolume();
        double radius = Math.cbrt((3 * volume) / (4 * PI));
        return new Sphere(getName(), getMaterial(), radius);
    }
}
