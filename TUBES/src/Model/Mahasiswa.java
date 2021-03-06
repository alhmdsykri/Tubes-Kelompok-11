package Model;


import java.util.UUID;

/**
 *
 * @author Budhi
 */
 
 public class Mahasiswa extends Orang {
    
    private String kelas;
    private UUID tubes;
    
    public Mahasiswa(String nim, String nama, String kelas) {
        super(nim, nama, "mahasiswa");
        this.kelas = kelas;
        this.tubes = null;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public UUID getTubes() {
        return tubes;
    }

    public void setTubes(UUID tubes) {
        this.tubes = tubes;
    }  
}
