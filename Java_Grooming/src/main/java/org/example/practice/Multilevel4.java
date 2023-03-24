package org.example.practice;

class SolarSystem{
    public String display(){
        return "Solar System";
    }
}
class Earth extends SolarSystem{
    public String display(){
        return "Earth is a planet";
    }
}
class Asia extends Earth{
    public String display(){
        return "Asia is a continent";
    }
    public String geoFeature(){
        return "South Asian Country";
    }
}
class India extends Asia{
    public String display(){
        return "India is a country";
    }
    public String show(){
        return "India is an Independent country";
    }
}
public class Multilevel4 {
    public static void main(String[] args) {
        India i=new India();
        System.out.println(i.display());
        System.out.println(i.geoFeature());
        System.out.println(i.show());
    }
}
