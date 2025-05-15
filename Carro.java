public class Carro {
    private String modelo;
    private Motor motor;
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
   
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
   
    
    public Motor getMotor() {
        return this.motor;
    }
    
    public void mostrarDetalhes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo de motor: " + motor.getTipo());
    }

}
