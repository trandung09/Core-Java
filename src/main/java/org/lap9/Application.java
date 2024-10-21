package org.lap9;

import org.lap9.models.Class;
import org.lap9.models.TechMaster;

import java.io.IOException;

public class Application {

    public void application() throws IOException {

        Class clazz = new Class("Spring Boot");
        TechMaster techMaster = new TechMaster("Tien Dat", "Duc Thinh", clazz);

        TechMasterManager techMasterManager = TechMasterManager.getInstance();
        techMasterManager.setTechMaster(techMaster);
    }

    public static void main(String[] args) {

    }
}
