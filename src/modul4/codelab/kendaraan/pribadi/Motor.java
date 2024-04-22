package modul4.codelab.kendaraan.pribadi;

import modul4.codelab.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    @Override
    public void Start() {
            System.out.println("Motor " + this.getName() + " dinyalakan");
    }

    @Override
    public void Stop() {
        System.out.println("Motor " + this.getName() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
