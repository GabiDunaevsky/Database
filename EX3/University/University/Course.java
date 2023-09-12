package University;

/**
 * Created by Avigail on 5/20/2017.
 */
public  class Course {
    private String name;
    private float units;
    private int id;

    public Course(int id,String name, float units )
    {
        this.id = id;
        this.name = name;
        this.units = units;
    }

    public  String getName() {
        return this.name;
    };
    public  float getUnits() {
        return this.units;
    };
    public  int getId(){
        return this.id;
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setUnits(float units) {
        this.units = units;
    }

    public void setId(int id) {
        this.id = id;
    }
}
