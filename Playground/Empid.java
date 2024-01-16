package JavaFun.Playground;

public class Empid{
    String name;
    int id;
    int dept;
    public Empid(String passedName,int passedId,int passedDept)
    {
        name = passedName;
        id = passedId;
        dept = passedDept;
    }
    public void setEmpid(String passedName,int passedId,int passedDept)
    {
        name = passedName;
        id = passedId;
        dept = passedDept;
    }
    public int getEmpid()
    {
        return id;
    }
    public int getDept()
    {
        return dept;
    }
}
