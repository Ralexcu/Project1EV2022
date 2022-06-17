package BackEnd;
public class User {
    String nickname;
    int vidas; 
    Vehiculo[] vehiculo;
    int victorias;
    int oro;
    public User(String nickname){
        this.nickname = nickname;
        this.vidas = 3;
        this.vehiculo = new Vehiculo[10];
        this.oro = 100;
        this.victorias = 0;
    }  

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public Vehiculo[] getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
    
}
