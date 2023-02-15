public class Perro {

    //Atributos
    private String nombre;
    private String raza;
    private Double peso;
    private Integer anioNacimiento;
    private Boolean lastimado;
    private Boolean chip;

    //Contructor

    public Perro(String nombre, String raza, Double peso, Integer anioNacimiento, Boolean lastimado, Boolean chip) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.anioNacimiento = anioNacimiento;
        this.lastimado = lastimado;
        this.chip = chip;
    }


    //Metodo

    public Boolean adoptable() {
        return (!this.lastimado && this.peso > 5.0);
    }

//    public Boolean adoptable() {
//        if (this.lastimado && this.peso > 5.0){
//            return true;
//        }
//        return false;
//    }

    public Boolean sePuedeEncontrar(){
        return chip;
    }

    public Integer edad() {
        return 2022 - anioNacimiento;
    }
}
