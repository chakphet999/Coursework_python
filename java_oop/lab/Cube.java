package lab;


public class Cube extends Object3D {
    private  double _edge;

    public Cube(String _name, Material _matType, double _edge){
        super(_name, _matType);
        this._edge = _edge;
    }
   

    public double getEdge(){
        return this._edge;
    }

     public double getVolume(){
        return _edge*_edge*_edge;
    }

    public double getSurface(){
        return 6*_edge*_edge;
    }

    
}
