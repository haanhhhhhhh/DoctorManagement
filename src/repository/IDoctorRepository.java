
package repository;

import java.util.ArrayList;
import java.util.HashMap;
import model.Doctor;

public interface IDoctorRepository {

    void addDoctor(ArrayList<Doctor> ld);

    void updateDoctor(ArrayList<Doctor> ld);

    void deleteDoctor(ArrayList<Doctor> ld);

    void searchDoctor(ArrayList<Doctor> ld);
}
