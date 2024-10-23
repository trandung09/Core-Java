package org.lap9.bttl1;

import lombok.Getter;
import lombok.Setter;
import org.lap9.bttl1.models.Student;
import org.lap9.bttl1.models.TechMaster;
import org.lap9.bttl1.services.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Setter
@Getter
public class TechMasterManager {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private TechMaster techMaster;
    private final StudentService sService = StudentService.getInstance();

    private TechMasterManager() {
        techMaster = new TechMaster();
    }

    public void addStudent() throws IOException {
        Student student = sService.getStudent(br);
        techMaster.getClazz().addStudent(student);
    }

    public void updateAcademicAbilityOfStudent(int id, String academicAbility) {
        techMaster.getClazz()
                .updateAcademicAbilityOfStudent(id, academicAbility);
    }

    public void removeStudent(int id) {
        techMaster.getClazz().removeStudent(id);
    }

    public static TechMasterManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final TechMasterManager INSTANCE = new TechMasterManager();
    }
}
