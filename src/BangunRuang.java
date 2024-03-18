package modul3.codelab;

public class BangunRuang {
    private String name;

    BangunRuang(String namee){
        this.name = namee;
    }

    public void inputNilai(){
        System.out.print("Input nilai: ");
    }

    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun" + name);
    }

    public void volume(){
        System.out.println("Menghitung volume bangun" + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
